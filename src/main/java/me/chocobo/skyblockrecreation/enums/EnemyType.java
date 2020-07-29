package me.chocobo.skyblockrecreation.enums;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;

public enum EnemyType {
    ZOMBIE("Zombie", EntityType.ZOMBIE),
    //ZOMBIE_VILLAGER("", EntityType.VILLAGER),
    LAPIS_ZOMBIE("Lapis Zombie", EntityType.ZOMBIE),
    DIAMOND_ZOMBIE("Zombie", EntityType.ZOMBIE),
    HARDENED_DIAMOND_ZOMBIE("Zombie", EntityType.ZOMBIE),
    CRYPT_GHOUL("Crypt Ghoul", EntityType.ZOMBIE),
    GOLDEN_GHOUL("Golden Ghoul", EntityType.ZOMBIE),
    ZOMBIE_PIGMAN("Zombie Pigman", EntityType.PIG_ZOMBIE),
    SKELETON("Skeleton", EntityType.SKELETON),
    DIAMOND_SKELETON("Skeleton", EntityType.SKELETON),
    HARDENED_DIAMOND_SKELETON("Skeleton", EntityType.SKELETON),
    JOCKEY_SKELETON("Jockey Skeleton", EntityType.SKELETON),
    //WITHER_SKELETON("", EntityType.WITHER_SKELETON),
    SPLITTER_SPIDER("Splitter Spider", EntityType.SPIDER),
    DASHER_SPIDER("Dasher Spider", EntityType.SPIDER),
    WEAVER_SPIDER("Weaver Spider", EntityType.SPIDER),
    JOCKEY_SPIDER("Jockey Spider", EntityType.SPIDER),
    VORACIOUS_SPIDER("Voracious Spider", EntityType.SPIDER),
    SILVERFISH("Silverfish", EntityType.SILVERFISH),
    ENDERMITE("Endermite", EntityType.ENDERMITE),
    WITCH("Witch", EntityType.WITCH),
    CREEPER("Creeper", EntityType.CREEPER),
    BLAZE("Blaze", EntityType.BLAZE),
    SLIME("Slime", EntityType.SLIME),
    SLIME_SMALL("Slime", EntityType.SLIME),
    SLIME_MEDIUM("Slime", EntityType.SLIME),
    SLIME_LARGE("Slime", EntityType.SLIME),
    CUBE_SMALL("Magma Cube", EntityType.MAGMA_CUBE),
    CUBE_MEDIUM("Magma Cube", EntityType.MAGMA_CUBE),
    CUBE_LARGE("Magma Cube", EntityType.MAGMA_CUBE),
    GHAST("Ghast", EntityType.GHAST),
    WOLF("Wolf", EntityType.WOLF),
    OLD_WOLF("Old Wolf", EntityType.WOLF),
    PACK_SPIRIT("Pack Spirit", EntityType.WOLF),
    HOWLING_SPIRIT("Howling Spirit", EntityType.WOLF),
    SOUL_OF_THE_ALPHA("Soul of the Alpha", EntityType.WOLF),
    ENDERMAN_SMALL("Enderman", EntityType.ENDERMAN),
    ENDERMAN_MEDIUM("Enderman", EntityType.ENDERMAN),
    ENDERMAN_LARGE("Enderman", EntityType.ENDERMAN),
    ZEALOT("Zealot", EntityType.ENDERMAN),
    CHEST_ZEALOT("Zealot", EntityType.ENDERMAN),
    SPECIAL_ZEALOT("Special Zealot", EntityType.ENDERMAN),
    WATCHER("Watcher", EntityType.SKELETON),
    OBSIDIAN_DEFENDER("Obsidian Defender", EntityType.SKELETON);

    private final String name;
    private final EntityType type;

    private EnemyType(String name, EntityType type) {
        this.name = name;
        this.type = type;
    }

    public EntityType getType() {
        return type;
    }
    public String getName() {
        return name;
    }
}
