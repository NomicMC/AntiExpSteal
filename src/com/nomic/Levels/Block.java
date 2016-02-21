package com.nomic.Levels;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Block implements Listener {
	
	private Main plugin;

	public Block(Main pl) {
		plugin = pl;
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		Material b = e.getBlock().getType();
		Player p = e.getPlayer();
		if (!(p.hasPermission("levels.block")))
			return;
		
		ConfigurationSection config = plugin.getConfig().getConfigurationSection("blockExp");
		int mult = plugin.getConfig().getInt("expMultiplier");
		
		if (b == Material.COAL_ORE) {
			e.setExpToDrop(0);
			if (!(config.getConfigurationSection("coalOre").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("coalOre").getInt("min");
			int max = config.getConfigurationSection("coalOre").getInt("max");
			p.giveExp(mult * min + new Random().nextInt(mult* (max - min)));
		}
		if (b == Material.DIAMOND_ORE) {
			e.setExpToDrop(0);
			if (!(config.getConfigurationSection("diamondOre").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("diamondOre").getInt("min");
			int max = config.getConfigurationSection("diamondOre").getInt("max");
			p.giveExp(mult * min + new Random().nextInt(mult* (max - min)));
		}
		if (b == Material.EMERALD_ORE) {
			e.setExpToDrop(0);
			if (!(config.getConfigurationSection("emeraldOre").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("emeraldOre").getInt("min");
			int max = config.getConfigurationSection("emeraldOre").getInt("max");
			p.giveExp(mult * min + new Random().nextInt(mult* (max - min)));
		}
		if (b == Material.LAPIS_ORE) {
			e.setExpToDrop(0);
			if (!(config.getConfigurationSection("lapisOre").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("lapisOre").getInt("min");
			int max = config.getConfigurationSection("lapisOre").getInt("max");
			p.giveExp(mult * min + new Random().nextInt(mult* (max - min)));
		}
		if (b == Material.REDSTONE_ORE) {
			e.setExpToDrop(0);
			if (!(config.getConfigurationSection("redstoneOre").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("redstoneOre").getInt("min");
			int max = config.getConfigurationSection("redstoneOre").getInt("max");
			p.giveExp(mult * min + new Random().nextInt(mult* (max - min)));
		}
		if (b == Material.QUARTZ_ORE) {
			e.setExpToDrop(0);
			if (!(config.getConfigurationSection("quartzOre").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("quartzOre").getInt("min");
			int max = config.getConfigurationSection("quartzOre").getInt("max");
			p.giveExp(mult * min + new Random().nextInt(mult* (max - min)));
		}
		if (b == Material.IRON_ORE) {
			e.setExpToDrop(0);
			if (!(config.getConfigurationSection("ironOre").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("ironOre").getInt("min");
			int max = config.getConfigurationSection("ironOre").getInt("max");
			p.giveExp(mult * min + new Random().nextInt(mult* (max - min)));
		}
		if (b == Material.GOLD_ORE) {
			e.setExpToDrop(0);
			if (!(config.getConfigurationSection("goldOre").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("goldOre").getInt("min");
			int max = config.getConfigurationSection("goldOre").getInt("max");
			p.giveExp(mult * min + new Random().nextInt(mult* (max - min)));
		}
		if (b == Material.MOB_SPAWNER) {
			e.setExpToDrop(0);
			if (!(config.getConfigurationSection("mobSpawner").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("mobSpawner").getInt("min");
			int max = config.getConfigurationSection("mobSpawner").getInt("max");
			p.giveExp(mult * min + new Random().nextInt(mult* (max - min)));
		}
	}
}
