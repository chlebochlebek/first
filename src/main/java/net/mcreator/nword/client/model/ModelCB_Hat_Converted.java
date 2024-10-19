package net.mcreator.nword.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCB_Hat_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("nword", "model_cb_hat_converted"), "main");
	public final ModelPart hat;

	public ModelCB_Hat_Converted(ModelPart root) {
		this.hat = root.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat",
				CubeListBuilder.create().texOffs(0, 14).addBox(-5.5F, -6.8698F, -6.1327F, 11.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(7, 15).addBox(-6.3F, -7.2698F, -4.5327F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(3, 20)
						.addBox(-6.3F, -7.2698F, 5.4673F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 14).addBox(-6.3F, -7.2698F, -6.5327F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 14)
						.addBox(4.7F, -7.2698F, -4.5327F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(-3.0F, -9.9698F, -3.1327F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 0.6F, -0.4F, -0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r1 = hat.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, -1).addBox(-4.1F, 15.5F, -5.1F, 8.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.9698F, 0.4673F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
