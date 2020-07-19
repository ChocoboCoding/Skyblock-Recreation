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
    List<ItemStack> startupItems = Startup.getUiItems();

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if(event.getItem().equals(Startup.getUiItems().get(0))) {
            event.setCancelled(true);
            Inventory inv = new InventoryBuilder().setSize(9*6).setTitle("SkyBlock Menu").createSize()
                    .fillInventory(new ItemBuilder().setMaterial(Material.STAINED_GLASS_PANE).setDisplayName("").build()).build();
            inv.setItem(13, new ItemBuilder().setMaterial(Material.SKULL).setDisplayName("§2Your SkyBlock Profile").build());
            for(int i = 0; i < 7; i++) {
                inv.setItem(i+19, startupItems.get(i));
            }
            inv.setItem(31, startupItems.get(9));
            for(int i = 0; i < 4; i++) {
                inv.setItem(i+47, startupItems.get(i+12));
            }
            event.getPlayer().openInventory(inv );
        }
    }
}
