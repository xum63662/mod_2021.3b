
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtest.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class V1TestModTabs {
	public static CreativeModeTab TAB_CREATIVE;

	public static void load() {
		TAB_CREATIVE = new CreativeModeTab("tabcreative") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(V1TestModItems.CRAETIVE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
