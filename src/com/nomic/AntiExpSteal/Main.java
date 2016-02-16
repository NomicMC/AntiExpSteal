package com.nomic.AntiExpSteal;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		registerEvents();
		registerCommands();
		registerConfig();
	}

	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new ExpBottle(this), this);
		pm.registerEvents(new Mob(this), this);
	}
	
	public void registerCommands() {
		getCommand("expmult").setExecutor(new MultiplierCmd(this));
	}
	
	private void registerConfig() {
    	getConfig().options().copyDefaults(true);
    	saveConfig();
    }
}
