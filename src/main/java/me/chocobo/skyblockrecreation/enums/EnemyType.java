package me.chocobo.skyblockrecreation.enums;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;

public enum EnemyType {
    ZOMBIE("", EntityType.ZOMBIE),
    //ZOMBIE_VILLAGER("", EntityType.VILLAGER),
    LAPIS_ZOMBIE("", EntityType.ZOMBIE),
    DIAMOND_ZOMBIE("", EntityType.ZOMBIE),
    HARDENED_DIAMOND_ZOMBIE("", EntityType.ZOMBIE),
    CRYPT_GHOUL("", EntityType.ZOMBIE),
    GOLDEN_GHOUL("", EntityType.ZOMBIE),
    ZOMBIE_PIGMAN("", EntityType.PIG_ZOMBIE),
    SKELETON("", EntityType.SKELETON),
    DIAMOND_SKELETON("", EntityType.SKELETON),
    HARDENED_DIAMOND_SKELETON("", EntityType.SKELETON),
    JOCKEY_SKELETON("", EntityType.SKELETON),
    //WITHER_SKELETON("", EntityType.WITHER_SKELETON),
    SPLITTER_SPIDER("", EntityType.SPIDER),
    DASHER_SPIDER("", EntityType.SPIDER),
    WEAVER_SPIDER("", EntityType.SPIDER),
    JOCKER_SPIDER("", EntityType.SPIDER),
    VORACIOUS_SPIDER("", EntityType.SPIDER),
    SILVERFISH("", EntityType.SILVERFISH),
    ENDERMITE("", EntityType.ENDERMITE),
    WITCH("", EntityType.WITCH),
    CREEPER("", EntityType.CREEPER),
    BLAZE("", EntityType.BLAZE),
    SLIME("", EntityType.SLIME),
    SLIME_SMALL("", EntityType.SLIME),
    SLIME_MEDIUM("", EntityType.SLIME),
    SLIME_LARGE("", EntityType.SLIME),
    CUBE_SMALL("", EntityType.MAGMA_CUBE),
    CUBE_MEDIUM("", EntityType.MAGMA_CUBE),
    CUBE_LARGE("", EntityType.MAGMA_CUBE),
    GHAST("", EntityType.GHAST),
    WOLF("", EntityType.WOLF),
    OLD_WOLF("", EntityType.WOLF),
    PACK_SPIRIT("", EntityType.WOLF),
    HOWLING_SPIRIT("", EntityType.WOLF),
    SOUL_OF_THE_ALPHA("", EntityType.WOLF),
    ENDERMAN_SMALL("", EntityType.ENDERMAN),
    ENDERMAN_MEDIUM("", EntityType.ENDERMAN),
    ENDERMAN_LARGE("", EntityType.ENDERMAN),
    ZEALOT("", EntityType.ENDERMAN),
    CHEST_ZEALOT("", EntityType.ENDERMAN),
    SPECIAL_ZEALOT("", EntityType.ENDERMAN),
    WATCHER("", EntityType.SKELETON),
    OBSIDIAN_DEFENDER("", EntityType.SKELETON);

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
