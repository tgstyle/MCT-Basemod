package mctmods.basemod.mixin;

import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fml.relauncher.Side;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraftforge.fml.common.network.NetworkRegistry.class)
public class MixinNetworkRegistry {

    // NOT FOR DISTRIBUTION! build.gradle prevents this file from being allowed in the jar.

    // Only active in deobf/dev environment (helps prevent accidental usage if accidentally distributed)
    @Redirect(method = "newChannel(Ljava/lang/String;[Lio/netty/channel/ChannelHandler;)Ljava/util/EnumMap;", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/fml/relauncher/Side;values()[Lnet/minecraftforge/fml/relauncher/Side;"), remap = false)
    private Side[] redirectNewChannel1() {
        Object isDeobf = Launch.blackboard.get("fml.deobfuscatedEnvironment");
        boolean applyFix = (isDeobf instanceof Boolean && (Boolean) isDeobf);
        if (applyFix) { return new Side[]{Side.CLIENT, Side.SERVER}; }
        return Side.values();
    }

    @Redirect(method = "newChannel(Lnet/minecraftforge/fml/common/ModContainer;Ljava/lang/String;[Lio/netty/channel/ChannelHandler;)Ljava/util/EnumMap;", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/fml/relauncher/Side;values()[Lnet/minecraftforge/fml/relauncher/Side;"), remap = false)
    private Side[] redirectNewChannel2() {
        Object isDeobf = Launch.blackboard.get("fml.deobfuscatedEnvironment");
        boolean applyFix = (isDeobf instanceof Boolean && (Boolean) isDeobf);
        if (applyFix) { return new Side[]{Side.CLIENT, Side.SERVER}; }
        return Side.values();
    }
}
