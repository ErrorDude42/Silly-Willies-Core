package net.errordude42.sillywilliescore;

import com.mojang.logging.LogUtils;
import net.errordude42.sillywilliescore.effect.ModEffects;
import net.errordude42.sillywilliescore.entity.boat.ModBoatRenderer;
import net.errordude42.sillywilliescore.item.ModCreativeModeTabs;
import net.errordude42.sillywilliescore.item.ModItems;
import net.errordude42.sillywilliescore.loot.ModLootModifiers;
import net.errordude42.sillywilliescore.util.ModWoodTypes;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@SuppressWarnings("removal")
@Mod(SillyWilliesCore.MOD_ID)
public class SillyWilliesCore {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "sillywilliescore";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final ResourceKey<Level> GEO_KEY = ResourceKey.create(Registries.DIMENSION,SillyWilliesCore.rl("geo"));

    public static ResourceLocation rl(String s)
    {
        return ResourceLocation.fromNamespaceAndPath(SillyWilliesCore.MOD_ID, s);
    }

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public SillyWilliesCore(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModLootModifiers.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);



        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntity.register(modEventBus);
        ModEntities.register(modEventBus);
        ModEffects.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);


    }



    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.WONDER_OAK);

            EntityRenderers.register(ModEntities.MOD_BOAT.get(), context -> new ModBoatRenderer(context, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), context -> new ModBoatRenderer(context, true));
        }
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){


        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }


}
