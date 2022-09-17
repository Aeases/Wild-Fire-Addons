package xyz.quartex.wfaddons.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import xyz.quartex.wfaddons.WFAddons;
import xyz.quartex.wfaddons.item.custom.WitherArmorItem;

public class WitherArmorModel extends AnimatedGeoModel<WitherArmorItem> {
    @Override
    public ResourceLocation getModelLocation(WitherArmorItem object) {
        return new ResourceLocation(WFAddons.MOD_ID, "geo/wither_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WitherArmorItem object) {
        return new ResourceLocation(WFAddons.MOD_ID, "textures/models/armor/wither_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WitherArmorItem animatable) {
        return new ResourceLocation(WFAddons.MOD_ID, "animations/witherarmor_animation.json");
    }
}
