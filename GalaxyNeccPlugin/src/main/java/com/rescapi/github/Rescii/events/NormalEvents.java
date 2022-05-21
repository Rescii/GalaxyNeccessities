package com.rescapi.github.Rescii.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class NormalEvents implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        player.sendMessage(ChatColor.WHITE + "-------------------------------");
        player.sendMessage(ChatColor.BLUE +"PvP Mechanics "+ChatColor.RESET+"| "+ChatColor.GREEN+"V 1.0.0"+ChatColor.RESET+" | GLHF!");
        player.sendMessage("\n");
        player.sendMessage(ChatColor.YELLOW + "Twitter: " + ChatColor.RESET + "https://twitter.com/PvpMechanics");
        player.sendMessage(ChatColor.YELLOW + "Issues: " + ChatColor.RESET + "");
    }

}
