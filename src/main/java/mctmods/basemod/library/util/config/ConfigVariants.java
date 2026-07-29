package mctmods.basemod.library.util.config;

import mctmods.basemod.Basemod;
import mctmods.basemod.blocks.meta.EnumMaterials1;
import mctmods.basemod.blocks.meta.EnumMaterials2;
import mctmods.basemod.blocks.meta.EnumOre1;
import mctmods.basemod.blocks.meta.EnumOre2;
import mctmods.basemod.blocks.meta.EnumOre3;
import mctmods.basemod.blocks.meta.EnumOre4;
import mctmods.basemod.blocks.meta.EnumOreCracked1;
import mctmods.basemod.blocks.meta.EnumOreCracked2;
import mctmods.basemod.blocks.meta.EnumOreCracked3;
import mctmods.basemod.blocks.meta.EnumSheetMetal1;
import mctmods.basemod.blocks.meta.EnumSheetMetal2;
import mctmods.basemod.items.meta.EnumFood;
import mctmods.basemod.items.meta.EnumMaterials;
import mctmods.basemod.registry.Registry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class ConfigVariants {
    private static final int VERSION = 1;
    private static final String COMMENT = "Sparse overrides. Add an entry per variant name, e.g. \"iron_dust\": { \"maxSize\": 16, \"oreDict1\": \"dustIron\" }";
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final Map<IVariantOre, ResourceLocation> PENDING_DROP1 = new HashMap<>();
    private static final Map<IVariantOre, ResourceLocation> PENDING_DROP2 = new HashMap<>();
    private static final Map<IVariantFood, String> PENDING_POTION = new HashMap<>();
    private static File directory;

    public static void load(File configDirectory) {
        directory = new File(configDirectory, "mct_basemod");
        if(!directory.exists() && !directory.mkdirs()) {
            Basemod.logger.error("Could not create config directory {}", directory);
            return;
        }

        Registry.preload();

        loadFile("ore1", EnumOre1.values(), true);
        loadFile("ore2", EnumOre2.values(), true);
        loadFile("ore3", EnumOre3.values(), true);
        loadFile("ore4", EnumOre4.values(), true);
        loadFile("ore_cracked1", EnumOreCracked1.values(), true);
        loadFile("ore_cracked2", EnumOreCracked2.values(), true);
        loadFile("ore_cracked3", EnumOreCracked3.values(), true);
        loadFile("sheet_metal1", EnumSheetMetal1.values(), true);
        loadFile("sheet_metal2", EnumSheetMetal2.values(), true);
        loadFile("block_materials1", EnumMaterials1.values(), true);
        loadFile("block_materials2", EnumMaterials2.values(), true);
        loadFile("foods", EnumFood.values(), true);
        loadFile("materials", EnumMaterials.values(), false);
    }

    public static void resolveDeferred() {
        for(Map.Entry<IVariantOre, ResourceLocation> entry : PENDING_DROP1.entrySet()) {
            Block block = resolveBlock(entry.getValue());
            if(block != null) { entry.getKey().setBlockDrop1(block); }
        }

        for(Map.Entry<IVariantOre, ResourceLocation> entry : PENDING_DROP2.entrySet()) {
            Block block = resolveBlock(entry.getValue());
            if(block != null) { entry.getKey().setBlockDrop2(block); }
        }

        for(Map.Entry<IVariantFood, String> entry : PENDING_POTION.entrySet()) {
            entry.getKey().setPotion(parsePotion(entry.getValue(), entry.getKey()));
        }

        PENDING_DROP1.clear();
        PENDING_DROP2.clear();
        PENDING_POTION.clear();
    }

    private static <T extends IVariantBase> void loadFile(String fileName, T[] variants, boolean writeDefaults) {
        File file = new File(directory, fileName + ".json");
        boolean exists = file.exists();
        JsonObject root = read(file);
        if(root == null) { return; }

        for(T variant : variants) {
            JsonElement element = root.get(variant.getName());
            if(element != null && element.isJsonObject()) { apply(variant, element.getAsJsonObject(), fileName); }
        }

        if(!writeDefaults && exists) { return; }

        root.addProperty("_version", VERSION);
        if(writeDefaults) {
            for(T variant : variants) { root.add(variant.getName(), dump(variant)); }
        }
        else { root.addProperty("_comment", COMMENT); }
        write(file, root);
    }

    private static void apply(IVariantBase variant, JsonObject json, String fileName) {
        if(json.has("rarity")) { variant.setRarity(parseRarity(json.get("rarity").getAsString(), variant, fileName)); }
        if(json.has("maxSize")) { variant.setMaxSize(json.get("maxSize").getAsInt()); }
        if(json.has("oreDict1")) { variant.setRecipeOreDict1(json.get("oreDict1").getAsString()); }
        if(json.has("oreDict2")) { variant.setRecipeOreDict2(json.get("oreDict2").getAsString()); }

        if(variant instanceof IVariantBlock) {
            IVariantBlock block = (IVariantBlock)variant;
            if(json.has("hardness")) { block.setHardness(json.get("hardness").getAsFloat()); }
            if(json.has("resistance")) { block.setResistance(json.get("resistance").getAsFloat()); }
            if(json.has("harvestLevel")) { block.setHarvestLevel(json.get("harvestLevel").getAsInt()); }
            if(json.has("light")) { block.setLight(json.get("light").getAsInt()); }
        }

        if(variant instanceof IVariantOre) {
            IVariantOre ore = (IVariantOre)variant;
            if(json.has("drop1")) { applyDrop(ore, json.get("drop1"), true); }
            if(json.has("drop2")) { applyDrop(ore, json.get("drop2"), false); }
        }

        if(variant instanceof IVariantFood) {
            IVariantFood food = (IVariantFood)variant;
            if(json.has("healAmount")) { food.setHealAmount(json.get("healAmount").getAsInt()); }
            if(json.has("saturation")) { food.setSaturation(json.get("saturation").getAsFloat()); }
            if(json.has("potion")) {
                JsonElement potion = json.get("potion");
                PENDING_POTION.put(food, potion.isJsonNull() ? "" : potion.getAsString());
            }
        }
    }

    private static void applyDrop(IVariantOre ore, JsonElement element, boolean first) {
        if(element.isJsonNull()) {
            if(first) { ore.setBlockDrop1(null); }
            else { ore.setBlockDrop2(null); }
            return;
        }

        if(!element.isJsonObject()) { return; }

        JsonObject json = element.getAsJsonObject();

        if(json.has("block")) {
            String name = json.get("block").getAsString();
            if(name.isEmpty()) {
                if(first) { ore.setBlockDrop1(null); }
                else { ore.setBlockDrop2(null); }
            }
            else {
                if(first) { PENDING_DROP1.put(ore, new ResourceLocation(name)); }
                else { PENDING_DROP2.put(ore, new ResourceLocation(name)); }
            }
        }

        if(json.has("meta")) {
            if(first) { ore.setBlockDropMeta1(json.get("meta").getAsInt()); }
            else { ore.setBlockDropMeta2(json.get("meta").getAsInt()); }
        }

        if(json.has("amount")) {
            if(first) { ore.setBlockDropAmount1(json.get("amount").getAsInt()); }
            else { ore.setBlockDropAmount2(json.get("amount").getAsInt()); }
        }
    }

    private static JsonObject dump(IVariantBase variant) {
        JsonObject json = new JsonObject();
        json.addProperty("rarity", variant.getRarity().name());
        json.addProperty("maxSize", variant.getMaxSize());
        json.addProperty("oreDict1", variant.getRecipeOreDict1());
        json.addProperty("oreDict2", variant.getRecipeOreDict2());

        if(variant instanceof IVariantBlock) {
            IVariantBlock block = (IVariantBlock)variant;
            json.addProperty("hardness", block.getHardness());
            json.addProperty("resistance", block.getResistance());
            json.addProperty("harvestLevel", block.getHarvestLevel());
            json.addProperty("light", block.getLight());
        }

        if(variant instanceof IVariantOre) {
            IVariantOre ore = (IVariantOre)variant;
            json.add("drop1", dumpDrop(ore.getBlockDrop1(), PENDING_DROP1.get(ore), ore.getBlockDropMeta1(), ore.getBlockDropAmount1()));
            json.add("drop2", dumpDrop(ore.getBlockDrop2(), PENDING_DROP2.get(ore), ore.getBlockDropMeta2(), ore.getBlockDropAmount2()));
        }

        if(variant instanceof IVariantFood) {
            IVariantFood food = (IVariantFood)variant;
            json.addProperty("healAmount", food.getHealAmount());
            json.addProperty("saturation", food.getSaturation());
            json.add("potion", dumpPotion(food, PENDING_POTION.get(food)));
        }

        return json;
    }

    private static JsonElement dumpDrop(Block block, ResourceLocation pending, int meta, int amount) {
        if(pending == null && block == null) { return JsonNull.INSTANCE; }

        JsonObject json = new JsonObject();
        json.addProperty("block", pending != null ? pending.toString() : String.valueOf(block.getRegistryName()));
        json.addProperty("meta", meta);
        json.addProperty("amount", amount);
        return json;
    }

    private static JsonElement dumpPotion(IVariantFood food, String pending) {
        if(pending != null) { return pending.isEmpty() ? JsonNull.INSTANCE : new JsonPrimitive(pending); }

        PotionEffect effect = food.getPotion();
        if(effect == null) { return JsonNull.INSTANCE; }

        ResourceLocation location = Potion.REGISTRY.getNameForObject(effect.getPotion());
        if(location == null) { return JsonNull.INSTANCE; }

        return new JsonPrimitive(location + ", " + effect.getDuration() + ", " + effect.getAmplifier() + ", " + effect.getIsAmbient());
    }

    private static EnumRarity parseRarity(String value, IVariantBase variant, String fileName) {
        try { return EnumRarity.valueOf(value.toUpperCase()); }
        catch (IllegalArgumentException e) {
            Basemod.logger.error("Unknown rarity {} for {} in {}.json, keeping {}", value, variant.getName(), fileName, variant.getRarity());
            return variant.getRarity();
        }
    }

    private static Block resolveBlock(ResourceLocation location) {
        if(!ForgeRegistries.BLOCKS.containsKey(location)) {
            Basemod.logger.error("Unknown drop block {} in variant config, keeping default", location);
            return null;
        }

        return ForgeRegistries.BLOCKS.getValue(location);
    }

    private static PotionEffect parsePotion(String value, IVariantFood food) {
        if(value.trim().isEmpty()) { return null; }

        String[] parts = value.split(",");
        if(parts.length < 3) {
            Basemod.logger.error("Malformed potion {} for {}, expected id, duration, amplifier[, ambient]", value, food.getName());
            return food.getPotion();
        }

        Potion potion = Potion.getPotionFromResourceLocation(parts[0].trim());
        if(potion == null) {
            Basemod.logger.error("Unknown potion {} for {}, keeping default", parts[0].trim(), food.getName());
            return food.getPotion();
        }

        try {
            int duration = Integer.parseInt(parts[1].trim());
            int amplifier = Integer.parseInt(parts[2].trim());
            boolean ambient = parts.length > 3 && Boolean.parseBoolean(parts[3].trim());
            return new PotionEffect(potion, duration, amplifier, ambient, false);
        }
        catch (NumberFormatException e) {
            Basemod.logger.error("Malformed potion numbers {} for {}, keeping default", value, food.getName());
            return food.getPotion();
        }
    }

    private static JsonObject read(File file) {
        if(!file.exists()) { return new JsonObject(); }

        try (FileReader reader = new FileReader(file)) {
            JsonElement element = new JsonParser().parse(reader);
            if(element.isJsonObject()) { return element.getAsJsonObject(); }
            Basemod.logger.error("{} is not a JSON object, using defaults and leaving the file alone", file.getName());
        }
        catch (Exception e) { Basemod.logger.error("Could not read {}: {}", file.getName(), String.valueOf(e)); }

        return null;
    }

    private static void write(File file, JsonObject root) {
        try (FileWriter writer = new FileWriter(file)) { GSON.toJson(root, writer); }
        catch (Exception e) { Basemod.logger.error("Could not write {}: {}", file.getName(), String.valueOf(e)); }
    }
}
