package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.ItemRarity;
import me.chocobo.skyblockrecreation.enums.ItemType;
import me.chocobo.skyblockrecreation.enums.Reforge;
import me.chocobo.skyblockrecreation.enums.Rune;
import me.chocobo.skyblockrecreation.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SkyblockItem {

    protected String name;
    protected Material material;
    protected int amount;
    protected ItemRarity rarity;
    protected ItemType type;
    protected Reforge reforge;
    protected List<String> lore;
    protected int hpb;
    protected ItemStats itemStats;
    protected Rune rune;

    public String getName() {
        return name;
    }
    public Material getMaterial() {
        return material;
    }
    public int getAmount() {
        return amount;
    }
    public ItemRarity getRarity() {
        return rarity;
    }
    public ItemType getType() {
        return type;
    }
    public Reforge getReforge() {
        return reforge;
    }
    public List<String> getLore() {
        return lore;
    }
    public int getHpb() {
        return hpb;
    }
    public ItemStats getItemStats() {
        return itemStats;
    }
    public int getDamage() {
        return itemStats.getDamage();
    }
    public int getStrength() {
        return itemStats.getStrength();
    }
    public int getCritDamage() {
        return itemStats.getCritDamage();
    }
    public int getCritHit() {
        return itemStats.getCritHit();
    }
    public int getAttackSpeed() {
        return itemStats.getAttackSpeed();
    }
    public int getIntelligence() {
        return itemStats.getIntelligence();
    }
    public int getMovementSpeed() {
        return itemStats.getMovementSpeed();
    }
    public int getDefense() {
        return itemStats.getDefense();
    }
    public Rune getRune() {
        return rune;
    }

    public SkyblockItem setName(String name) {
        this.name = name;
        return this;
    }
    public SkyblockItem setMaterial(Material material) {
        this.material = material;
        return this;
    }
    public SkyblockItem setAmount(int amount) {
        this.amount = amount;
        return this;
    }
    public SkyblockItem setRarity(ItemRarity rarity) {
        this.rarity = rarity;
        return this;
    }
    public SkyblockItem setType(ItemType type) {
        this.type = type;
        return this;
    }
    public SkyblockItem setReforge(Reforge reforge) {
        this.reforge = reforge;
        return this;
    }
    public SkyblockItem setLore(String lore) {
        this.lore = LoreBuilder.cutLore(lore);
        return this;
    }
    public SkyblockItem setHpb(int hpb) {
        this.hpb = hpb;
        return this;
    }
    public SkyblockItem addHpb() {
        this.hpb++;
        return this;
    }
    public SkyblockItem setItemStats(ItemStats itemStats) {
        this.itemStats = itemStats;
        return this;
    }
    public SkyblockItem setDamage(int damage) {
        itemStats.setDamage(damage);
        return this;
    }
    public SkyblockItem addDamage(int damage) {
        setDamage(getDamage() + damage);
        return this;
    }
    public SkyblockItem removeDamage(int damage) {
        setDamage(getDamage() - damage);
        return this;
    }
    public SkyblockItem setStrength(int strength) {
        itemStats.setStrength(strength);
        return this;
    }
    public SkyblockItem addStrength(int strength) {
        setStrength(getStrength() + strength);
        return this;
    }
    public SkyblockItem removeStrength(int strength) {
        setStrength(getStrength() - strength);
        return this;
    }
    public SkyblockItem setCritDamage(int critDamage) {
        itemStats.setCritDamage(critDamage);
        return this;
    }
    public SkyblockItem addCritDamage(int critDamage) {
        setCritDamage(getCritDamage() + critDamage);
        return this;
    }
    public SkyblockItem removeCritDamage(int critDamage) {
        setCritDamage(getCritDamage() - critDamage);
        return this;
    }
    public SkyblockItem setCritHit(int critHit) {
        itemStats.setCritHit(critHit);
        return this;
    }
    public SkyblockItem addCritHit(int critHit) {
        setCritHit(getCritHit() + critHit);
        return this;
    }
    public SkyblockItem removeCritHit(int critHit) {
        setCritHit(getCritHit() - critHit);
        return this;
    }
    public SkyblockItem setAttackSpeed(int attackSpeed) {
        itemStats.setAttackSpeed(attackSpeed);
        return this;
    }
    public SkyblockItem addAttackSpeed(int attackSpeed) {
        setAttackSpeed(getAttackSpeed() + attackSpeed);
        return this;
    }
    public SkyblockItem setIntelligence(int intelligence) {
        itemStats.setIntelligence(intelligence);
        return this;
    }
    public SkyblockItem addIntelligence(int intelligence) {
        setIntelligence(getIntelligence() + intelligence);
        return this;
    }
    public SkyblockItem removeIntelligence(int intelligence) {
        setIntelligence(getIntelligence() - intelligence);
        return this;
    }
    public SkyblockItem setMovementSpeed(int movementSpeed) {
        itemStats.setMovementSpeed(movementSpeed);
        return this;
    }
    public SkyblockItem addMovementSpeed(int movementSpeed) {
        setMovementSpeed(getMovementSpeed() + movementSpeed);
        return this;
    }
    public SkyblockItem removeMovementSpeed(int movementSpeed) {
        setMovementSpeed(getMovementSpeed() - movementSpeed);
        return this;
    }
    public SkyblockItem setDefense(int defense) {
        itemStats.setDefense(defense);
        return this;
    }
    public SkyblockItem addDefense(int defense) {
        setDefense(getDefense() + defense);
        return this;
    }
    public SkyblockItem removeDefense(int defense) {
        setDefense(getDefense() - defense);
        return this;
    }
    public SkyblockItem setRune(Rune rune) {
        this.rune = rune;
        return this;
    }

    public ItemStack createSkyblockItem(SkyblockItem skyblockItem) {
        ItemStack itemStack = new ItemStack(skyblockItem.getMaterial());
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(skyblockItem.getName());
        itemMeta.setLore(lore);
        itemMeta.setUnbreakable(true);
        itemStack.setItemMeta(itemMeta);
        itemStack.setAmount(skyblockItem.getAmount());
        return itemStack;
    }
}
