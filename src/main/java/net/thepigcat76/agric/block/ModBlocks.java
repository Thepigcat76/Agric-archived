package net.thepigcat76.agric.block;

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
import net.thepigcat76.agric.block.crops.CottonCrop;
import net.thepigcat76.agric.block.crops.bushes.StrawberryBush;
import net.thepigcat76.agric.item.ModCreativeTab;
import net.thepigcat76.agric.item.ModItems;
import net.thepigcat76.agric.block.crops.RyeCrop;

import java.util.function.Supplier;

import static net.thepigcat76.agric.Agric.MODID;

public class ModBlocks {
    public static final DeferredRegister<Block> MOD_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> STRAW_BLOCK = registerBlock("straw_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(2f)), ModCreativeTab.AGRIC);

    public static final RegistryObject<Block> RYE_BLOCK = registerBlock("rye_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(2f)), ModCreativeTab.AGRIC);

    public static final RegistryObject<Block> RYE_CROP = MOD_BLOCKS.register("rye_crop",
            () -> new RyeCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)
                    .strength(2f)));

    public static final RegistryObject<Block> COTTON_CROP = MOD_BLOCKS.register("cotton_crop",
            () -> new CottonCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)
                    .strength(2f)));

    public static final RegistryObject<Block> STRAWBERRY_BUSH = MOD_BLOCKS.register("strawberry_bush",
            () -> new StrawberryBush(BlockBehaviour.Properties.copy(Blocks.WHEAT)
                    .strength(2f)));


    private static <T extends Block>RegistryObject<T> registerBlockNoItem (String  name, Supplier<T> block) {
        return MOD_BLOCKS.register (name, block);
    }

    private static <T extends Block>RegistryObject<T> registerBlock (String  name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = MOD_BLOCKS.register (name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem (String name, RegistryObject<T> block, CreativeModeTab tab) {

        ModItems.MOD_ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
        }

    public static void register (IEventBus eventBus) {
        MOD_BLOCKS.register(eventBus);
    }
}
