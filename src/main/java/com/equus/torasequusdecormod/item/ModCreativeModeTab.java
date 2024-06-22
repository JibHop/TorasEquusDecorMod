package com.equus.torasequusdecormod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TEDM_TAB = new CreativeModeTab("tedmtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Brush.get());
        }
    };
}
