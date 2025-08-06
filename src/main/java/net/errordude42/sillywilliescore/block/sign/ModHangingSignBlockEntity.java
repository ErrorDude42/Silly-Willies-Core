package net.errordude42.sillywilliescore.block.sign;

import net.errordude42.sillywilliescore.ModBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModHangingSignBlockEntity extends HangingSignBlockEntity {
    public ModHangingSignBlockEntity(BlockPos pos, BlockState blockState)
    {
        super(pos, blockState);
    }

    @Override
    public BlockEntityType<?> getType()
    {
        return ModBlockEntity.MOD_HANGING_SIGN.get();
    }

}
