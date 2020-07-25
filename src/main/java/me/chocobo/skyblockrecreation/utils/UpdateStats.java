package me.chocobo.skyblockrecreation.utils;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class UpdateStats {

    public void updateHotbar() {
        for (int i = 0; i < Startup.getSkyblockPlayers().size(); i++) {
            SkyblockPlayer skyblockPlayer = Startup.getSkyblockPlayers().get(i);
            Player player = Bukkit.getPlayer(skyblockPlayer.getUuid());
            if (skyblockPlayer.getCurrentHealth() < skyblockPlayer.getMaxHealth()) {
                Double regeneration = skyblockPlayer.getCurrentHealth() + skyblockPlayer.getMaxHealth() * 0.015;
                if (skyblockPlayer.getCurrentHealth() + (int) Math.round(regeneration) > skyblockPlayer.getMaxHealth()) skyblockPlayer.addCurrentHealth((int) Math.round(regeneration) - (skyblockPlayer.getCurrentHealth() + (int) Math.round(regeneration) - skyblockPlayer.getMaxHealth()));
                else skyblockPlayer.addCurrentHealth((int) Math.round(regeneration));
            }
            if (skyblockPlayer.getMana() < skyblockPlayer.getIntelligence()) {
                Double regeneration = skyblockPlayer.getMana() + skyblockPlayer.getIntelligence() * 0.015;
                if (skyblockPlayer.getMana() + (int) Math.round(regeneration) > skyblockPlayer.getIntelligence()) skyblockPlayer.addMana((int) Math.round(regeneration) - (skyblockPlayer.getMana() + (int) Math.round(regeneration) - skyblockPlayer.getIntelligence()));
                else skyblockPlayer.addMana((int) Math.round(regeneration));
            }
            player.sendActionBar("§c" + skyblockPlayer.getCurrentHealth() + "/" + skyblockPlayer.getMaxHealth() + "♥    §a" + skyblockPlayer.getDefense() + " Defense    §b" + skyblockPlayer.getMana() + "/" +skyblockPlayer.getIntelligence() + " Mana");

        }
    }
}
