package net.thepigcat76.survival_expanded.ModItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.thepigcat76.survival_expanded.block.ModBlocks;

public class ModCreativeTab {
    public static final CreativeModeTab SURVIVAL_EXPANDED = new CreativeModeTab("survival_expanded") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.RYE_BLOCK.get());
        }
    };
}
