package net.errordude42.sillywilliescore.item;

import net.errordude42.sillywilliescore.SillyWilliesCore;
import net.minecraft.world.item.Item;
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

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
