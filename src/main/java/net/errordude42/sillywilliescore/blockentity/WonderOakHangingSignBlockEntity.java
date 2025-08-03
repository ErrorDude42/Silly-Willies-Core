package net.errordude42.sillywilliescore.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WonderOakHangingSignBlockEntity extends HangingSignBlockEntity {
    public WonderOakHangingSignBlockEntity(BlockPos pos, BlockState blockState) {
        super(pos, blockState);
    }

    @Override
    public BlockEntityType<?> getType(){
        return ModBlocksEntities.WONDER_OAK_HANGING_SIGN.get();
    }
}
