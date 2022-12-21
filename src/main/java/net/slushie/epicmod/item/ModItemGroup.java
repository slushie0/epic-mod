package net.slushie.epicmod.item;

import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slushie.epicmod.EpicMod;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup.builder(new Identifier(EpicMod.MOD_ID))
            .displayName(Text.literal("Epic Mod"))
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .build();
}
