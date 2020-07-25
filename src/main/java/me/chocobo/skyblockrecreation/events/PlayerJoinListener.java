package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().getInventory().setItem(8, Startup.getUiItems().get(0));
        Startup.addSkyblockPlayer(new SkyblockPlayer(event.getPlayer().getUniqueId()));
    }
}
