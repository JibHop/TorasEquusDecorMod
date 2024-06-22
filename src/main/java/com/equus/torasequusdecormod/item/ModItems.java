package com.equus.torasequusdecormod.item;

import com.equus.torasequusdecormod.TorasEquusDecorMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TorasEquusDecorMod.MOD_ID);

    public static final RegistryObject<Item> Brush = ITEMS.register("brush",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEDM_TAB)));
    public static final RegistryObject<Item> CurryComb = ITEMS.register("currycomb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEDM_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
