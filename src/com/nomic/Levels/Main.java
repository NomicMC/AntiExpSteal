package com.nomic.Levels;

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
		pm.registerEvents(new Block(this), this);
	}
	
	public void registerCommands() {
		getCommand("levels").setExecutor(new Cmd(this));
	}
	
	private void registerConfig() {
    	getConfig().options().copyDefaults(true);
    	saveConfig();
    }
}
