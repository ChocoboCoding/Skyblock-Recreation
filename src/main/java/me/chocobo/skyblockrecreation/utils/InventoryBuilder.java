package me.chocobo.skyblockrecreation.utils;

import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class InventoryBuilder {
    Inventory inv;
    int size;
    InventoryType type;
    String title;

    public InventoryBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public InventoryBuilder setType(InventoryType type) {
        this.type = type;
        return this;
    }

    public InventoryBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public InventoryBuilder createType() {
        inv = Bukkit.createInventory(null, size, title);
        return this;
    }

    public InventoryBuilder createSize() {
        inv = Bukkit.createInventory(null, type, title);
        return this;
    }

    public InventoryBuilder fillInventory(ItemStack itemStack) {
        for(int i = 0; i < inv.getSize(); i++) {
            inv.setItem(i, itemStack);
        }
        return this;
    }

    public Inventory build() {
        return inv;
    }
}
