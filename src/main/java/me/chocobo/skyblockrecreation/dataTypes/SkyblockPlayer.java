package me.chocobo.skyblockrecreation.dataTypes;

import java.util.UUID;


public class SkyblockPlayer {
    private UUID uuid;
    private int strength, critHit, critDamage, hp, armor, speed;

    public SkyblockPlayer(UUID uuid, int strength, int critHit, int critDamage, int hp, int armor, int speed) {
        setUuid(uuid);
        setStrength(strength);
        setCritHit(critHit);
        setCritDamage(critDamage);
        setHp(hp);
        setArmor(armor);
        setSpeed(speed);
    }

    public SkyblockPlayer(UUID uuid) {
        setUuid(uuid);
        setStrength(20);
        setCritHit(20);
        setCritDamage(50);
        setHp(100);
        setArmor(0);
        setSpeed(100);
    }

    public void setUuid(UUID uuid) { this.uuid = uuid; }

    public void setStrength(int strength) { this.strength = strength; }

    public void setCritHit(int critHit) { this.critHit = critHit; }

    public void setCritDamage(int critDamage) { this.critDamage = critDamage; }

    public void setHp(int hp) { this.hp = hp; }

    public void setArmor(int armor) { this.armor = armor; }

    public void setSpeed(int speed) { this.speed = speed; }

    public UUID getUuid() { return uuid; }

    public int getStrength() { return strength; }

    public int getCritHit() { return critHit; }

    public int getCritDamage() { return critDamage; }

    public int getHp() { return hp; }

    public int getArmor() { return armor; }

    public int getSpeed() { return speed; }
}
