package net.mcreator.nword.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.nword.entity.CaveclimberEntity;

public class CaveclimberModel extends GeoModel<CaveclimberEntity> {
	@Override
	public ResourceLocation getAnimationResource(CaveclimberEntity entity) {
		return new ResourceLocation("nword", "animations/cave_climber.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CaveclimberEntity entity) {
		return new ResourceLocation("nword", "geo/cave_climber.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CaveclimberEntity entity) {
		return new ResourceLocation("nword", "textures/entities/" + entity.getTexture() + ".png");
	}

}
