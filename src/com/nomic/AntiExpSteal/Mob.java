package com.nomic.AntiExpSteal;

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
		p.giveExp(mult * e.getDroppedExp());
		e.setDroppedExp(0);
	}
}
