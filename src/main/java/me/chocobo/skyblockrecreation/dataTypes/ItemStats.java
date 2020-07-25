package me.chocobo.skyblockrecreation.dataTypes;

public class ItemStats {

    protected int damage, strength, critDamage, critHit, attackSpeed, intelligence, movementSpeed, defense;

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

    public ItemStats setDamage(int damage) {
        this.damage = damage;
        return this;
    }
    public ItemStats setStrength(int strength) {
        this.strength = strength;
        return this;
    }
    public ItemStats setCritDamage(int critDamage) {
        this.critDamage = critDamage;
        return this;
    }
    public ItemStats setCritHit(int critHit) {
        this.critHit = critHit;
        return this;
    }
    public ItemStats setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
        return this;
    }
    public ItemStats setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        return this;
    }
    public ItemStats setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
        return this;
    }
    public ItemStats setDefense(int defense) {
        this.defense = defense;
        return this;
    }
}
