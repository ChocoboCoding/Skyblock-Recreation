package me.chocobo.skyblockrecreation.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemBuilder {
    ItemStack itemStack;
    ItemMeta itemMeta;
    Material material;
    int amount = 1;

    public ItemBuilder setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public ItemBuilder setDurability(short durability) {
        if(itemStack == null) itemStack = new ItemStack(material, amount);
        itemStack.setDurability(durability);
        return this;
    }

    private void getItemMeta() {
        if(itemStack == null) itemStack = new ItemStack(material, amount);
        itemMeta = itemStack.getItemMeta();
    }

    private void setItemMeta() {
        itemStack.setItemMeta(itemMeta);
    }

    public ItemBuilder setLore(List<String> lore) {
        if (itemMeta == null) getItemMeta();
        itemMeta.setLore(lore);
        return this;
    }

    public ItemBuilder setUnbreakable() {
        if (itemMeta == null) getItemMeta();
        itemMeta.setUnbreakable(true);
        return this;
    }

    public ItemBuilder setDisplayName(String name) {
        if (itemMeta == null) getItemMeta();
        itemMeta.setDisplayName(name);
        return this;
    }

    public ItemStack build() {
        if (itemMeta != null) setItemMeta();
        return itemStack;
    }

}
