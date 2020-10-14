package com.atom.uselessImplementations;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;

public class ProjectListener implements Listener {
	
	@EventHandler
	public void PlayerJoinEvent(Player playerJoined, String joinMessage) {
		if (!playerJoined.hasPlayedBefore()) {
			ItemStack ironPickaxe = new ItemStack(Material.IRON_PICKAXE, 1);
			ItemStack ironSword = new ItemStack(Material.IRON_SWORD, 1);
			ItemStack ironAxe = new ItemStack(Material.IRON_AXE, 1);
			ItemStack ironShovel = new ItemStack(Material.IRON_SHOVEL, 1);
			ItemStack baseFood = new ItemStack(Material.COOKED_BEEF, 16);
			ItemStack ironHelm = new ItemStack(Material.IRON_HELMET);
			ItemStack ironChest = new ItemStack(Material.IRON_CHESTPLATE);
			ItemStack ironLeggings = new ItemStack(Material.IRON_LEGGINGS);
			ItemStack ironBoots = new ItemStack(Material.IRON_BOOTS);
			
			playerJoined.getInventory().addItem(ironPickaxe, ironSword, ironAxe, ironShovel, baseFood, ironHelm, ironLeggings, ironBoots);
		}
	}
	
	@EventHandler
	public void EntityDamageByEntityEvent(Entity damager, Entity damagee, EntityDamageEvent.DamageCause cause, double damage) {
		damager.sendMessage(ChatColor.GRAY + "You hurt " + damagee.getName() + "! You dealt " + damage + " damage!");
		damagee.sendMessage(ChatColor.DARK_RED + "You were hurt by " + damager.getName() + "! You took " + damage + " damage!");
	}
	
	@EventHandler
	public void EntityTameEvent(LivingEntity tamed, AnimalTamer owner) {
		Bukkit.broadcastMessage(owner.getName() + " just tamed " + tamed.getName() + "!");
	}
	
	@EventHandler
	public void PlayerItemConsumeEvent(Player player, ItemStack item) {
		player.sendMessage("You consumed a " + item + ".");
	}
}
