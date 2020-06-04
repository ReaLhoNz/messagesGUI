package joinmessages.gui.joinmessages.gui.JoinMessages;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
public class JoinMessages implements Listener{


     @EventHandler
     public void JoinMessages(PlayerJoinEvent event){

         event.setJoinMessage(null);
         Player player = event.getPlayer();

            for(Player P :Bukkit.getOnlinePlayers()){


    P.sendMessage(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(player,"&a+ %player_displayname%")));

                    }
                }
            }


