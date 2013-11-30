package openperipheral.integration;

import java.util.Map;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import openmods.Mods;
import openperipheral.AdapterManager;
import openperipheral.adapter.thaumcraft.AdapterAspectContainer;
import openperipheral.adapter.thaumcraft.AdapterNode;
import openperipheral.api.IIntegrationModule;

public class ModuleThaumcraft implements IIntegrationModule {

	@Override
	public String getModId() {
		return Mods.THAUMCRAFT;
	}

	@Override
	public void init() {
		AdapterManager.addPeripheralAdapter(new AdapterAspectContainer());
		AdapterManager.addPeripheralAdapter(new AdapterNode());
	}

	@Override
	public void appendEntityInfo(Map<String, Object> map, Entity entity, Vec3 relativePos) {}

	@Override
	public void appendItemInfo(Map<String, Object> map, ItemStack itemstack) {}
}
