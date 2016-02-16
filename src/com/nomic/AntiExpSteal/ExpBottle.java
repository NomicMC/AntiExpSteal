package com.nomic.AntiExpSteal;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class ExpBottle implements Listener {
	
	private Main plugin;

	public ExpBottle(Main pl) {
		plugin = pl;
	}
	
	@EventHandler
	   public void onEvent(ProjectileLaunchEvent e) {
	     if(!(e.getEntity() instanceof ThrownExpBottle))
	       return;
	     ThrownExpBottle bottle = (ThrownExpBottle) e.getEntity();
	     if(!(bottle.getShooter() instanceof Player))
	       return;
	     Player p = (Player) bottle.getShooter();
	     int min = plugin.getConfig().getInt("expBottleGiveMin");
	     int max = plugin.getConfig().getInt("expBottleGiveMax");
	     int mult = plugin.getConfig().getInt("expMultiplier");
	     if (p.hasPermission("antisteal.expbottle") || p.isOp()) {
	     p.giveExp(mult * min + new Random().nextInt(mult * (max - min)));
	     e.setCancelled(true);
	   }
	}
}
