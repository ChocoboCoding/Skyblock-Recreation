package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.utils.Startup;

public class PlayerJoinEvent {
    public void onJoin(org.bukkit.event.player.PlayerJoinEvent event) {
        event.getPlayer().getInventory().setItem(8, Startup.getItems().get(0));
        Startup.addPlayer(new SkyblockPlayer(event.getPlayer().getUniqueId()));
    }
}
