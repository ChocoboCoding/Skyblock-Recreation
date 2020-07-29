package me.chocobo.skyblockrecreation.events;

import me.chocobo.skyblockrecreation.SkyblockRecreation;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockEnemy;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockEntity;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.Bukkit;
import org.bukkit.entity.*;
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
        if (event.getEntityType() == EntityType.PLAYER) {
            event.setDamage(0);
            SkyblockPlayer damaged = Startup.getSkyblockPlayers().get(event.getEntity().getUniqueId());
            if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                damaged.damage(damager);
                Player damagedEntity = (Player) event.getEntity();
                if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
            } else {
                if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                    SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                    damaged.damage(damager);
                    Player damagedEntity = (Player) event.getEntity();
                    if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                }
            }
        } else {
            SkyblockEnemy damaged;
            switch (event.getEntityType()) {
                case BLAZE:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Blaze damagedEntity = (Blaze) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Blaze damagedEntity = (Blaze) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case CAVE_SPIDER:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        CaveSpider damagedEntity = (CaveSpider) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            CaveSpider damagedEntity = (CaveSpider) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case CREEPER:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Creeper damagedEntity = (Creeper) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Creeper damagedEntity = (Creeper) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case ELDER_GUARDIAN:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        ElderGuardian damagedEntity = (ElderGuardian) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            ElderGuardian damagedEntity = (ElderGuardian) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case ENDERMAN:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Enderman damagedEntity = (Enderman) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Enderman damagedEntity = (Enderman) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case ENDERMITE:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Endermite damagedEntity = (Endermite) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Endermite damagedEntity = (Endermite) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case GHAST:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Ghast damagedEntity = (Ghast) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Ghast damagedEntity = (Ghast) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case ENDER_DRAGON:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        EnderDragon damagedEntity = (EnderDragon) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            EnderDragon damagedEntity = (EnderDragon) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case GUARDIAN:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Guardian damagedEntity = (Guardian) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Guardian damagedEntity = (Guardian) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case IRON_GOLEM:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        IronGolem damagedEntity = (IronGolem) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            IronGolem damagedEntity = (IronGolem) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case MAGMA_CUBE:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        MagmaCube damagedEntity = (MagmaCube) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            MagmaCube damagedEntity = (MagmaCube) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case PIG_ZOMBIE:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        PigZombie damagedEntity = (PigZombie) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            PigZombie damagedEntity = (PigZombie) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case SILVERFISH:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Silverfish damagedEntity = (Silverfish) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Silverfish damagedEntity = (Silverfish) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case SKELETON:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Skeleton damagedEntity = (Skeleton) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Skeleton damagedEntity = (Skeleton) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case SLIME:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Slime damagedEntity = (Slime) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Slime damagedEntity = (Slime) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case SPIDER:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Spider damagedEntity = (Spider) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Spider damagedEntity = (Spider) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case WITCH:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Witch damagedEntity = (Witch) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Witch damagedEntity = (Witch) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case WITHER:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Wither damagedEntity = (Wither) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Wither damagedEntity = (Wither) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case WITHER_SKELETON:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        WitherSkeleton damagedEntity = (WitherSkeleton) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            WitherSkeleton damagedEntity = (WitherSkeleton) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case WOLF:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Wolf damagedEntity = (Wolf) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Wolf damagedEntity = (Wolf) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
                case ZOMBIE:
                    event.setDamage(0);
                    damaged = Startup.getLivingEnemies().get(event.getEntity().getUniqueId());
                    if (event.getDamager().getType().equals(EntityType.PLAYER)) {
                        SkyblockPlayer damager = Startup.getSkyblockPlayers().get(event.getDamager().getUniqueId());
                        damaged.damage(damager);
                        Zombie damagedEntity = (Zombie) event.getEntity();
                        if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                    } else {
                        if (Startup.getLivingEnemies().containsKey(event.getDamager().getUniqueId())) {
                            SkyblockEnemy damager = Startup.getLivingEnemies().get(event.getDamager().getUniqueId());
                            damaged.damage(damager);
                            Zombie damagedEntity = (Zombie) event.getEntity();
                            if (damaged.getCurrentHealth() <= 0) damagedEntity.setHealth(0);
                        }
                    }
            }
        }
    }
}
