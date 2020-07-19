package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent event) {
        if (event.getCurrentItem().equals(Startup.getUiItems().get(1))) event.setCancelled(true);
    }
}
