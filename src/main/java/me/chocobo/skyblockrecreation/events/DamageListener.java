package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        if (event.getEntityType().equals(EntityType.PLAYER)){
            Player player = (Player) event.getEntity();
            SkyblockPlayer sbPlayer = Startup.getSkyblockPlayers().get(player.getUniqueId());
        }
    }
}
