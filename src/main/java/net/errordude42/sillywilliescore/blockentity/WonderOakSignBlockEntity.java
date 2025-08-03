package net.errordude42.sillywilliescore.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WonderOakSignBlockEntity extends SignBlockEntity {
    public WonderOakSignBlockEntity(BlockPos pos, BlockState blockState) {
        super(pos, blockState);
    }

   @Override
    public BlockEntityType<?> getType(){
        return ModBlocksEntities.WONDER_OAK_SIGN.get();
   }
}
