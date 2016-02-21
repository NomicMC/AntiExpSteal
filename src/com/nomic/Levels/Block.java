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
			int min = config.getConfigurationSection("coalOre").getInt("min");
			int max = config.getConfigurationSection("coalOre").getInt("max");
			if (min > 0 && max > 1 && (min != max)) {
			    if (!(p.hasPermission("levels.double") || p.hasPermission("levels.triple"))) {
					p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
				}
			    if (p.hasPermission("levels.double")) {
				    p.giveExp(2 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			    if (p.hasPermission("levels.triple")) {
				    p.giveExp(3 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			}
		}
		if (b == Material.DIAMOND_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("diamondOre").getInt("min");
			int max = config.getConfigurationSection("diamondOre").getInt("max");
			if (min > 0 && max > 1 && (min != max)) {
			    if (!(p.hasPermission("levels.double") || p.hasPermission("levels.triple"))) {
					p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
				}
			    if (p.hasPermission("levels.double")) {
				    p.giveExp(2 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			    if (p.hasPermission("levels.triple")) {
				    p.giveExp(3 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			}
		}
		if (b == Material.EMERALD_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("emeraldOre").getInt("min");
			int max = config.getConfigurationSection("emeraldOre").getInt("max");
			if (min > 0 && max > 1 && (min != max)) {
			    if (!(p.hasPermission("levels.double") || p.hasPermission("levels.triple"))) {
					p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
				}
			    if (p.hasPermission("levels.double")) {
				    p.giveExp(2 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			    if (p.hasPermission("levels.triple")) {
				    p.giveExp(3 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			}
		}
		if (b == Material.LAPIS_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("lapisOre").getInt("min");
			int max = config.getConfigurationSection("lapisOre").getInt("max");
			if (min > 0 && max > 1 && (min != max)) {
			    if (!(p.hasPermission("levels.double") || p.hasPermission("levels.triple"))) {
					p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
				}
			    if (p.hasPermission("levels.double")) {
				    p.giveExp(2 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			    if (p.hasPermission("levels.triple")) {
				    p.giveExp(3 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			}
		}
		if (b == Material.REDSTONE_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("redstoneOre").getInt("min");
			int max = config.getConfigurationSection("redstoneOre").getInt("max");
			if (min > 0 && max > 1 && (min != max)) {
			    if (!(p.hasPermission("levels.double") || p.hasPermission("levels.triple"))) {
					p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
				}
			    if (p.hasPermission("levels.double")) {
				    p.giveExp(2 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			    if (p.hasPermission("levels.triple")) {
				    p.giveExp(3 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			}
		}
		if (b == Material.QUARTZ_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("quartzOre").getInt("min");
			int max = config.getConfigurationSection("quartzOre").getInt("max");
			if (min > 0 && max > 1 && (min != max)) {
			    if (!(p.hasPermission("levels.double") || p.hasPermission("levels.triple"))) {
					p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
				}
			    if (p.hasPermission("levels.double")) {
				    p.giveExp(2 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			    if (p.hasPermission("levels.triple")) {
				    p.giveExp(3 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			}
		}
		if (b == Material.IRON_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("ironOre").getInt("min");
			int max = config.getConfigurationSection("ironOre").getInt("max");
			if (min > 0 && max > 1 && (min != max)) {
			    if (!(p.hasPermission("levels.double") || p.hasPermission("levels.triple"))) {
					p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
				}
			    if (p.hasPermission("levels.double")) {
				    p.giveExp(2 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			    if (p.hasPermission("levels.triple")) {
				    p.giveExp(3 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			}
		}
		if (b == Material.GOLD_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("goldOre").getInt("min");
			int max = config.getConfigurationSection("goldOre").getInt("max");
			if (min > 0 && max > 1 && (min != max)) {
			    if (!(p.hasPermission("levels.double") || p.hasPermission("levels.triple"))) {
					p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
				}
			    if (p.hasPermission("levels.double")) {
				    p.giveExp(2 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			    if (p.hasPermission("levels.triple")) {
				    p.giveExp(3 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			}
		}
		if (b == Material.MOB_SPAWNER) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("mobSpawner").getInt("min");
			int max = config.getConfigurationSection("mobSpawner").getInt("max");
			if (min > 0 && max > 1 && (min != max)) {
			    if (!(p.hasPermission("levels.double") || p.hasPermission("levels.triple"))) {
					p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
				}
			    if (p.hasPermission("levels.double")) {
				    p.giveExp(2 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			    if (p.hasPermission("levels.triple")) {
				    p.giveExp(3 * (mult * min + new Random().nextInt(mult * (max - min))));
			    }
			}
		}
	}
}
