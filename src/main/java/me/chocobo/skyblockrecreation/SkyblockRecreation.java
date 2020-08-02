package me.chocobo.skyblockrecreation;

import me.chocobo.skyblockrecreation.commands.GetItemInHandCommand;
import me.chocobo.skyblockrecreation.commands.GiveItemCommand;
import me.chocobo.skyblockrecreation.commands.SetStrengthCommand;
import me.chocobo.skyblockrecreation.commands.SpawnEnemyCommand;
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

    public void main(String[] args) {
        onEnable();
    }

    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        loadCommands();
        loadEvents();
        loadCache();
    }
    public void loadCommands() {
        getCommand("giveitem").setExecutor(new GiveItemCommand());
        getCommand("spawnenemy").setExecutor(new SpawnEnemyCommand());
        getCommand("setstrength").setExecutor(new SetStrengthCommand());
        getCommand("getiteminhand").setExecutor(new GetItemInHandCommand());
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

    public void loadCache() {
        Startup.menuCache();
        Startup.enemyCache();
        Startup.weaponCache();
        System.out.println("Skyblock >> Succesfully loaded Cache");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SkyblockRecreation getPlugin() {
        return plugin;
    }
}
