package com.rescapi.github.Rescii.events;

import com.rescapi.github.Rescii.values.PlayerHashMaps;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class MinigameEvents implements Listener {
    @EventHandler
    public void onDrop(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        if (PlayerHashMaps.DisallowDropping.get(player)) {
           event.setCancelled(true);
           player.sendMessage(ChatColor.DARK_RED + "You're not currently allowed to drop items!");
        }
    }
}
