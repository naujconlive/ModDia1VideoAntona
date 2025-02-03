package net.naujconlive.modantonadia1.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.naujconlive.modantonadia1.ModDia1;
import net.naujconlive.modantonadia1.entity.custom.MajajiEntity;
import net.naujconlive.modantonadia1.entity.state.MajajiEntityRenderState;

@Environment(EnvType.CLIENT)
public class MajajiRenderer extends MobEntityRenderer<MajajiEntity, MajajiEntityRenderState, MajajiModel> {
  private static final Identifier TEXTURE = Identifier.of(ModDia1.MOD_ID, "textures/entity/majaji/majaji.png");

  public MajajiRenderer(EntityRendererFactory.Context ctx) {
    super(ctx, new MajajiModel(ctx.getPart(MajajiModel.MAJAJI)), 0.75F);
  }

  @Override
  public Identifier getTexture(MajajiEntityRenderState state) {
    return TEXTURE;
  }

  @Override
  public MajajiEntityRenderState createRenderState() {
    return new MajajiEntityRenderState();
  }

  public void updateRenderState(MajajiEntity entity, MajajiEntityRenderState state, float f) {
    super.updateRenderState(entity, state, f);
  }

  protected void setupTransforms(MajajiEntityRenderState state, MatrixStack matrixStack, float f, float g) {
    super.setupTransforms(state, matrixStack, f, g);;
  }
}
