package net.thepigcat76.agric.block.crops.bushes;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.thepigcat76.agric.item.ModItems;

public class StrawberryBush extends SweetBerryBushBlock {
    public StrawberryBush(Properties p_57249_) {
        super(p_57249_);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.STRAWBERRY.get());
    }
    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        int i = state.getValue(AGE);
        boolean flag = i == 4;

        if (!flag && player.getItemInHand(handIn).is(Items.BONE_MEAL)) {
            return InteractionResult.PASS;
        } else if (i == 3) {
            popResource(worldIn, pos, new ItemStack(ModItems.STRAWBERRY.get(), 1));
            worldIn.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0f, 0.8F + worldIn.random.nextFloat() * 0.4F);
            worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);

            return InteractionResult.SUCCESS;
        } else if (i == 4) {
            popResource(worldIn, pos, new ItemStack(ModItems.STRAWBERRY.get(), 2));
            worldIn.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0f, 0.8F + worldIn.random.nextFloat() * 0.4F);
            worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);

            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.PASS;
        }
    }
}


