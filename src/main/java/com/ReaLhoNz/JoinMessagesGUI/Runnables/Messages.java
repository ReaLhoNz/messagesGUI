package com.ReaLhoNz.JoinMessagesGUI.Runnables;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Messages extends BukkitRunnable {
    private void swap(List<String> a, int i, int change) {
        String helper = a.get(i);
        a.set(i, a.get(change));
        a.set(change, helper);
                    }
    private void shuffleList(List<String> a) {
        int n = a.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
                }
            }

    @Override

    public void run() {
        ArrayList<String> Messages = new ArrayList<String>();
        Messages.add("&c&lVítej šuldo");
        Messages.add("&c&lVítej kulajdo");
        shuffleList(Messages);
        for(Player P : Bukkit.getOnlinePlayers()){
            P.sendMessage(ChatColor.translateAlternateColorCodes('&', (Messages.get(0))));

        }
    }
}

