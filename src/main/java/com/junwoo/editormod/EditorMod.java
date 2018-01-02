package com.junwoo.editormod;

import com.junwoo.editormod.client.gui.GuiOverlay;
import com.junwoo.editormod.client.handler.KeyInputEventHandler;
import com.junwoo.editormod.proxy.CommonProxy;
import com.junwoo.editormod.reference.Reference;
import com.junwoo.editormod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class EditorMod {

	@Mod.Instance(Reference.MOD_ID)
    public static EditorMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;	
	
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		proxy.preInit();
		//proxy.registerKeyBindings();
		
		LogHelper.info("Pre Initialization Complete!");
    }
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		proxy.init();
		LogHelper.info("Initialization Complete!");
    }
	
	@Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		MinecraftForge.EVENT_BUS.register(new GuiOverlay());
		proxy.postInit();
		LogHelper.info("Post Initialization Complete!");
    }
}
