package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.dataTypes.PlayerStats;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockItem;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerItemHeldListener implements Listener {

    @EventHandler
    public void onPlayerItemHeld(PlayerItemHeldEvent event) {
        Player player = event.getPlayer();
        SkyblockPlayer skyblockPlayer = Startup.getSkyblockPlayers().get(player.getUniqueId());

        SkyblockItem oldSkyblockItem = skyblockPlayer.getInventory().getSkyblockItem(player.getInventory().getItem(event.getPreviousSlot()));
        SkyblockItem newSkyblockItem = skyblockPlayer.getInventory().getSkyblockItem(player.getInventory().getItem(event.getNewSlot()));

        skyblockPlayer.removeStrength(oldSkyblockItem.getStrength()).removeCritDamage(oldSkyblockItem.getCritDamage()).
                removeCritHit(oldSkyblockItem.getCritHit()).removeAttackSpeed(oldSkyblockItem.getAttackSpeed()).
                removeIntelligence(oldSkyblockItem.getIntelligence()).removeMovementSpeed(oldSkyblockItem.getMovementSpeed()).
                removeDefense(oldSkyblockItem.getDefense()).
                addStrength(newSkyblockItem.getStrength()).addCritDamage(newSkyblockItem.getCritDamage()).
                addCritHit(newSkyblockItem.getCritHit()).addAttackSpeed(newSkyblockItem.getAttackSpeed()).
                addIntelligence(newSkyblockItem.getIntelligence()).addMovementSpeed(newSkyblockItem.getMovementSpeed()).
                addDefense(newSkyblockItem.getDefense());

    }
}
