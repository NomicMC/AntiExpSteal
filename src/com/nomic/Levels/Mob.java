package com.nomic.Levels;

import java.util.Random;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class Mob implements Listener {

	private Main plugin;

	public Mob(Main pl) {
		plugin = pl;
	}

	@EventHandler
	public void onKill(EntityDeathEvent e) {
		Player p = e.getEntity().getKiller();
		EntityType mob = e.getEntity().getType();
		if (!(p instanceof Player))
			return;
		if (!(p.hasPermission("levels.mob")))
			return;

		ConfigurationSection config = plugin.getConfig().getConfigurationSection("mobExp");
		int mult = plugin.getConfig().getInt("expMultiplier");

		if (mob == EntityType.BAT) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("bat").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("bat").getInt("min");
			int max = config.getConfigurationSection("bat").getInt("max");
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
		if (mob == EntityType.BLAZE) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("blaze").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("blaze").getInt("min");
			int max = config.getConfigurationSection("blaze").getInt("max");
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
		if (mob == EntityType.CAVE_SPIDER) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("caveSpider").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("caveSpider").getInt("min");
			int max = config.getConfigurationSection("caveSpider").getInt("max");
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
		if (mob == EntityType.CHICKEN) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("chicken").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("chicken").getInt("min");
			int max = config.getConfigurationSection("chicken").getInt("max");
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
		if (mob == EntityType.COW) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("cow").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("cow").getInt("min");
			int max = config.getConfigurationSection("cow").getInt("max");
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
		if (mob == EntityType.CREEPER) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("creeper").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("creeper").getInt("min");
			int max = config.getConfigurationSection("creeper").getInt("max");
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
		if (mob == EntityType.ENDER_DRAGON) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("enderDragon").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("enderDragon").getInt("min");
			int max = config.getConfigurationSection("enderDragon").getInt("max");
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
		if (mob == EntityType.ENDERMAN) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("enderman").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("enderman").getInt("min");
			int max = config.getConfigurationSection("enderman").getInt("max");
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
		if (mob == EntityType.ENDERMITE) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("endermite").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("endermite").getInt("min");
			int max = config.getConfigurationSection("endermite").getInt("max");
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
		if (mob == EntityType.GHAST) {
			if (!(config.getConfigurationSection("ghast").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("ghast").getInt("min");
			int max = config.getConfigurationSection("ghast").getInt("max");
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
		if (mob == EntityType.GIANT) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("giant").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("giant").getInt("min");
			int max = config.getConfigurationSection("giant").getInt("max");
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
		if (mob == EntityType.GUARDIAN) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("guardian").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("guardian").getInt("min");
			int max = config.getConfigurationSection("guardian").getInt("max");
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
		if (mob == EntityType.HORSE) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("horse").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("horse").getInt("min");
			int max = config.getConfigurationSection("horse").getInt("max");
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
		if (mob == EntityType.IRON_GOLEM) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("ironGolem").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("ironGolem").getInt("min");
			int max = config.getConfigurationSection("ironGolem").getInt("max");
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
		if (mob == EntityType.MAGMA_CUBE) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("magmaCube").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("magmaCube").getInt("min");
			int max = config.getConfigurationSection("magmaCube").getInt("max");
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
		if (mob == EntityType.MUSHROOM_COW) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("mushroomCow").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("mushroomCow").getInt("min");
			int max = config.getConfigurationSection("mushroomCow").getInt("max");
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
		if (mob == EntityType.OCELOT) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("ocelot").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("ocelot").getInt("min");
			int max = config.getConfigurationSection("ocelot").getInt("max");
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
		if (mob == EntityType.PIG) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("pig").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("pig").getInt("min");
			int max = config.getConfigurationSection("pig").getInt("max");
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
		if (mob == EntityType.PIG_ZOMBIE) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("pigZombie").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("pigZombie").getInt("min");
			int max = config.getConfigurationSection("pigZombie").getInt("max");
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
		if (mob == EntityType.RABBIT) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("rabbit").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("rabbit").getInt("min");
			int max = config.getConfigurationSection("rabbit").getInt("max");
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
		if (mob == EntityType.SHEEP) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("sheep").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("sheep").getInt("min");
			int max = config.getConfigurationSection("sheep").getInt("max");
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
		if (mob == EntityType.SILVERFISH) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("silverfish").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("silverfish").getInt("min");
			int max = config.getConfigurationSection("silverfish").getInt("max");
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
		if (mob == EntityType.SKELETON) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("skeleton").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("skeleton").getInt("min");
			int max = config.getConfigurationSection("skeleton").getInt("max");
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
		if (mob == EntityType.SLIME) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("slime").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("slime").getInt("min");
			int max = config.getConfigurationSection("slime").getInt("max");
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
		if (mob == EntityType.SPIDER) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("spider").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("spider").getInt("min");
			int max = config.getConfigurationSection("spider").getInt("max");
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
		if (mob == EntityType.SQUID) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("squid").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("squid").getInt("min");
			int max = config.getConfigurationSection("squid").getInt("max");
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
		if (mob == EntityType.VILLAGER) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("villager").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("villager").getInt("min");
			int max = config.getConfigurationSection("villager").getInt("max");
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
		if (mob == EntityType.WITCH) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("witch").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("witch").getInt("min");
			int max = config.getConfigurationSection("witch").getInt("max");
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
		if (mob == EntityType.WITHER) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("wither").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("wither").getInt("min");
			int max = config.getConfigurationSection("wither").getInt("max");
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
		if (mob == EntityType.WOLF) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("wolf").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("wolf").getInt("min");
			int max = config.getConfigurationSection("wolf").getInt("max");
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
		if (mob == EntityType.ZOMBIE) {
			e.setDroppedExp(0);
			if (!(config.getConfigurationSection("zombie").get("enabled").equals(true)))
				return;
			int min = config.getConfigurationSection("zombie").getInt("min");
			int max = config.getConfigurationSection("zombie").getInt("max");
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
