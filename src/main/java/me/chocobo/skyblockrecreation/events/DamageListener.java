package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.SkyblockRecreation;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockEnemy;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        if (event.getEntityType().equals(EntityType.PLAYER)) {
            SkyblockPlayer damaged = Startup.getSkyblockPlayers().get(event.getEntity().getUniqueId());
            switch (event.getCause()) {
                case FIRE:
                    event.setDamage(0);
                    Bukkit.getScheduler().runTaskTimerAsynchronously(SkyblockRecreation.getPlugin(), () -> {
                        damaged.damage(5);
                    }, 20L, 20L);
                case LAVA:
                    event.setDamage(0);
                    Bukkit.getScheduler().runTaskTimerAsynchronously(SkyblockRecreation.getPlugin(), () -> {
                        damaged.damage(20);
                    }, 20L, 20L);
                case WITHER:
                    event.setDamage(0);
                    Bukkit.getScheduler().runTaskTimerAsynchronously(SkyblockRecreation.getPlugin(), () -> {
                        damaged.damage(1);
                    }, 20L, 20L);
                case DROWNING:
                    event.setDamage(0);
                    damaged.damage(damaged.getMaxHealth()/20);
                case SUFFOCATION:
                    event.setDamage(0);
                    damaged.damage(50);
            }
        } else {
            SkyblockEnemy damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
            switch (event.getCause()) {
                case FIRE:
                    event.setDamage(0);
                    Bukkit.getScheduler().runTaskTimerAsynchronously(SkyblockRecreation.getPlugin(), () -> {
                        damaged.damage(5);
                    }, 20L, 20L);
                case LAVA:
                    event.setDamage(0);
                    Bukkit.getScheduler().runTaskTimerAsynchronously(SkyblockRecreation.getPlugin(), () -> {
                        damaged.damage(20);
                    }, 20L, 20L);
                case WITHER:
                    event.setDamage(0);
                    Bukkit.getScheduler().runTaskTimerAsynchronously(SkyblockRecreation.getPlugin(), () -> {
                        damaged.damage(1);
                    }, 20L, 20L);
                case DROWNING:
                    event.setDamage(0);
                    damaged.damage(damaged.getMaxHealth()/20);
                case SUFFOCATION:
                    event.setDamage(0);
                    damaged.damage(50);
            }
        }
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getEntityType().equals(EntityType.PLAYER)) {
            SkyblockPlayer damaged = Startup.getSkyblockPlayers().get(event.getEntity().getUniqueId());
            if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                damaged.damage(damager);
            } else {
                SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                damaged.damage(damager);
            }
        } else {
            SkyblockEnemy damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
            if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                damaged.damage(damager);
            } else {
                SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                damaged.damage(damager);
            }
        }
    }
}
