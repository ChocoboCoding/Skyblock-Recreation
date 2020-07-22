package me.chocobo.skyblockrecreation.events;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerPickupItemListener implements Listener {

    @EventHandler
    public void onPlayerPickupItem(EntityPickupItemEvent event) {
        if (event.getEntityType() == EntityType.PLAYER) {
            ItemStack itemStack = event.getItem().getItemStack();

        }
    }
}
