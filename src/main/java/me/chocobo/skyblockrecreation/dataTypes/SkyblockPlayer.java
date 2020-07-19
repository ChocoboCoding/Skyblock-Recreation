package me.chocobo.skyblockrecreation.dataTypes;

import java.util.UUID;


public class SkyblockPlayer {
    private UUID uuid;
    private int strength, critHit, critDamage, maxHp, armor, speed, intelligence, attackSpeed, seaCreatureChance,
            magicFind, petLuck, currentHp;

    public SkyblockPlayer(UUID uuid, int strength, int critHit, int critDamage, int hp, int armor, int speed,
                          int intelligence, int attackSpeed, int seaCreatureChance, int magicFind, int petLuck) {
        setUuid(uuid);
        setStrength(strength);
        setCritHit(critHit);
        setCritDamage(critDamage);
        setMaxHp(hp);
        setArmor(armor);
        setSpeed(speed);
        setIntelligence(intelligence);
        setAttackSpeed(attackSpeed);
        setSeaCreatureChance(seaCreatureChance);
        setMagicFind(magicFind);
        setPetLuck(petLuck);
    }

    public SkyblockPlayer(UUID uuid) {
        setUuid(uuid);
        setStrength(20);
        setCritHit(20);
        setCritDamage(50);
        setMaxHp(1000);
        setArmor(0);
        setSpeed(100);
        setIntelligence(100);
        setAttackSpeed(0);
        setSeaCreatureChance(0);
        setMagicFind(0);
        setPetLuck(0);
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setCritHit(int critHit) {
        this.critHit = critHit;
    }

    public void setCritDamage(int critDamage) {
        this.critDamage = critDamage;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setSeaCreatureChance(int seaCreatureChance) {
        this.seaCreatureChance = seaCreatureChance;
    }

    public void setMagicFind(int magicFind) {
        this.magicFind = magicFind;
    }

    public void setPetLuck(int petLuck) {
        this.petLuck = petLuck;
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getStrength() {
        return strength;
    }

    public int getCritHit() {
        return critHit;
    }

    public int getCritDamage() {
        return critDamage;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getArmor() {
        return armor;
    }

    public int getSpeed() {
        return speed;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public int getSeaCreatureChance() {
        return seaCreatureChance;
    }

    public int getMagicFind() {
        return magicFind;
    }

    public int getPetLuck() {
        return petLuck;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }
}
