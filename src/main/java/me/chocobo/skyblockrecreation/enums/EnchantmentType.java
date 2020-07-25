package me.chocobo.skyblockrecreation.enums;

public enum EnchantmentType {
    SHARPNESS("Sharpness", ItemType.SWORD);

    private final String name;
    private final ItemType itemType;

    private EnchantmentType(String name, ItemType itemType) {
        this.name = name;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }
    public ItemType getItemType() {
        return itemType;
    }
}
