package net.thepigcat76.survival_expanded.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thepigcat76.survival_expanded.ModItems.ModCreativeTab;
import net.thepigcat76.survival_expanded.ModItems.ModItems;
import net.thepigcat76.survival_expanded.Survival_expanded;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Survival_expanded.MODID);

    public static final RegistryObject<Block> STRAW_BLOCK = registerBlock("straw_block", () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
            .strength(2f)), ModCreativeTab.SURVIVAL_EXPANDED);

    public static final RegistryObject<Block> RYE_BLOCK = registerBlock("rye_block", () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
            .strength(2f)), ModCreativeTab.SURVIVAL_EXPANDED);

    public static final RegistryObject<Block> RYE_CROP= BLOCKS.register("rye_crop", () -> new RyeCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)
            .strength(2f)));

        private static <T extends Block>RegistryObject<T> registerBlock(String  name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
        }

        private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));

        }


    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
