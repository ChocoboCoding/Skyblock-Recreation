package me.chocobo.skyblockrecreation.dataTypes;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SkyblockPlayer extends SkyblockEntity {
    private UUID uuid;
    private SkyblockInventory inventory;
    private PlayerStats playerStats;

    public SkyblockPlayer(UUID uuid, PlayerStats playerStats, SkyblockInventory inventory) {
        super(playerStats);
        System.out.println("SkyblockPlayer.SkyblockPlayer 1 1");
        setPlayerStats(playerStats);
        System.out.println("SkyblockPlayer.SkyblockPlayer 1 2");
        setInventory(inventory);
        System.out.println("SkyblockPlayer.SkyblockPlayer 1 3");
    }

    public SkyblockPlayer(UUID uuid) {
        super(new PlayerStats(1000));
        System.out.println("SkyblockPlayer.SkyblockPlayer 2 1");
        setUuid(uuid);
        System.out.println("SkyblockPlayer.SkyblockPlayer 2 2");
        setPlayerStats(new PlayerStats(1000));
        System.out.println("SkyblockPlayer.SkyblockPlayer 2 3");
        playerStats.setStrength(20).setCritHit(20).setCritDamage(50).setMovementSpeed(100).setIntelligence(100).
                setAttackSpeed(100);
        System.out.println("SkyblockPlayer.SkyblockPlayer 2 4");
        setInventory(new SkyblockInventory());
        System.out.println("SkyblockPlayer.SkyblockPlayer 2 5");
    }

    public UUID getUuid() {
        System.out.println("SkyblockPlayer.getUUID 1");
        return uuid;
    }
    public PlayerStats getStats() {
        System.out.println("SkyblockPlayer.getStats 1");
        return playerStats;
    }
    public SkyblockInventory getInventory() {
        System.out.println("SkyblockPlayer.getInventory 1");
        return inventory;
    }
    public int getStrength() {
        System.out.println("SkyblockPlayer.getStrength 1");
        return playerStats.getStrength();
    }
    public int getCritDamage() {
        System.out.println("SkyblockPlayer.getCritDamage 1");
        return playerStats.getCritDamage();
    }
    public int getCritHit() {
        System.out.println("SkyblockPlayer.getCritHit 1");
        return playerStats.getCritHit();
    }
    public int getAttackSpeed() {
        System.out.println("SkyblockPlayer.getAttackSpeed 1");
        return playerStats.getAttackSpeed();
    }
    public int getIntelligence() {
        System.out.println("SkyblockPlayer.getIntelligence 1");
        return playerStats.getIntelligence();
    }
    public int getMana() {
        System.out.println("SkyblockPlayer.getMana 1");
        return playerStats.getMana();
    }
    public int getMovementSpeed() {
        System.out.println("SkyblockPlayer.getMovementSpeed 1");
        return playerStats.getMovementSpeed();
    }
    public int getDefense() {
        System.out.println("SkyblockPlayer.getDefense 1");
        return playerStats.getDefense();
    }
    public int getSeaCreatureChance() {
        System.out.println("SkyblockPlayer.getSeaCreatureChance 1");
        return playerStats.getSeaCreatureChance();
    }
    public int getMagicFind() {
        System.out.println("SkyblockPlayer.getMagicFind 1");
        return playerStats.getMagicFind();
    }
    public int getPetLuck() {
        System.out.println("SkyblockPlayer.getPetLuck 1");
        return playerStats.getPetLuck();
    }

    public SkyblockPlayer setUuid(UUID uuid) {
        System.out.println("SkyblockPlayer.setUUID 1");
        this.uuid = uuid;
        System.out.println("SkyblockPlayer.setUUID 2");
        return this;
    }
    public SkyblockPlayer setPlayerStats(PlayerStats playerStats) {
        System.out.println("SkyblockPlayer.setPlayerStats 1");
        this.playerStats = playerStats;
        System.out.println("SkyblockPlayer.setPlayerStats 2");
        return this;
    }
    public SkyblockPlayer setInventory(SkyblockInventory inventory) {
        System.out.println("SkyblockPlayer.setInventory 1");
        this.inventory = inventory;
        System.out.println("SkyblockPlayer.setInventory 2");
        return this;
    }
    public SkyblockPlayer setStrength(int strength) {
        System.out.println("SkyblockPlayer.setStrength 1");
        playerStats.setStrength(strength);
        System.out.println("SkyblockPlayer.setStrength 2");
        return this;
    }
    public SkyblockPlayer addStrength(int strength) {
        System.out.println("SkyblockPlayer.addStrength 1");
        setStrength(getStrength() + strength);
        System.out.println("SkyblockPlayer.addStrength 2");
        return this;
    }
    public SkyblockPlayer removeStrength(int strength) {
        System.out.println("SkyblockPlayer.removeStrength 1");
        setStrength(getStrength() - strength);
        System.out.println("SkyblockPlayer.removeStrength 2");
        return this;
    }
    public SkyblockPlayer setCritDamage(int critDamage) {
        System.out.println("SkyblockPlayer.setCritDamage 1");
        playerStats.setCritDamage(critDamage);
        System.out.println("SkyblockPlayer.setCritDamage 2");
        return this;
    }
    public SkyblockPlayer addCritDamage(int critDamage) {
        System.out.println("SkyblockPlayer.addCritDamage 1");
        setCritDamage(getCritDamage() + critDamage);
        System.out.println("SkyblockPlayer.addCritDamage 2");
        return this;
    }
    public SkyblockPlayer removeCritDamage(int critDamage) {
        System.out.println("SkyblockPlayer.removeCritDamage 1");
        setCritDamage(getCritDamage() - critDamage);
        System.out.println("SkyblockPlayer.removeCritDamage 2");
        return this;
    }
    public SkyblockPlayer setCritHit(int critHit) {
        System.out.println("SkyblockPlayer.setCritHit 1");
        playerStats.setCritHit(critHit);
        System.out.println("SkyblockPlayer.setCritHit 2");
        return this;
    }
    public SkyblockPlayer addCritHit(int critHit) {
        System.out.println("SkyblockPlayer.addCritHit 1");
        setCritHit(getCritHit() + critHit);
        System.out.println("SkyblockPlayer.addCritHit 2");
        return this;
    }
    public SkyblockPlayer removeCritHit(int critHit) {
        System.out.println("SkyblockPlayer.removeCritHit 1");
        setCritHit(getCritHit() - critHit);
        System.out.println("SkyblockPlayer.removeCritHit 2");
        return this;
    }
    public SkyblockPlayer setAttackSpeed(int attackSpeed) {
        System.out.println("SkyblockPlayer.setAttackSpeed 1");
        playerStats.setAttackSpeed(attackSpeed);
        System.out.println("SkyblockPlayer.setAttackSpeed 2");
        return this;
    }
    public SkyblockPlayer addAttackSpeed(int attackSpeed) {
        System.out.println("SkyblockPlayer.addAttackSpeed 1");
        setAttackSpeed(getAttackSpeed() + attackSpeed);
        System.out.println("SkyblockPlayer.addAttackSpeed 2");
        return this;
    }
    public SkyblockPlayer removeAttackSpeed(int attackSpeed) {
        System.out.println("SkyblockPlayer.removeAttackSpeed 1");
        setAttackSpeed(getAttackSpeed() - attackSpeed);
        System.out.println("SkyblockPlayer.removeAttackSpeed 2");
        return this;
    }
    public SkyblockPlayer setIntelligence(int intelligence) {
        System.out.println("SkyblockPlayer.setIntelligence 1");
        playerStats.setIntelligence(intelligence);
        System.out.println("SkyblockPlayer.setIntelligence 2");
        return this;
    }
    public SkyblockPlayer addIntelligence(int intelligence) {
        System.out.println("SkyblockPlayer.addIntelligence 1");
        setIntelligence(getIntelligence() + intelligence);
        System.out.println("SkyblockPlayer.addIntelligence 2");
        return this;
    }
    public SkyblockPlayer removeIntelligence(int intelligence) {
        System.out.println("SkyblockPlayer.removeIntelligence 1");
        setIntelligence(getIntelligence() - intelligence);
        System.out.println("SkyblockPlayer.removeIntelligence 2");
        return this;
    }
    public SkyblockPlayer setMana(int mana) {
        System.out.println("SkyblockPlayer.setMana 1");
        playerStats.setMana(mana);
        System.out.println("SkyblockPlayer.setMana 2");
        return this;
    }
    public SkyblockPlayer addMana(int mana) {
        System.out.println("SkyblockPlayer.addMana 1");
        playerStats.setMana(playerStats.getMana() + mana);
        System.out.println("SkyblockPlayer.addMana 2");
        return this;
    }
    public SkyblockPlayer removeMana(int mana) {
        System.out.println("SkyblockPlayer.removeMana 1");
        setMana(getMana() - mana);
        System.out.println("SkyblockPlayer.removeMana 2");
        return this;
    }
    public SkyblockPlayer setMovementSpeed(int movementSpeed) {
        System.out.println("SkyblockPlayer.setMovementSpeed 1");
        playerStats.setMovementSpeed(movementSpeed);
        System.out.println("SkyblockPlayer.setMovementSpeed 2");
        return this;
    }
    public SkyblockPlayer addMovementSpeed(int movementSpeed) {
        System.out.println("SkyblockPlayer.addMovementSpeed 1");
        setMovementSpeed(getMovementSpeed() + movementSpeed);
        System.out.println("SkyblockPlayer.addMovementSpeed 2");
        return this;
    }
    public SkyblockPlayer removeMovementSpeed(int movementSpeed) {
        System.out.println("SkyblockPlayer.removeMovementSpeed 1");
        setMovementSpeed(getMovementSpeed() - movementSpeed);
        System.out.println("SkyblockPlayer.removeMovementSpeed 2");
        return this;
    }
    public SkyblockPlayer setDefense(int defense) {
        System.out.println("SkyblockPlayer.setDefense 1");
        playerStats.setDefense(defense);
        System.out.println("SkyblockPlayer.setDefense 2");
        playerStats.setDamageReduction(defense/(defense+100));
        System.out.println("SkyblockPlayer.setDefense 3");
        return this;
    }
    public SkyblockPlayer addDefense(int defense) {
        System.out.println("SkyblockPlayer.addDefense 1");
        setDefense(getDefense() + defense);
        System.out.println("SkyblockPlayer.addDefense 2");
        return this;
    }
    public SkyblockPlayer removeDefense(int defense) {
        System.out.println("SkyblockPlayer.removeDefense 1");
        setDefense(getDefense() - defense);
        System.out.println("SkyblockPlayer.removeDefense 2");
        return this;
    }
    public SkyblockPlayer setSeaCreatureChance(int seaCreatureChance) {
        System.out.println("SkyblockPlayer.setSeaCreatureChance 1");
        playerStats.setSeaCreatureChance(seaCreatureChance);
        System.out.println("SkyblockPlayer.setSeaCreatureChance 2");
        return this;
    }
    public SkyblockPlayer addSeaCreatureChance(int seaCreatureChance) {
        System.out.println("SkyblockPlayer.addSeaCreatureChance 1");
        setSeaCreatureChance(getSeaCreatureChance() + seaCreatureChance);
        System.out.println("SkyblockPlayer.addSeaCreatureChance 2");
        return this;
    }
    public SkyblockPlayer removeSeaCreatureChance(int seaCreatureChance) {
        System.out.println("SkyblockPlayer.removeSeaCreatureChance 1");
        setSeaCreatureChance(getSeaCreatureChance() - seaCreatureChance);
        System.out.println("SkyblockPlayer.removeSeaCreatureChance 2");
        return this;
    }
    public SkyblockPlayer setMagicFind(int magicFind) {
        System.out.println("SkyblockPlayer.setMagicFind 1");
        playerStats.setMagicFind(magicFind);
        System.out.println("SkyblockPlayer.setMagicFind 2");
        return this;
    }
    public SkyblockPlayer addMagicFind(int magicFind) {
        System.out.println("SkyblockPlayer.addMagicFind 1");
        setMagicFind(getMagicFind() + magicFind);
        System.out.println("SkyblockPlayer.addMagicFind 2");
        return this;
    }
    public SkyblockPlayer removeMagicFind(int magicFind) {
        System.out.println("SkyblockPlayer.removeMagicFind 1");
        setMagicFind(getMagicFind() - magicFind);
        System.out.println("SkyblockPlayer.removeMagicFind 2");
        return this;
    }
    public SkyblockPlayer setPetLuck(int petLuck) {
        System.out.println("SkyblockPlayer.setPetLuck 1");
        playerStats.setPetLuck(petLuck);
        System.out.println("SkyblockPlayer.setPetLuck 2");
        return this;
    }
    public SkyblockPlayer addPetLuck(int petLuck) {
        System.out.println("SkyblockPlayer.addCurrentHealth 1");
        setPetLuck(getPetLuck() + petLuck);
        System.out.println("SkyblockPlayer.addCurrentHealth 2");
        return this;
    }
    public SkyblockPlayer removePetLuck(int petLuck) {
        System.out.println("SkyblockPlayer.addCurrentHealth 1");
        setPetLuck(getPetLuck() - petLuck);
        System.out.println("SkyblockPlayer.addCurrentHealth 2");
        return this;
    }
    public SkyblockPlayer addCurrentHealth(int health) {
        System.out.println("SkyblockPlayer.addCurrentHealth 1");
        setCurrentHealth(getCurrentHealth() + health);
        System.out.println("SkyblockPlayer.addCurrentHealth 2");
        return this;
    }
    public SkyblockPlayer removeCurrentHealth(int health) {
        System.out.println("SkyblockPlayer.removeCurrentHealth 1");
        setCurrentHealth(getCurrentHealth() - health);
        System.out.println("SkyblockPlayer.removeCurrentHealth 2");
        return this;
    }

    public SkyblockPlayer giveItem(SkyblockItem item) {
        System.out.println("SkyblockPlayer.giveItem 1");
        inventory.addSkyblockItem(item);
        System.out.println("SkyblockPlayer.giveItem 2");
        ItemStack itemStack = item.createItem();
        System.out.println("SkyblockPlayer.giveItem 3");
        Bukkit.getPlayer(getUuid()).getInventory().addItem(itemStack);
        System.out.println("SkyblockPlayer.giveItem 4");
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
        Player player = Bukkit.getPlayer(getUuid());
        SkyblockItem item = new SkyblockItem(new ItemStats());
        for (int i = 0; i < 9; i++) {
            if (player.getInventory().getItem(i) == player.getItemInHand()) {
                return item = getInventory().getItem(i);
            }

        }
        return item;
    }
}