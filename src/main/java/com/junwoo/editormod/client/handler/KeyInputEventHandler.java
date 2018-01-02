package com.junwoo.editormod.client.handler;


import com.junwoo.editormod.client.gui.GuiWelcome;
import com.junwoo.editormod.client.settings.Keybindings;
import com.junwoo.editormod.reference.Key;
import com.junwoo.editormod.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;

public class KeyInputEventHandler {

	private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
		return null; 
        
        
           
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
        //Minecraft.getMinecraft().displayGuiScreen(new GuiWelcome());
        
        
    }
    
}
