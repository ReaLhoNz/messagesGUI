package com.ReaLhoNz.JoinMessagesGUI;

import com.ReaLhoNz.JoinMessagesGUI.Events.JoinMessages;
import com.ReaLhoNz.JoinMessagesGUI.Runnables.Messages;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinMessages(),this);
        new Messages().runTaskTimer(this, 2400l,6000l );
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aOnline"));




    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cDisabled"));
    }
}
