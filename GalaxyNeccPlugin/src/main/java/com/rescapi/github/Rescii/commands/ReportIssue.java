package com.rescapi.github.Rescii.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReportIssue implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        player.sendMessage("["+ChatColor.YELLOW + "RodBot" + ChatColor.RESET+"]  Go to " + ChatColor.GREEN +
                "https://github.com/Rescii/IssueTracker/issues" + ChatColor.RESET + " to report issues!");

        return false;
    }
}
