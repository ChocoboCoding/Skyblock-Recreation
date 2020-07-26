package me.chocobo.skyblockrecreation.dataTypes;

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class SkyblockInventory {

    Map<Integer, SkyblockItem> inventory;

    public SkyblockInventory() {
        setInventory(new HashMap<>());
    }

    public Map<Integer, SkyblockItem> getInventory() {
        return inventory;
    }
    public SkyblockItem getItem(int index) {
        return inventory.get(index);
    }

    public SkyblockInventory setInventory(Map<Integer, SkyblockItem> inventory) {
        this.inventory = inventory;
        return this;
    }
    public SkyblockInventory setSkyblockItem(SkyblockItem item, Integer index) {
        inventory.put(index, item);
        return this;
    }
    public SkyblockInventory addSkyblockItem(SkyblockItem item) {
        for(int i = 0; i < 40; i++) {
            if (inventory.get(i) == null) {
                System.out.println("addSkyblockItem if 1 " + i);
                inventory.put(i, item);
                System.out.println("addSkyblockItem if 2 " + i);
                break;
            }
            System.out.println("addSkyblockItem" + i);
        }
        return this;
    }

    public SkyblockInventory removeSkyblockItem(Integer slot) {
        inventory.remove(slot);
        return this;
    }
    public SkyblockItem getSkyblockItem(Integer slot) {
        return inventory.get(slot);
    }
    public SkyblockItem getSkyblockItem(ItemStack itemStack) {
        for (int i = 0; i < 40; i++) {
            if (i > 35) {
                i += 64;
            }
            return getSkyblockItem(i);
        }
        return new SkyblockItem();
    }
}
