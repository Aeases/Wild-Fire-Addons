package xyz.quartex.wfaddons.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.quartex.wfaddons.WFAddons;
import xyz.quartex.wfaddons.item.custom.WitherArmorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WFAddons.MOD_ID);

    public static final RegistryObject<Item> TEST = ITEMS.register("test",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    // Wither Armour
    public static final RegistryObject<Item> WITHER_HELMET = ITEMS.register("wither_helmet",
            () -> new WitherArmorItem(ModArmorMaterials.WITHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WITHER_CHESTPLATE = ITEMS.register("wither_chestplate",
            () -> new WitherArmorItem(ModArmorMaterials.WITHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WITHER_LEGGINGS = ITEMS.register("wither_leggings",
            () -> new WitherArmorItem(ModArmorMaterials.WITHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WITHER_BOOTS = ITEMS.register("wither_boots",
            () -> new WitherArmorItem(ModArmorMaterials.WITHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    // Wither Armour

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
