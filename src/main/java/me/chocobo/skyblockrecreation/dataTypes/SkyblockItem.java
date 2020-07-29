package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.ItemRarity;
import me.chocobo.skyblockrecreation.enums.ItemType;
import me.chocobo.skyblockrecreation.enums.Reforge;
import me.chocobo.skyblockrecreation.enums.Rune;
import me.chocobo.skyblockrecreation.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
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

    public SkyblockItem(ItemStats itemStats) {
        System.out.println("SkyblockItem.SkyblockItem 1");
        setAmount(1);
        System.out.println("SkyblockItem.SkyblockItem 2");
        setItemStats(itemStats);
        System.out.println("SkyblockItem.SkyblockItem 3");
    }

    public String getName() {
        System.out.println("SkyblockItem.getName 1");
        return name;
    }
    public Material getMaterial() {
        System.out.println("SkyblockItem.getMaterial 1");
        return material;
    }
    public int getAmount() {
        System.out.println("SkyblockItem.getAmount 1");
        return amount;
    }
    public ItemRarity getRarity() {
        System.out.println("SkyblockItem.getRarity 1");
        return rarity;
    }
    public ItemType getType() {
        System.out.println("SkyblockItem.getType 1");
        return type;
    }
    public Reforge getReforge() {
        System.out.println("SkyblockItem.getReforge 1");
        return reforge;
    }
    public List<String> getLore() {
        System.out.println("SkyblockItem.getLore 1");
        return lore;
    }
    public int getHpb() {
        System.out.println("SkyblockItem.getHpb 1");
        return hpb;
    }
    public ItemStats getItemStats() {
        System.out.println("SkyblockItem.getItemStats 1");
        return itemStats;
    }
    public int getDamage() {
        System.out.println("SkyblockItem.getDamage 1");
        return itemStats.getDamage();
    }
    public int getStrength() {
        System.out.println("SkyblockItem.getStrength 1");
        return itemStats.getStrength();
    }
    public int getCritDamage() {
        System.out.println("SkyblockItem.getCritDamage 1");
        return itemStats.getCritDamage();
    }
    public int getCritHit() {
        System.out.println("SkyblockItem.getCritHit 1");
        return itemStats.getCritHit();
    }
    public int getAttackSpeed() {
        System.out.println("SkyblockItem.getAttackSpeed 1");
        return itemStats.getAttackSpeed();
    }
    public int getIntelligence() {
        System.out.println("SkyblockItem.getIntelligence 1");
        return itemStats.getIntelligence();
    }
    public int getMovementSpeed() {
        System.out.println("SkyblockItem.getMovementSpeed 1");
        return itemStats.getMovementSpeed();
    }
    public int getDefense() {
        System.out.println("SkyblockItem.getDefense 1");
        return itemStats.getDefense();
    }
    public Rune getRune() {
        System.out.println("SkyblockItem.getRune 1");
        return rune;
    }

    public SkyblockItem setName(String name) {
        System.out.println("SkyblockItem.setName 1");
        this.name = name;
        System.out.println("SkyblockItem.setName 2");
        return this;
    }
    public SkyblockItem setMaterial(Material material) {
        System.out.println("SkyblockItem.setMaterial 1");
        this.material = material;
        System.out.println("SkyblockItem.setMaterial 2");
        return this;
    }
    public SkyblockItem setAmount(int amount) {
        System.out.println("SkyblockItem.setAmount 1");
        this.amount = amount;
        System.out.println("SkyblockItem.setAmount 2");
        return this;
    }
    public SkyblockItem setRarity(ItemRarity rarity) {
        System.out.println("SkyblockItem.setRarity 1");
        this.rarity = rarity;
        System.out.println("SkyblockItem.setRarity 2");
        return this;
    }
    public SkyblockItem setType(ItemType type) {
        System.out.println("SkyblockItem.setType 1");
        this.type = type;
        System.out.println("SkyblockItem.setType 2");
        return this;
    }
    public SkyblockItem setReforge(Reforge reforge) {
        System.out.println("SkyblockItem.setReforge 1");
        this.reforge = reforge;
        System.out.println("SkyblockItem.setReforge 2");
        return this;
    }
    public SkyblockItem setLore(String lore) {
        System.out.println("SkyblockItem.setLore 1");
        this.lore = LoreBuilder.cutLore(lore);
        System.out.println("SkyblockItem.setLore 2");
        return this;
    }
    public SkyblockItem setHpb(int hpb) {
        System.out.println("SkyblockItem.setHpb 1");
        this.hpb = hpb;
        System.out.println("SkyblockItem.setHpb 2");
        return this;
    }
    public SkyblockItem addHpb() {
        System.out.println("SkyblockItem.addHpb 1");
        this.hpb++;
        System.out.println("SkyblockItem.addHpb 2");
        return this;
    }
    public SkyblockItem setItemStats(ItemStats itemStats) {
        System.out.println("SkyblockItem.setItemStats 1");
        this.itemStats = itemStats;
        System.out.println("SkyblockItem.setItemStats 2");
        return this;
    }
    public SkyblockItem setDamage(int damage) {
        System.out.println("SkyblockItem.setDamage 1");
        itemStats.setDamage(damage);
        System.out.println("SkyblockItem.setDamage 2");
        return this;
    }
    public SkyblockItem addDamage(int damage) {
        System.out.println("SkyblockItem.addDamage 1");
        setDamage(getDamage() + damage);
        System.out.println("SkyblockItem.addDamage 2");
        return this;
    }
    public SkyblockItem removeDamage(int damage) {
        System.out.println("SkyblockItem.removeDamage 1");
        setDamage(getDamage() - damage);
        System.out.println("SkyblockItem.removeDamage 2");
        return this;
    }
    public SkyblockItem setStrength(int strength) {
        System.out.println("SkyblockItem.setStrength 1");
        itemStats.setStrength(strength);
        System.out.println("SkyblockItem.setStrength 2");
        return this;
    }
    public SkyblockItem addStrength(int strength) {
        System.out.println("SkyblockItem.addStrength 1");
        setStrength(getStrength() + strength);
        System.out.println("SkyblockItem.addStrength 2");
        return this;
    }
    public SkyblockItem removeStrength(int strength) {
        System.out.println("SkyblockItem.removeStrength 1");
        setStrength(getStrength() - strength);
        System.out.println("SkyblockItem.removeStrength 2");
        return this;
    }
    public SkyblockItem setCritDamage(int critDamage) {
        System.out.println("SkyblockItem.setCritDamage 1");
        itemStats.setCritDamage(critDamage);
        System.out.println("SkyblockItem.setCritDamage 2");
        return this;
    }
    public SkyblockItem addCritDamage(int critDamage) {
        System.out.println("SkyblockItem.addCritDamage 1");
        setCritDamage(getCritDamage() + critDamage);
        System.out.println("SkyblockItem.addCritDamage 2");
        return this;
    }
    public SkyblockItem removeCritDamage(int critDamage) {
        System.out.println("SkyblockItem.removeCritDamage 1");
        setCritDamage(getCritDamage() - critDamage);
        System.out.println("SkyblockItem.removeCritDamage 2");
        return this;
    }
    public SkyblockItem setCritHit(int critHit) {
        System.out.println("SkyblockItem.setCritHit 1");
        itemStats.setCritHit(critHit);
        System.out.println("SkyblockItem.setCritHit 2");
        return this;
    }
    public SkyblockItem addCritHit(int critHit) {
        System.out.println("SkyblockItem.addCritHit 1");
        setCritHit(getCritHit() + critHit);
        System.out.println("SkyblockItem.addCritHit 2");
        return this;
    }
    public SkyblockItem removeCritHit(int critHit) {
        System.out.println("SkyblockItem.setCritHit 1");
        setCritHit(getCritHit() - critHit);
        System.out.println("SkyblockItem.setCritHit 2");
        return this;
    }
    public SkyblockItem setAttackSpeed(int attackSpeed) {
        System.out.println("SkyblockItem.setAttackSpeed 1");
        itemStats.setAttackSpeed(attackSpeed);
        System.out.println("SkyblockItem.setAttackSpeed 2");
        return this;
    }
    public SkyblockItem addAttackSpeed(int attackSpeed) {
        System.out.println("SkyblockItem.addAttackSpeed 1");
        setAttackSpeed(getAttackSpeed() + attackSpeed);
        System.out.println("SkyblockItem.addAttackSpeed 2");
        return this;
    }
    public SkyblockItem setIntelligence(int intelligence) {
        System.out.println("SkyblockItem.setIntelligence 1");
        itemStats.setIntelligence(intelligence);
        System.out.println("SkyblockItem.setIntelligence 2");
        return this;
    }
    public SkyblockItem addIntelligence(int intelligence) {
        System.out.println("SkyblockItem.addIntelligence 1");
        setIntelligence(getIntelligence() + intelligence);
        System.out.println("SkyblockItem.addIntelligence 2");
        return this;
    }
    public SkyblockItem removeIntelligence(int intelligence) {
        System.out.println("SkyblockItem.removeIntelligence 1");
        setIntelligence(getIntelligence() - intelligence);
        System.out.println("SkyblockItem.removeIntelligence 2");
        return this;
    }
    public SkyblockItem setMovementSpeed(int movementSpeed) {
        System.out.println("SkyblockItem.setMovementSpeed 1");
        itemStats.setMovementSpeed(movementSpeed);
        System.out.println("SkyblockItem.setMovementSpeed 2");
        return this;
    }
    public SkyblockItem addMovementSpeed(int movementSpeed) {
        System.out.println("SkyblockItem.addMovementSpeed 1");
        setMovementSpeed(getMovementSpeed() + movementSpeed);
        System.out.println("SkyblockItem.addMovementSpeed 2");
        return this;
    }
    public SkyblockItem removeMovementSpeed(int movementSpeed) {
        System.out.println("SkyblockItem.removeMovementSpeed 1");
        setMovementSpeed(getMovementSpeed() - movementSpeed);
        System.out.println("SkyblockItem.removeMovementSpeed 2");
        return this;
    }
    public SkyblockItem setDefense(int defense) {
        System.out.println("SkyblockItem.setDefense 1");
        itemStats.setDefense(defense);
        System.out.println("SkyblockItem.setDefense 2");
        return this;
    }
    public SkyblockItem addDefense(int defense) {
        System.out.println("SkyblockItem.addDefense 1");
        setDefense(getDefense() + defense);
        System.out.println("SkyblockItem.addDefense 2");
        return this;
    }
    public SkyblockItem removeDefense(int defense) {
        System.out.println("SkyblockItem.removeDefense 1");
        setDefense(getDefense() - defense);
        System.out.println("SkyblockItem.removeDefense 2");
        return this;
    }
    public SkyblockItem setRune(Rune rune) {
        System.out.println("SkyblockItem.setRune 1");
        this.rune = rune;
        System.out.println("SkyblockItem.setRune 1");
        return this;
    }

    public ItemStack createItem() {
        System.out.println("SkyblockItem.createItem 1");
        ItemStack itemStack = new ItemStack(getMaterial());
        System.out.println("SkyblockItem.createItem 2");
        ItemMeta itemMeta = itemStack.getItemMeta();
        System.out.println("SkyblockItem.createItem 3");
        itemMeta.setDisplayName(rarity.getFormattingCode() + getName());
        System.out.println("SkyblockItem.createItem 4");
        itemMeta.setLore(new LoreBuilder(this).build());
        System.out.println("SkyblockItem.createItem 5");
        itemMeta.spigot().setUnbreakable(true);
        itemMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        System.out.println("SkyblockItem.createItem 6");
        itemStack.setItemMeta(itemMeta);
        System.out.println("SkyblockItem.createItem 7");
        itemStack.setAmount(getAmount());
        System.out.println("SkyblockItem.createItem 8");
        return itemStack;
    }
}
