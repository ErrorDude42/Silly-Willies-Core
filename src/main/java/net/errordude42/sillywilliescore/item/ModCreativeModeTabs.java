package net.errordude42.sillywilliescore.item;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.errordude42.sillywilliescore.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SillyWilliesCore.MOD_ID);

    public static final Supplier<CreativeModeTab> SILLY_WILLY_CORE = CREATIVE_MODE_TAB.register("silly_willy_core",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TRIANGULUM.get()))
                    .title(Component.translatable("creativetab.sillywilliescore.sillywilliescore_items"))
                    .displayItems((itemDisplayParameters, output)-> {
                        output.accept(ModItems.TRIANGULUM_AXE);
                        output.accept(ModItems.TRIANGULUM_HOE);
                        output.accept(ModItems.TRIANGULUM_SWORD);
                        output.accept(ModItems.TRIANGULUM_PICKAXE);
                        output.accept(ModItems.TRIANGULUM_SHOVEL);
                        output.accept(ModItems.TRIANGULUM);
                        output.accept(ModItems.INCOMPLETE_TRIANGULUM);
                        output.accept(ModItems.TRIANGULUMRAW);
                        output.accept(ModItems.TRIANGULUMUPGRADETEMPLATE);
                        output.accept(ModItems.TRIANGULUMBRICK);
                        output.accept(ModBlocks.BLOCK_OF_RAW_TRIANGULUM);
                        output.accept(ModBlocks.TRIANGULUMORE_DEEPSLATE);
                        output.accept(ModItems.RAW_ENTANGULUM);
                        output.accept(ModItems.ENTANGULUM_DUST);
                        output.accept(ModItems.ENTANGULUM_PLATE);
                        output.accept(ModItems.ENTANGULUM_SPOOL);
                        output.accept(ModItems.ENTANGULUM_STRING);
                        output.accept(ModItems.DIRTY_ENTANGULUM_DUST);
                        output.accept(ModItems.ENTANGULUM_MASTERWORK_SMITHING_TEMPLATE);
                        output.accept(ModBlocks.ENTANGULUM_ORE);
                        output.accept(ModBlocks.BLOCK_OF_RAW_ENTANGULUM);
                        output.accept(ModItems.PLATE_MOLD);
                        output.accept(ModItems.EMPTY_SPOOL);
                        output.accept(ModItems.ENTANGULUM_DUSTED_MOLD);
                    })
                    .build()
            );

    public static final Supplier<CreativeModeTab> SILLY_WILLY_BUILDING_BLOCKS = CREATIVE_MODE_TAB.register("silly_willy_core_building_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TRIANGULUM_BRICKS.get()))
                    .title(Component.translatable("creativetab.sillywilliescore.sillywilliescore_building_blocks"))
                    .displayItems((itemDisplayParameters, output)-> {
                        output.accept(ModBlocks.TRIANGULUM_BRICKS);
                        output.accept(ModBlocks.TRIANGULUM_BRICKS_STAIRS);
                        output.accept(ModBlocks.TRIANGULUM_BRICKS_SLAB);
                        output.accept(ModBlocks.TRIANGULUM_BRICKS_WALL);
                        output.accept(ModBlocks.TRIANGULUM_BRICKS_PRESSURE_PLATE);
                        output.accept(ModBlocks.TRIANGULUM_BRICKS_BUTTON);
                        output.accept(ModBlocks.GEOSTONE);
                        output.accept(ModBlocks.GEOSTONE_STAIRS);
                        output.accept(ModBlocks.GEOSTONE_SLAB);
                        output.accept(ModBlocks.GEOSTONE_PRESSURE_PLATE);
                        output.accept(ModBlocks.GEOSTONE_BUTTON);
                        output.accept(ModBlocks.GEOSTONE_COBBLE);
                        output.accept(ModBlocks.GEOSTONE_COBBLE_STAIRS);
                        output.accept(ModBlocks.GEOSTONE_COBBLE_SLAB);
                        output.accept(ModBlocks.GEOSTONE_COBBLE_WALL);
                        output.accept(ModBlocks.SILT);
                        output.accept(ModBlocks.CHISLED_GEOSTONE);
                        output.accept(ModBlocks.CRACKED_GEOSTONE_BRICKS);
                        output.accept(ModBlocks.GEOSTONE_BRICKS);
                        output.accept(ModBlocks.GEOSTONE_BRICKS_STAIRS);
                        output.accept(ModBlocks.GEOSTONE_BRICKS_SLAB);
                        output.accept(ModBlocks.GEOSTONE_BRICKS_WALL);
                        output.accept(ModBlocks.MOSSY_GEOSTONE_BRICKS);
                        output.accept(ModBlocks.MOSSY_GEOSTONE_BRICKS_STAIRS);
                        output.accept(ModBlocks.MOSSY_GEOSTONE_BRICKS_SLAB);
                        output.accept(ModBlocks.MOSSY_GEOSTONE_BRICKS_WALL);
                        output.accept(ModBlocks.SMOOTH_GEOSTONE);
                        output.accept(ModBlocks.SMOOTH_GEOSTONE_SLAB);


                    })
                    .build()
    );

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
