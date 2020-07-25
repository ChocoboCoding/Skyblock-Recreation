package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.EnchantmentType;

public class Enchantment {
    private EnchantmentType enchantmentType;
    private byte level;
    private String description;

    public Enchantment(EnchantmentType enchantmentType, byte level, String description) {
        this.enchantmentType = enchantmentType;
        this.level = level;
        this.description = description;
    }

    public EnchantmentType getEnchantmentType() {
        return enchantmentType;
    }
    public byte getLevel() {
        return level;
    }
    public String getDescription() {
        return description;
    }

    public Enchantment setEnchantmentType(EnchantmentType enchantmentType) {
        this.enchantmentType = enchantmentType;
        return this;
    }
    public Enchantment setLevel(byte level) {
        this.level = level;
        return this;
    }
    public Enchantment setDescription(String description) {
        this.description = description;
        return this;
    }
}
