package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.ItemRarity;
import me.chocobo.skyblockrecreation.enums.ItemType;
import org.bukkit.Material;

import java.util.List;

public class SkyblockItem {
    protected String name;
    protected Material material;
    protected ItemRarity rarity;
    protected ItemType type;
    protected List<String> lore;
    private int damage, strength, critDamage, critHit, attackSpeed, intelligence, movementSpeed, defense;

    public String getName() {
        return name;
    }
    public Material getMaterial() {
        return material;
    }
    public ItemRarity getRarity() {
        return rarity;
    }
    public ItemType getType() {
        return type;
    }
    public List<String> getLore() {
        return lore;
    }
    public int getDamage() {
        return damage;
    }
    public int getStrength() {
        return strength;
    }
    public int getCritDamage() {
        return critDamage;
    }
    public int getCritHit() {
        return critHit;
    }
    public int getAttackSpeed() {
        return attackSpeed;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getMovementSpeed() {
        return movementSpeed;
    }
    public int getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public void setRarity(ItemRarity rarity) {
        this.rarity = rarity;
    }
    public void setType(ItemType type) {
        this.type = type;
    }
    public void setLore(List<String> lore) {
        this.lore = lore;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setCritDamage(int critDamage) {
        this.critDamage = critDamage;
    }
    public void setCritHit(int critHit) {
        this.critHit = critHit;
    }
    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
}
