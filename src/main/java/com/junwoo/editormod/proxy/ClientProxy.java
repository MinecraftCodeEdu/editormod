package com.junwoo.editormod.proxy;

import org.lwjgl.input.Keyboard;

import com.junwoo.editormod.client.settings.Keybindings;
import com.junwoo.editormod.event.ClientEvents;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

	public static final KeyBinding MY_KEYBINDING = new KeyBinding("key.opengui", Keyboard.KEY_O, "category.mikk");
	

	@Override
	public void preInit() {
		registerKeyBindings();
		
	}

    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
    }

	
	@Override
	public void init() {
		ClientRegistry.registerKeyBinding(MY_KEYBINDING);
		MinecraftForge.EVENT_BUS.register(new ClientEvents());
		
	}

	@Override
	public void postInit() {
		// TODO Auto-generated method stub
		
	}
}
