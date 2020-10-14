package com.atom.uselessImplementations;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new ProjectListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
}
