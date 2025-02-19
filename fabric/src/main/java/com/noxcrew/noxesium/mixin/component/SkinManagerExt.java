package com.noxcrew.noxesium.mixin.component;

import net.minecraft.client.resources.SkinManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.io.File;

@Mixin(SkinManager.class)
public interface SkinManagerExt {

    @Accessor("skinTextures")
    SkinManager.TextureCache getSkinTextures();
}
