package me.chocobo.skyblockrecreation.dataTypes;

public class PlayerStats extends EntityStats {

    protected int strength, critDamage, critHit, attackSpeed, intelligence, mana, movementSpeed, defense, damageReduction,
            currentEffectiveHealth, maxEffectiveHealth, seaCreatureChance, magicFind, petLuck;

    public PlayerStats(int maxHealth) {
        super(maxHealth);
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
    public int getMana() {
        return mana;
    }
    public int getMovementSpeed() {
        return movementSpeed;
    }
    public int getDefense() {
        return defense;
    }
    public int getDamageReduction() {
        return damageReduction;
    }
    public int getMaxEffectiveHealth() {
        return maxEffectiveHealth;
    }
    public int getCurrentEffectiveHealth() {
        return currentEffectiveHealth;
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


    public PlayerStats setStrength(int strength) {
        this.strength = strength;
        return this;
    }
    public PlayerStats setCritDamage(int critDamage) {
        this.critDamage = critDamage;
        return this;
    }
    public PlayerStats setCritHit(int critHit) {
        this.critHit = critHit;
        return this;
    }
    public PlayerStats setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
        return this;
    }
    public PlayerStats setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        return this;
    }
    public PlayerStats setMana(int mana) {
        this.mana = mana;
        return this;
    }
    public PlayerStats setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
        return this;
    }
    public PlayerStats setDefense(int defense) {
        this.defense = defense;
        maxEffectiveHealth = getMaxHealth() * (1 + getDefense()/100);
        return this;
    }
    public PlayerStats setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
        return this;
    }
    @Override
    public PlayerStats setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        maxEffectiveHealth = getMaxHealth() * (1 + getDefense() / 100);
        return this;
    }
    @Override
    public PlayerStats setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        currentEffectiveHealth = getMaxHealth() * (1+getDefense() / 100);
        return this;
    }
    public PlayerStats setSeaCreatureChance(int seaCreatureChance) {
        this.seaCreatureChance = seaCreatureChance;
        return this;
    }
    public PlayerStats setMagicFind(int magicFind) {
        this.magicFind = magicFind;
        return this;
    }
    public PlayerStats setPetLuck(int petLuck) {
        this.petLuck = petLuck;
        return this;
    }
}
