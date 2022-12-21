package net.slushie.epicmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.slushie.epicmod.EpicMod;

public class ModItemGroup {
    public static final ItemGroup EPIC_MOD = FabricItemGroup.builder(new Identifier(EpicMod.MOD_ID, "epic_mod_item_group"))
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .build();
}
