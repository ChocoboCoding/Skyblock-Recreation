package me.chocobo.skyblockrecreation.dataTypes;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SkyblockPlayer extends SkyblockEntity {
    private UUID uuid;
    private SkyblockInventory inventory;
    private PlayerStats playerStats;

    public SkyblockPlayer(UUID uuid, PlayerStats playerStats, SkyblockInventory inventory) {
        this.playerStats = playerStats;
        this.inventory = inventory;
    }

    public SkyblockPlayer(UUID uuid) {
        setUuid(uuid);
        playerStats.setStrength(20).setCritHit(20).setCritDamage(50).setMaxHealth(1000).setMovementSpeed(100).setIntelligence(100).
                setAttackSpeed(100);

    }

    public UUID getUuid() {
        return uuid;
    }
    public PlayerStats getStats() {
        return playerStats;
    }
    public SkyblockInventory getInventory() {
        return inventory;
    }
    public Map<Integer, Integer> map = new HashMap<>();
    public int getStrength() {
        return playerStats.getStrength();
    }
    public int getCritDamage() {
        return playerStats.getCritDamage();
    }
    public int getCritHit() {
        return playerStats.getCritHit();
    }
    public int getAttackSpeed() {
        return playerStats.getAttackSpeed();
    }
    public int getIntelligence() {
        return playerStats.getIntelligence();
    }
    public int getMana() {
        return playerStats.getMana();
    }
    public int getMovementSpeed() {
        return playerStats.getMovementSpeed();
    }
    public int getDefense() {
        return playerStats.getDefense();
    }
    public int getSeaCreatureChance() {
        return playerStats.getSeaCreatureChance();
    }
    public int getMagicFind() {
        return playerStats.getMagicFind();
    }
    public int getPetLuck() {
        return playerStats.getPetLuck();
    }

    public SkyblockPlayer setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }
    public SkyblockPlayer setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
        return this;
    }
    public SkyblockPlayer setInventory(SkyblockInventory inventory) {
        this.inventory = inventory;
        return this;
    }
    public SkyblockPlayer setStrength(int strength) {
        playerStats.setStrength(strength);
        return this;
    }
    public SkyblockPlayer addStrength(int strength) {
        setStrength(getStrength() + strength);
        return this;
    }
    public SkyblockPlayer removeStrength(int strength) {
        setStrength(getStrength() - strength);
        return this;
    }
    public SkyblockPlayer setCritDamage(int critDamage) {
        playerStats.setCritDamage(critDamage);
        return this;
    }
    public SkyblockPlayer addCritDamage(int critDamage) {
        setCritDamage(getCritDamage() + critDamage);
        return this;
    }
    public SkyblockPlayer removeCritDamage(int critDamage) {
        setCritDamage(getCritDamage() - critDamage);
        return this;
    }
    public SkyblockPlayer setCritHit(int critHit) {
        playerStats.setCritHit(critHit);
        return this;
    }
    public SkyblockPlayer addCritHit(int critHit) {
        setCritHit(getCritHit() + critHit);
        return this;
    }
    public SkyblockPlayer removeCritHit(int critHit) {
        setCritHit(getCritHit() - critHit);
        return this;
    }
    public SkyblockPlayer setAttackSpeed(int attackSpeed) {
        playerStats.setAttackSpeed(attackSpeed);
        return this;
    }
    public SkyblockPlayer addAttackSpeed(int attackSpeed) {
        setAttackSpeed(getAttackSpeed() + attackSpeed);
        return this;
    }
    public SkyblockPlayer removeAttackSpeed(int attackSpeed) {
        setAttackSpeed(getAttackSpeed() - attackSpeed);
        return this;
    }
    public SkyblockPlayer setIntelligence(int intelligence) {
        playerStats.setIntelligence(intelligence);
        return this;
    }
    public SkyblockPlayer addIntelligence(int intelligence) {
        setIntelligence(getIntelligence() + intelligence);
        return this;
    }
    public SkyblockPlayer removeIntelligence(int intelligence) {
        setIntelligence(getIntelligence() - intelligence);
        return this;
    }
    public SkyblockPlayer setMana(int mana) {
        playerStats.setMana(mana);
        return this;
    }
    public SkyblockPlayer addMana(int mana) {
        playerStats.setMana(playerStats.getMana() + mana);
        return this;
    }
    public SkyblockPlayer removeMana(int mana) {
        setMana(getMana() - mana);
        return this;
    }
    public SkyblockPlayer setMovementSpeed(int movementSpeed) {
        playerStats.setMovementSpeed(movementSpeed);
        return this;
    }
    public SkyblockPlayer addMovementSpeed(int movementSpeed) {
        setMovementSpeed(getMovementSpeed() + movementSpeed);
        return this;
    }
    public SkyblockPlayer removeMovementSpeed(int movementSpeed) {
        setMovementSpeed(getMovementSpeed() - movementSpeed);
        return this;
    }
    public SkyblockPlayer setDefense(int defense) {
        playerStats.setDefense(defense);
        playerStats.setDamageReduction(defense/(defense+100));
        return this;
    }
    public SkyblockPlayer addDefense(int defense) {
        setDefense(getDefense() + defense);
        return this;
    }
    public SkyblockPlayer removeDefense(int defense) {
        setDefense(getDefense() - defense);
        return this;
    }
    public SkyblockPlayer setSeaCreatureChance(int seaCreatureChance) {
        playerStats.setSeaCreatureChance(seaCreatureChance);
        return this;
    }
    public SkyblockPlayer addSeaCreatureChance(int seaCreatureChance) {
        setSeaCreatureChance(getSeaCreatureChance() + seaCreatureChance);
        return this;
    }
    public SkyblockPlayer removeSeaCreatureChance(int seaCreatureChance) {
        setSeaCreatureChance(getSeaCreatureChance() - seaCreatureChance);
        return this;
    }
    public SkyblockPlayer setMagicFind(int magicFind) {
        playerStats.setMagicFind(magicFind);
        return this;
    }
    public SkyblockPlayer addMagicFind(int magicFind) {
        setMagicFind(getMagicFind() + magicFind);
        return this;
    }
    public SkyblockPlayer removeMagicFind(int magicFind) {
        setMagicFind(getMagicFind() - magicFind);
        return this;
    }
    public SkyblockPlayer setPetLuck(int petLuck) {
        playerStats.setPetLuck(petLuck);
        return this;
    }
    public SkyblockPlayer addPetLuck(int petLuck) {
        setPetLuck(getPetLuck() + petLuck);
        return this;
    }
    public SkyblockPlayer removePetLuck(int petLuck) {
        setPetLuck(getPetLuck() - petLuck);
        return this;
    }
    public SkyblockPlayer addCurrentHealth(int health) {
        setCurrentHealth(getCurrentHealth() + health);
        return this;
    }
    public SkyblockPlayer removeCurrentHealth(int health) {
        setCurrentHealth(getCurrentHealth() - health);
        return this;
    }

    public SkyblockPlayer giveItem(SkyblockItem item) {
        inventory.addSkyblockItem(item);
        return this;
    }

    public SkyblockPlayer damage(SkyblockPlayer damager) {
        int damage = (5 + damager.getItemInHand().getItemStats().getDamage() + (damager.getStats().getStrength()/5) * (1 + damager.getStats().getStrength() / 100));
        damage = damage - (int) Math.round(damage * getStats().getDamageReduction());
        setCurrentHealth(getStats().getCurrentHealth() - damage);
        return this;
    }

    public SkyblockPlayer damage(SkyblockEnemy damager) {
        int damage = damager.getDamage();
        damage = damage - (int) Math.round(damage * getStats().getDamageReduction());
        setCurrentHealth(getStats().getCurrentHealth()-damage);
        return this;
    }

    public SkyblockPlayer damage(int damage) {
        setCurrentHealth(getStats().getCurrentHealth()-damage);
        return this;
    }

    public SkyblockItem getItemInHand() {
        SkyblockPlayer skyblockPlayer = this;
        Player player = Bukkit.getPlayer(skyblockPlayer.getUuid());
        SkyblockItem item = new SkyblockItem();
        for (int i = 0; i < 9; i++) {
            if (player.getInventory().getItem(i) == player.getItemInHand()) {
                item = skyblockPlayer.getInventory().getItem(i);
                break;
            }

        }
        return item;
    }
}