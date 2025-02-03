package net.naujconlive.modantonadia1.entity.client;

import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.naujconlive.modantonadia1.entity.custom.DickEntity;

public class DickRenderer extends EntityRenderer<DickEntity, EntityRenderState> {
  public DickRenderer(EntityRendererFactory.Context context) {
    super(context);
  }

  @Override
  public EntityRenderState createRenderState() {
    return new EntityRenderState();
  }

  @Override
  public boolean shouldRender(DickEntity entity, Frustum frustum, double x, double y, double z) {
    return true;
  }
}
