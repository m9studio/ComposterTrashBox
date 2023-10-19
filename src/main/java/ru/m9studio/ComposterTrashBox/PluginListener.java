package ru.m9studio.ComposterTrashBox;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class PluginListener implements org.bukkit.event.Listener
{
	@EventHandler
	public void onPlayerInteractEntityEvent(PlayerInteractEvent e)
	{
		ItemStack I = e.getPlayer().getInventory().getItemInMainHand();
		if
		(
			e.getClickedBlock().getType() == Material.COMPOSTER &&
					e.getAction() == Action.RIGHT_CLICK_BLOCK &&
					I.getType() != Material.AIR
		)
		{
			int amount = 0;
			if(!e.getPlayer().isSneaking())
			{
				amount = I.getAmount() - 1;
			}
			I.setAmount(amount);
			e.setCancelled(true);
		}
	}
}
