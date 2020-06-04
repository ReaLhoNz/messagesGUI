package com.ReaLhoNz.JoinMessagesGUI;

import com.ReaLhoNz.JoinMessagesGUI.Events.CustomMessages;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aOnline"));
        getServer().getPluginManager().registerEvents(new CustomMessages(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cDisabled"));
    }
}
