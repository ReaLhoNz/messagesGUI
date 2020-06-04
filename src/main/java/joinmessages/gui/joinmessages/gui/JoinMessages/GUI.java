package joinmessages.gui.joinmessages.gui.JoinMessages;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class GUI extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aOnline"));
        getServer().getPluginManager().registerEvents(new JoinMessages(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cDisabled"));
    }
}
