package com.xCloudfox.EasterEggs.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelRabbit - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelEasterBunny extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer LeftEar;
    public ModelRenderer Nose;
    public ModelRenderer RightEar;
    public ModelRenderer Tail;
    public ModelRenderer RearLeftLeg;
    public ModelRenderer RearLeftSide;
    public ModelRenderer Body;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer RearRightLeg;
    public ModelRenderer RearRightSide;
    public ModelRenderer FrontLeftLeg;

    public ModelEasterBunny() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.FrontLeftLeg = new ModelRenderer(this, 8, 15);
        this.FrontLeftLeg.setRotationPoint(3.0F, 17.0F, -1.0F);
        this.FrontLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(FrontLeftLeg, -0.19198621771937624F, 0.0F, 0.0F);
        this.LeftEar = new ModelRenderer(this, 58, 0);
        this.LeftEar.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.LeftEar.addBox(0.5F, -9.0F, -1.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, 0.2617993877991494F, 0.0F);
        this.Tail = new ModelRenderer(this, 52, 6);
        this.Tail.setRotationPoint(0.0F, 20.0F, 7.0F);
        this.Tail.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Tail, -0.3490658503988659F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 19.0F, 8.0F);
        this.Body.addBox(-3.0F, -2.0F, -10.0F, 6, 5, 10, 0.0F);
        this.setRotateAngle(Body, -0.3490658503988659F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.Head.addBox(-2.5F, -4.0F, -5.0F, 5, 4, 5, 0.0F);
        this.RearLeftLeg = new ModelRenderer(this, 26, 24);
        this.RearLeftLeg.setRotationPoint(3.0F, 17.5F, 3.7F);
        this.RearLeftLeg.addBox(-1.0F, 5.5F, -3.7F, 2, 1, 7, 0.0F);
        this.RearRightSide = new ModelRenderer(this, 16, 15);
        this.RearRightSide.setRotationPoint(-3.0F, 17.5F, 3.7F);
        this.RearRightSide.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 5, 0.0F);
        this.setRotateAngle(RearRightSide, -0.3665191429188092F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 32, 9);
        this.Nose.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.Nose.addBox(-0.5F, -2.5F, -5.5F, 1, 1, 1, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 0, 15);
        this.FrontRightLeg.setRotationPoint(-3.0F, 17.0F, -1.0F);
        this.FrontRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(FrontRightLeg, -0.19198621771937624F, 0.0F, 0.0F);
        this.RightEar = new ModelRenderer(this, 52, 0);
        this.RightEar.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.RightEar.addBox(-2.5F, -9.0F, -1.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, -0.2617993877991494F, 0.0F);
        this.RearLeftSide = new ModelRenderer(this, 30, 15);
        this.RearLeftSide.setRotationPoint(3.0F, 17.5F, 3.7F);
        this.RearLeftSide.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 5, 0.0F);
        this.setRotateAngle(RearLeftSide, -0.3665191429188092F, 0.0F, 0.0F);
        this.RearRightLeg = new ModelRenderer(this, 8, 24);
        this.RearRightLeg.setRotationPoint(-3.0F, 17.5F, 3.7F);
        this.RearRightLeg.addBox(-1.0F, 5.5F, -3.7F, 2, 1, 7, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.FrontLeftLeg.render(f5);
        this.LeftEar.render(f5);
        this.Tail.render(f5);
        this.Body.render(f5);
        this.Head.render(f5);
        this.RearLeftLeg.render(f5);
        this.RearRightSide.render(f5);
        this.Nose.render(f5);
        this.FrontRightLeg.render(f5);
        this.RightEar.render(f5);
        this.RearLeftSide.render(f5);
        this.RearRightLeg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.FrontLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RearLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	
    	this.FrontRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.RearLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    	
    	this.Nose.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Nose.rotateAngleX = headPitch * 0.017453292F;
    }
}
