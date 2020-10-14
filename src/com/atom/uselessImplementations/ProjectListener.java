package com.atom.uselessImplementations;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class ProjectListener implements Listener {
	@EventHandler
	public void EntityDamageByEntityEvent(Entity damager, Entity damagee, EntityDamageEvent.DamageCause cause, double damage) {
		damager.sendMessage(ChatColor.GRAY + "You hurt " + damagee.getName() + "! You dealt " + damage + " damage!");
		damagee.sendMessage(ChatColor.DARK_RED + "You were hurt by " + damager.getName() + "! You took " + damage + " damage!");
	}
	
	@EventHandler
	public void EntityTameEvent(LivingEntity tamed, AnimalTamer owner) {
		Bukkit.broadcastMessage(owner.getName() + " just tamed " + tamed.getName() + "!");
	}
}
