package xyz.quartex.wfaddons.entity.client.armor;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import xyz.quartex.wfaddons.item.custom.WitherArmorItem;
public class WitherArmorRenderer extends GeoArmorRenderer<WitherArmorItem> {
    public WitherArmorRenderer() {
        super(new WitherArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
