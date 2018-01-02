package com.junwoo.editormod.client.gui;

import com.junwoo.editormod.reference.Reference;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class GuiOverlay extends Gui {
	
	private final ResourceLocation bar = new ResourceLocation(Reference.MOD_ID, "textures/gui/book.png");
    private final int tex_width = 200, tex_height = 200;

    @SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event) {
        if (event.type == RenderGameOverlayEvent.ElementType.TEXT) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.renderEngine.bindTexture(bar);
            drawTexturedModalRect(200, 10, 0, 0, tex_width, tex_height);
        }    
    }

}
