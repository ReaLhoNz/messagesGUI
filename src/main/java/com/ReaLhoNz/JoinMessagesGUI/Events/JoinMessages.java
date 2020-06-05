package com.ReaLhoNz.JoinMessagesGUI.Events;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinMessages implements Listener{


     @EventHandler (priority = EventPriority.HIGHEST) // EventPriority.HIGHEST aby zprava nebyla modifikovana nikym jinym
     public void JoinMessages(PlayerJoinEvent event){

         event.setJoinMessage(null);
         Player player = event.getPlayer();

         for(Player P :Bukkit.getOnlinePlayers()){
            P.sendMessage(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(player,"&a&l+ %player_displayname%")));
         }
     }

    @EventHandler (priority = EventPriority.HIGHEST) // EventPriority.HIGHEST aby zprava nebyla modifikovana nikym jinym
    public void LeaveMessages(PlayerQuitEvent event){
        event.setQuitMessage(null);
        Player player = event.getPlayer();

        for(Player P :Bukkit.getOnlinePlayers()){
            P.sendMessage(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(player,"&c&l- %player_displayname%")));
        }
     }

    @EventHandler (priority = EventPriority.HIGHEST) // EventPriority.HIGHEST aby zprava nebyla modifikovana nikym jinym
    public void DeathMessages(PlayerDeathEvent event){
        event.setDeathMessage(null);
        Player player = event.getEntity();

        for(Player P :Bukkit.getOnlinePlayers()){
            P.sendMessage(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(player,"&c%player_displayname% Umřel")));
        }
     }
}


