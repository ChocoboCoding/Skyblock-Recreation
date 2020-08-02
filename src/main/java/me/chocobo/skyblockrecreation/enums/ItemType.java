package me.chocobo.skyblockrecreation.enums;

public enum ItemType {
    MELEE("WEAPON"),
    SWORD("SWORD"),
    ROD("FISHING ROD"),
    BOW("BOW"),
    ACCESSORY("ACCESSORY"),
    HELMET("HELMET"),
    CHESTPLATE("CHESTPLATE"),
    LEGGINGS("LEGGINGS"),
    BOOTS("BOOTS"),
    PICKAXE("PICKAXE"),
    AXE("AXE"),
    HOE("HOE"),
    SHOVEL("SHOVEL"),
    NORMAL("");

    private String loreMessage;

    ItemType(String loreMessage) {
        this.loreMessage = loreMessage;
    }

    public String getLoreMessage() {
        return loreMessage;
    }
}
