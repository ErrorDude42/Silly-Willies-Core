package net.errordude42.sillywilliescore.item;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SillyWilliesCore.MOD_ID);

    //public static final DeferredItem<Item> CODENAME = ITEMS.register("namenospaces",
    //      () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TRIANGULUMRAW = ITEMS.register("triangulumraw",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TRIANGULUM = ITEMS.register("triangulum",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TRIANGULUMBRICK = ITEMS.register("triangulumbrick",
          () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TRIANGULUMUPGRADETEMPLATE = ITEMS.register("triangulumupgradetemplate",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENTANGULUM_DUST = ITEMS.register("entangulumdust",
          () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENTANGULUM_SPOOL = ITEMS.register("entangulumspool",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENTANGULUM_PLATE = ITEMS.register("entangulumplate",
         () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIRTY_ENTANGULUM_DUST = ITEMS.register("dirtyentangulumdust",
          () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENTANGULUM_STRING = ITEMS.register("entangulumstring",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PLATE_MOLD = ITEMS.register("platemold",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EMPTY_SPOOL = ITEMS.register("empty_spool",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> INCOMPLETE_TRIANGULUM = ITEMS.register("incomplete_triangulum",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ENTANGULUM = ITEMS.register("raw_entangulum",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENTANGULUM_MASTERWORK_SMITHING_TEMPLATE = ITEMS.register("entangulum_masterwork_smithing_template",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENTANGULUM_DUSTED_MOLD = ITEMS.register("entangulum_dusted_mold",
            () -> new Item(new Item.Properties().craftRemainder(ModItems.PLATE_MOLD.get())));

    public static final DeferredItem<SwordItem> TRIANGULUM_SWORD =ITEMS.register("triangulum_sword",
            () -> new SwordItem(ModToolTiers.TRIANGULUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.TRIANGULUM,5,-2.6f))
            ));
    public static final DeferredItem<PickaxeItem> TRIANGULUM_PICKAXE = ITEMS.register("triangulum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TRIANGULUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.TRIANGULUM, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> TRIANGULUM_SHOVEL = ITEMS.register("triangulum_shovel",
            () -> new ShovelItem(ModToolTiers.TRIANGULUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.TRIANGULUM, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> TRIANGULUM_AXE = ITEMS.register("triangulum_axe",
            () -> new AxeItem(ModToolTiers.TRIANGULUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.TRIANGULUM, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> TRIANGULUM_HOE = ITEMS.register("triangulum_hoe",
            () -> new HoeItem(ModToolTiers.TRIANGULUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.TRIANGULUM, -5F, 0f))));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
