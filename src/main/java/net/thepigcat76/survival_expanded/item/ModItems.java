package net.thepigcat76.survival_expanded.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thepigcat76.survival_expanded.Survival_expanded;
import net.thepigcat76.survival_expanded.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Survival_expanded.MODID);

    public static final RegistryObject<Item> STRAW = ITEMS.register("straw", () -> new Item(new Item.Properties().tab(ModCreativeTab.SURVIVAL_EXPANDED)));
    public static final RegistryObject<Item> RYE_SEEDS = ITEMS.register("rye_seeds", () -> new ItemNameBlockItem(ModBlocks.RYE_CROP.get(), new Item.Properties().tab(ModCreativeTab.SURVIVAL_EXPANDED)));
    public static final RegistryObject<Item> COTTON_SEEDS = ITEMS.register("rye_seeds", () -> new ItemNameBlockItem(ModBlocks.RYE_CROP.get(), new Item.Properties().tab(ModCreativeTab.SURVIVAL_EXPANDED)));
    public static final RegistryObject<Item> RYE = ITEMS.register("rye", () -> new Item(new Item.Properties().tab(ModCreativeTab.SURVIVAL_EXPANDED).food(new FoodProperties.Builder().nutrition(1).build())));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () -> new Item(new Item.Properties().tab(ModCreativeTab.SURVIVAL_EXPANDED).food(new FoodProperties.Builder().nutrition(1).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 3), 0.9f).build())));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().tab(ModCreativeTab.SURVIVAL_EXPANDED)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
