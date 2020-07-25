package me.chocobo.skyblockrecreation.enums;

public enum ItemRarity {
    COMMON("§lCOMMON", 0),
    UNCOMMON("§l§2UNCOMMON", 1),
    RARE("§l§1RARE",2),
    EPIC("§l§5EPIC", 3),
    LEGENDARY("§l§6LEGENDARY", 4);

    private final String loreMessage;
    private final int rarity;

    private ItemRarity(String loreMessage, int rarity) {
        this.rarity = rarity;
        this.loreMessage = loreMessage;
    }

    public String getLoreMessage() {
        return loreMessage;
    }
    public int getRarity() {
        return rarity;
    }
}
