package me.chocobo.skyblockrecreation.dataTypes;

public class ItemStats {

    protected int damage, strength, critDamage, critHit, attackSpeed, intelligence, movementSpeed, defense;

    public ItemStats() {
        setDamage(0);
        setStrength(0);
        setCritDamage(0);
        setCritHit(0);
        setAttackSpeed(0);
        setIntelligence(0);
        setMovementSpeed(0);
        setDefense(0);
    }

    public int getDamage() {
        System.out.println("ItemStats.getDamage 1");
        return damage;
    }
    public int getStrength() {
        System.out.println("ItemStats.getStrength 1");
        return strength;
    }
    public int getCritDamage() {
        System.out.println("ItemStats.getCritDamage 1");
        return critDamage;
    }
    public int getCritHit() {
        System.out.println("ItemStats.getCritHit 1");
        return critHit;
    }
    public int getAttackSpeed() {
        System.out.println("ItemStats.getAttackSpeed 1");
        return attackSpeed;
    }
    public int getIntelligence() {
        System.out.println("ItemStats.getIntelligence 1");
        return intelligence;
    }
    public int getMovementSpeed() {
        System.out.println("ItemStats.getMovementSpeed 1");
        return movementSpeed;
    }
    public int getDefense() {
        System.out.println("ItemStats.getDefense 1");
        return defense;
    }

    public ItemStats setDamage(int damage) {
        System.out.println("ItemStats.setDamage 1");
        this.damage = damage;
        System.out.println("ItemStats.setDamage 2");
        return this;
    }
    public ItemStats setStrength(int strength) {
        System.out.println("ItemStats.setStrength 1");
        this.strength = strength;
        System.out.println("ItemStats.setStrength 2");
        return this;
    }
    public ItemStats setCritDamage(int critDamage) {
        System.out.println("ItemStats.setCritDamage 1");
        this.critDamage = critDamage;
        System.out.println("ItemStats.setCritDamage 2");
        return this;
    }
    public ItemStats setCritHit(int critHit) {
        System.out.println("ItemStats.setCritHit 1");
        this.critHit = critHit;
        System.out.println("ItemStats.setCritHit 2");
        return this;
    }
    public ItemStats setAttackSpeed(int attackSpeed) {
        System.out.println("ItemStats.setAttackSpeed 1");
        this.attackSpeed = attackSpeed;
        System.out.println("ItemStats.setAttackSpeed 2");
        return this;
    }
    public ItemStats setIntelligence(int intelligence) {
        System.out.println("ItemStats.setIntelligence 1");
        this.intelligence = intelligence;
        System.out.println("ItemStats.setIntelligence 2");
        return this;
    }
    public ItemStats setMovementSpeed(int movementSpeed) {
        System.out.println("ItemStats.setMovementSpeed 1");
        this.movementSpeed = movementSpeed;
        System.out.println("ItemStats.setMovementSpeed 2");
        return this;
    }
    public ItemStats setDefense(int defense) {
        System.out.println("ItemStats.setDefense 1");
        this.defense = defense;
        System.out.println("ItemStats.setDefense 2");
        return this;
    }
}
