package com.rescapi.github.Rescii;

import com.rescapi.github.Rescii.commands.ReportIssue;
import com.rescapi.github.Rescii.events.MinigameEvents;
import com.rescapi.github.Rescii.events.NormalEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class GalaxyNecessities extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Registering events for Necessities.");

        getServer().getPluginManager().registerEvents(new MinigameEvents(), this);
        getServer().getPluginManager().registerEvents(new NormalEvents(), this);

        this.getCommand("ReportIssue").setExecutor(new ReportIssue());

        Bukkit.getLogger().info("Necessities event registering finished.");
    }



}
