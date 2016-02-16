package com.nomic.AntiExpSteal;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MultiplierCmd implements CommandExecutor {
	
	private Main plugin;

	public MultiplierCmd(Main pl) {
		plugin = pl;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to do this!");
			return false;
		}

		Player p = (Player) sender;
		if (args.length == 0) {
			p.sendMessage(ChatColor.RED + "Please enter a number for the multiplier.");
		} else if (args.length == 1) {
			plugin.getConfig().set("expMultiplier", args[0]);
			String msg = ChatColor.translateAlternateColorCodes('&',"&aExp multiplier set to &7(&e" + args[0] + "&7)&a.");
			p.sendMessage(msg);
		}
		return true;
	}
}
