package net.BrandonMicP28.uselessgarbageitems.item;

import net.BrandonMicP28.uselessgarbageitems.UselessGarbageItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UselessGarbageItems.MOD_ID);

    public static final RegistryObject<CreativeModeTab> USELESS_ITEMS_TAB = CREATIVE_MODE_TABS.register("useless_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BANANA.get()))
                    .title(Component.translatable("creativetab.useless_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BANANA.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
