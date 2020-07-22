package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.utils.InventoryBuilder;
import me.chocobo.skyblockrecreation.utils.ItemBuilder;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class RightClickListener implements Listener {


    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if(event.getItem().equals(Startup.getUiItems().get(0))) {
            event.setCancelled(true);
            Inventory inv = Startup.createSbMenu();
            Startup.fillSbMenu(event.getPlayer(), inv);
            event.getPlayer().openInventory(inv);
        }
    }
}
