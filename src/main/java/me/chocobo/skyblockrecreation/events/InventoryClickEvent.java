package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.event.Listener;

public class InventoryClickEvent implements Listener {

    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent event) {
        if (event.getCurrentItem().equals(Startup.getItems().get(1))) event.setCancelled(true);
    }
}
