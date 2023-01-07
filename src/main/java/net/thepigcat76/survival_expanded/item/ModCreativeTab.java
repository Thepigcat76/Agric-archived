package net.thepigcat76.survival_expanded.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.thepigcat76.survival_expanded.block.ModBlocks;

public class ModCreativeTab {
    public static final CreativeModeTab SURVIVAL_EXPANDED = new CreativeModeTab("agric") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.RYE_BLOCK.get());
        }
    };
}
