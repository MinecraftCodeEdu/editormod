package com.junwoo.editormod.client.gui;


import cpw.mods.fml.client.config.GuiButtonExt;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class GuiWelcome extends GuiScreen {
	
	private GuiButtonExt button1;
	private GuiTextField textField1;
	
	@SuppressWarnings("unchecked")
	@Override
	public void initGui() {
		//super.initGui();
		
		button1 = new GuiButtonExt(0, width / 2 - 50, height /2 + 100, 100, 20, "Main Menu");
		buttonList.add(button1);
		
		textField1 = new GuiTextField(fontRendererObj, width / 2 - 75, height / 2 - 10, 150, 150);
			
	}
	
	@Override
	protected void keyTyped(char typedChar, int keyCode) {
		textField1.textboxKeyTyped(typedChar, keyCode);
		super.keyTyped(typedChar, keyCode);
	}
	
	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		textField1.mouseClicked(mouseX, mouseY, mouseButton);
		super.mouseClicked(mouseX, mouseY, mouseButton);
	}
	
	@Override
	public void updateScreen() {
	textField1.updateCursorCounter();
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		drawDefaultBackground();
		textField1.drawTextBox();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	protected void actionPerformed(GuiButton button) {
		if (button == button1) {
			mc.displayGuiScreen(new GuiMainMenu());
		}
	}
	

}
