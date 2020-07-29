package me.chocobo.skyblockrecreation.enums;

public enum ItemRarity {
    COMMON("§lCOMMON", "§f", 0),
    UNCOMMON("§lUNCOMMON", "§2", 1),
    RARE("§lRARE", "§b",2),
    EPIC("§lEPIC", "§5", 3),
    LEGENDARY("§lLEGENDARY", "§6", 4);

    private final String loreMessage;
    private final String formattingCode;
    private final int rarity;

    private ItemRarity(String loreMessage, String formattingCode, int rarity) {
        this.rarity = rarity;
        this.formattingCode = formattingCode;
        this.loreMessage = loreMessage;
    }

    public String getLoreMessage() {
        return loreMessage;
    }
    public String getFormattingCode() {
        return formattingCode;
    }
    public int getRarity() {
        return rarity;
    }
}
