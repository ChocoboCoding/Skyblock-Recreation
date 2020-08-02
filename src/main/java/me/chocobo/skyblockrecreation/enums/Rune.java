package me.chocobo.skyblockrecreation.enums;

public enum Rune {

    BLOOD("§c◆ Blood Rune", 1, ItemType.MELEE, ItemRarity.COMMON, ""),
    SNOW("§f◆ Snow Rune", 2, ItemType.MELEE, ItemRarity.COMMON, ""),
    LAVA("§4◆ Lava Rune", 3, ItemType.BOW, ItemRarity.COMMON, ""),
    GEM("§2◆ Gem Rune", 4, ItemType.BOW, ItemRarity.COMMON, ""),
    ZAP("", 5, ItemType.BOOTS, ItemRarity.UNCOMMON, ""),
    WHITE_SPIRAL("", 6, ItemType.BOW, ItemRarity.UNCOMMON, ""),
    SMOKEY("", 7, ItemType.BOW, ItemRarity.COMMON, ""),
    HOT("", 8, ItemType.BOOTS, ItemRarity.UNCOMMON,""),
    REDSTONE("", 9, ItemType.BOOTS, ItemRarity.RARE, ""),
    HEARTS("", 10, ItemType.MELEE, ItemRarity.RARE, ""),
    SPARKLING("", 11, ItemType.BOOTS, ItemRarity.RARE, ""),
    MAGICAL("", 12, ItemType.BOW, ItemRarity.RARE, ""),
    FIRE_SPIRAL("", 13, ItemType.BOW, ItemRarity.RARE, ""),
    GOLDEN("", 14, ItemType.BOW, ItemRarity.EPIC, ""),
    MUSIC("", 15, ItemType.MELEE, ItemRarity.EPIC, ""),
    CLOUDS("", 16, ItemType.BOOTS, ItemRarity.EPIC, ""),
    WAKE("", 18, ItemType.BOOTS, ItemRarity.LEGENDARY, ""),
    LIGHTNING("", 19, ItemType.MELEE, ItemRarity.LEGENDARY, ""),
    RAINBOW("", 20, ItemType.BOOTS, ItemRarity.LEGENDARY, "");


    private final String name;
    private final int level;
    private final ItemType type;
    private final ItemRarity rarity;
    private final String description;

    private Rune(String name, int level, ItemType type, ItemRarity rarity, String description) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.rarity = rarity;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public ItemType getType() {
        return type;
    }
    public ItemRarity getRarity() {
        return rarity;
    }
    public String getDescription() {
        return description;
    }
}
