package me.chocobo.skyblockrecreation;

import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyblockRecreation extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        loadCommands();
        loadEvents();
        Startup.startupItems();

    }
    public void loadCommands() {
        System.out.println("Skyblock>> Succesfully loaded Commands");
    }

    public void loadEvents() {
        System.out.println("Skyblock>> Succesfully oaded Events");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
