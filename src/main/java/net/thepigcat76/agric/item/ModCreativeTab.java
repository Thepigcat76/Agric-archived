package net.thepigcat76.agric.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.thepigcat76.agric.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

public class ModCreativeTab {
    public static final CreativeModeTab AGRIC = new CreativeModeTab("agric") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModBlocks.RYE_BLOCK.get());
        }
    };
}
