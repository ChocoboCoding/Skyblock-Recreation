package me.chocobo.skyblockrecreation;

import me.chocobo.skyblockrecreation.commands.GiveItemCommand;
import me.chocobo.skyblockrecreation.commands.SpawnEnemyCommand;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockEnemy;
import me.chocobo.skyblockrecreation.events.DamageListener;
import me.chocobo.skyblockrecreation.events.InventoryClickListener;
import me.chocobo.skyblockrecreation.events.PlayerJoinListener;
import me.chocobo.skyblockrecreation.events.RightClickListener;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyblockRecreation extends JavaPlugin {

    private static SkyblockRecreation plugin;


    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        loadCommands();
        loadEvents();
        Startup.menuCache();
        Startup.enemyCache();
        Startup.weaponCache();
    }
    public void loadCommands() {
        getCommand("giveitem").setExecutor(new GiveItemCommand());
        getCommand("spawnenemy").setExecutor(new SpawnEnemyCommand());
        System.out.println("Skyblock>> Succesfully loaded Commands");
    }

    public void loadEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new RightClickListener(), this);
        pm.registerEvents(new InventoryClickListener(), this);
        pm.registerEvents(new DamageListener(), this);
        System.out.println("Skyblock>> Succesfully loaded Events");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SkyblockRecreation getPlugin() {
        return plugin;
    }
}
