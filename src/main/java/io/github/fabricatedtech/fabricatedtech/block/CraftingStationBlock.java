package io.github.fabricatedtech.fabricatedtech.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class CraftingStationBlock extends Block {
    public static VoxelShape SHAPE = VoxelShapes.union(
            createCuboidShape(0, 13, 0, 16, 15, 16),
            createCuboidShape(0, 13, 0, 16, 16, 2),
            createCuboidShape(0, 13, 0, 2, 16, 16),
            createCuboidShape(14, 13, 0, 16, 16, 16),
            createCuboidShape(0, 13, 14, 16, 16, 16),
            createCuboidShape(0, 0, 0, 3, 15, 3),
            createCuboidShape(13, 0, 13, 16, 15, 16),
            createCuboidShape(0, 0, 13, 3, 15, 16),
            createCuboidShape(13, 0, 0, 16, 15, 3)
    );

    public CraftingStationBlock(FabricBlockSettings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
