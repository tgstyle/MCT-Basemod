package mctmods.basemod.registry;

import java.util.HashSet;
import java.util.Set;

import mctmods.basemod.Basemod;
import mctmods.basemod.items.ItemMaterials;
import mctmods.basemod.items.ItemFoods;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@GameRegistry.ObjectHolder(Basemod.MODID)
public class RegistryItem {

    @GameRegistry.ObjectHolder("materials")
    public static final ItemMaterials MATERIALS = new ItemMaterials();
    
    @GameRegistry.ObjectHolder("foods")
    public static final ItemFoods FOODS = new ItemFoods();

    private static final Item[] item = {
    	new ItemMaterials(),
    	new ItemFoods()
   };

   @EventBusSubscriber
   public static class RegistrationHandler {
       public static final Set<Item> ITEMS = new HashSet<>();

       @SubscribeEvent
       public static void registerItem(RegistryEvent.Register<Item> event) {
           final IForgeRegistry<Item> registry = event.getRegistry();
           for (Item iS : item) {
               registry.register(iS);
               ITEMS.add(iS);
           }
       }
   }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	MATERIALS.initItemModels();
    	FOODS.initItemModels();
    }
}
