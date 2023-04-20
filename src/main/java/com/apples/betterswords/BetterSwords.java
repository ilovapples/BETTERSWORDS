package com.apples.betterswords;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apples.betterswords.enchantments.*;


public class BetterSwords implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("betterswords");

	public static final Spewing SPEWING = new Spewing(new FabricItemSettings());
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("ilovapples' Garbage BETTERSWORDS mod has been initialized!");
		Registry.register(Registries.ENCHANTMENT, new Identifier("betterswords", "spewing"), SPEWING);
	}
}
