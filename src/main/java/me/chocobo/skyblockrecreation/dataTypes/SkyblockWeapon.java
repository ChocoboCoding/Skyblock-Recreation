package me.chocobo.skyblockrecreation.dataTypes;

import me.chocobo.skyblockrecreation.enums.ItemRarity;
import me.chocobo.skyblockrecreation.enums.ItemType;
import org.bukkit.Material;

import java.util.List;

public class SkyblockWeapon extends SkyblockItem {



    public SkyblockWeapon(Material material, String name, List<String> lore, ItemRarity rarity, int damage, int strength,
                          int critDamage, int critHit, int attackSpeed, int intelligence, int movementSpeed, int defense) {
        setMaterial(material);
        setName(name);
        setLore(lore);
        setType(ItemType.WEAPON);
        setRarity(rarity);
        setDamage(damage);
        setStrength(strength);
        setCritDamage(critDamage);
        setCritHit(critHit);
        setAttackSpeed(attackSpeed);
        setIntelligence(intelligence);
        setMovementSpeed(movementSpeed);
        setDefense(defense);
    }

    public Material getMaterial() {
        return material;
    }
    public String getName() {
        return name;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    public void setName(String name) {
        this.name = name;
    }
}
