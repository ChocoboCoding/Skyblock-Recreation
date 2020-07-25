package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        try {
            Startup.getSkyblockPlayers().remove(event.getPlayer().getUniqueId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
