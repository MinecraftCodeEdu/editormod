package com.junwoo.editormod.event;


import com.junwoo.editormod.client.gui.GuiWelcome;
import com.junwoo.editormod.client.settings.Keybindings;
import com.junwoo.editormod.proxy.ClientProxy;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraft.client.Minecraft;

public class ClientEvents {

	@SubscribeEvent
	public void onUpdate(ClientTickEvent event) {
		if(ClientProxy.MY_KEYBINDING.getIsKeyPressed()) {
			Minecraft.getMinecraft().displayGuiScreen(new GuiWelcome());
		}
		
	}
	
	
}
