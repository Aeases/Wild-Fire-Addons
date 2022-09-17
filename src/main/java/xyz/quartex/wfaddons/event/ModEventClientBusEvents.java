package xyz.quartex.wfaddons.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import xyz.quartex.wfaddons.WFAddons;
import xyz.quartex.wfaddons.entity.client.armor.WitherArmorRenderer;
import xyz.quartex.wfaddons.item.custom.WitherArmorItem;


@Mod.EventBusSubscriber(modid = WFAddons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(WitherArmorItem.class, new WitherArmorRenderer());
    }
}
