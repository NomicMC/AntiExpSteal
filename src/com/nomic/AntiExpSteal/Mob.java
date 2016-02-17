package com.nomic.AntiExpSteal;

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
		if (!(p instanceof Player))
			return;
		if (!(p.hasPermission("antisteal.mob")))
			return;
		int mult = plugin.getConfig().getInt("expMultiplier");
		EntityType mob = e.getEntity().getType();
		ConfigurationSection configmin = plugin.getConfig().getConfigurationSection("mobExp")
				.getConfigurationSection("min");
		ConfigurationSection configmax = plugin.getConfig().getConfigurationSection("mobExp")
				.getConfigurationSection("max");
		ConfigurationSection confige = plugin.getConfig().getConfigurationSection("mobExp")
				.getConfigurationSection("enabled");
		if (mob == EntityType.BAT) {
			e.setDroppedExp(0);
			if (!(confige.get("bat").equals(true)))
				return;
			int min = configmin.getInt("bat");
			int max = configmax.getInt("bat");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.BLAZE) {
			e.setDroppedExp(0);
			if (!(confige.get("blaze").equals(true)))
				return;
			int min = configmin.getInt("blaze");
			int max = configmax.getInt("blaze");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.CAVE_SPIDER) {
			e.setDroppedExp(0);
			if (!(confige.get("caveSpider").equals(true)))
				return;
			int min = configmin.getInt("caveSpider");
			int max = configmax.getInt("caveSpider");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.CHICKEN) {
			e.setDroppedExp(0);
			if (!(confige.get("chicken").equals(true)))
				return;
				int min = configmin.getInt("chicken");
				int max = configmax.getInt("chicken");
				p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.COW) {
			e.setDroppedExp(0);
			if (!(confige.get("cow").equals(true)))
				return;
			int min = configmin.getInt("cow");
			int max = configmax.getInt("cow");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.CREEPER) {
			e.setDroppedExp(0);
			if (!(confige.get("creeper").equals(true)))
				return;
			int min = configmin.getInt("creeper");
			int max = configmax.getInt("creeper");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.ENDER_DRAGON) {
			e.setDroppedExp(0);
			if (!(confige.get("enderDragon").equals(true)))
				return;
			int min = configmin.getInt("enderDragon");
			int max = configmax.getInt("enderDragon");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.ENDERMAN) {
			e.setDroppedExp(0);
			if (!(confige.get("enderman").equals(true)))
				return;
			int min = configmin.getInt("enderman");
			int max = configmax.getInt("enderman");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.ENDERMITE) {
			e.setDroppedExp(0);
			if (!(confige.get("endermite").equals(true)))
				return;
			int min = configmin.getInt("endermite");
			int max = configmax.getInt("endermite");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.GHAST) {
			if (!(confige.get("ghast").equals(true)))
				return;
			int min = configmin.getInt("ghast");
			int max = configmax.getInt("ghast");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.GIANT) {
			e.setDroppedExp(0);
			if (!(confige.get("giant").equals(true)))
				return;
			int min = configmin.getInt("giant");
			int max = configmax.getInt("giant");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.GUARDIAN) {
			e.setDroppedExp(0);
			if (!(confige.get("guardian").equals(true)))
				return;
			int min = configmin.getInt("guardian");
			int max = configmax.getInt("guardian");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.HORSE) {
			e.setDroppedExp(0);
			if (!(confige.get("horse").equals(true)))
				return;
			int min = configmin.getInt("horse");
			int max = configmax.getInt("horse");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.IRON_GOLEM) {
			e.setDroppedExp(0);
			if (!(confige.get("ironGolem").equals(true)))
				return;
			int min = configmin.getInt("ironGolem");
			int max = configmax.getInt("ironGolem");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.MAGMA_CUBE) {
			e.setDroppedExp(0);
			if (!(confige.get("magmaCube").equals(true)))
				return;
			int min = configmin.getInt("magmaCube");
			int max = configmax.getInt("magmaCube");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.MUSHROOM_COW) {
			e.setDroppedExp(0);
			if (!(confige.get("mushroomCow").equals(true)))
				return;
			int min = configmin.getInt("mushroomCow");
			int max = configmax.getInt("mushroomCow");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.OCELOT) {
			e.setDroppedExp(0);
			if (!(confige.get("ocelot").equals(true)))
				return;
			int min = configmin.getInt("ocelot");
			int max = configmax.getInt("ocelot");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.PIG) {
			e.setDroppedExp(0);
			if (!(confige.get("pig").equals(true)))
				return;
			int min = configmin.getInt("pig");
			int max = configmax.getInt("pig");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.PIG_ZOMBIE) {
			e.setDroppedExp(0);
			if (!(confige.get("pigZombie").equals(true)))
				return;
			int min = configmin.getInt("pigZombie");
			int max = configmax.getInt("pigZombie");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.RABBIT) {
			e.setDroppedExp(0);
			if (!(confige.get("rabbit").equals(true)))
				return;
			int min = configmin.getInt("rabbit");
			int max = configmax.getInt("rabbit");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.SHEEP) {
			e.setDroppedExp(0);
			if (!(confige.get("sheep").equals(true)))
				return;
			int min = configmin.getInt("sheep");
			int max = configmax.getInt("sheep");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.SILVERFISH) {
			e.setDroppedExp(0);
			if (!(confige.get("silverfish").equals(true)))
				return;
			int min = configmin.getInt("silverfish");
			int max = configmax.getInt("silverfish");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.SKELETON) {
			e.setDroppedExp(0);
			if (!(confige.get("skeleton").equals(true)))
				return;
			int min = configmin.getInt("skeleton");
			int max = configmax.getInt("skeleton");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.SLIME) {
			e.setDroppedExp(0);
			if (!(confige.get("slime").equals(true)))
				return;
			int min = configmin.getInt("slime");
			int max = configmax.getInt("slime");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.SPIDER) {
			e.setDroppedExp(0);
			if (!(confige.get("spider").equals(true)))
				return;
			int min = configmin.getInt("spider");
			int max = configmax.getInt("spider");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.SQUID) {
			e.setDroppedExp(0);
			if (!(confige.get("squid").equals(true)))
				return;
			int min = configmin.getInt("squid");
			int max = configmax.getInt("squid");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.VILLAGER) {
			e.setDroppedExp(0);
			if (!(confige.get("villager").equals(true)))
				return;
			int min = configmin.getInt("villager");
			int max = configmax.getInt("villager");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.WITCH) {
			e.setDroppedExp(0);
			if (!(confige.get("witch").equals(true)))
				return;
			int min = configmin.getInt("witch");
			int max = configmax.getInt("witch");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.WITHER) {
			e.setDroppedExp(0);
			if (!(confige.get("wither").equals(true)))
				return;
			int min = configmin.getInt("wither");
			int max = configmax.getInt("wither");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.WOLF) {
			e.setDroppedExp(0);
			if (!(confige.get("wolf").equals(true)))
				return;
			int min = configmin.getInt("wolf");
			int max = configmax.getInt("wolf");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
		if (mob == EntityType.ZOMBIE) {
			e.setDroppedExp(0);
			if (!(confige.get("zombie").equals(true)))
				return;
			int min = configmin.getInt("zombie");
			int max = configmax.getInt("zombie");
			p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
		}
	}
}
