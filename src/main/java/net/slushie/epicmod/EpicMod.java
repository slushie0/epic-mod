package net.slushie.epicmod;

import net.fabricmc.api.ModInitializer;
import net.slushie.epicmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EpicMod implements ModInitializer {
	public static final String MOD_ID = "epicmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
