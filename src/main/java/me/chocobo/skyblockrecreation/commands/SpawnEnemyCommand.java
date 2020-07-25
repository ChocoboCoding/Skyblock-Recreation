package me.chocobo.skyblockrecreation.commands;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class SpawnEnemyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            SkyblockPlayer skyblockPlayer = Startup.getSkyblockPlayers().get(player.getUniqueId());
            Startup.getSkyblockEnemies().get(Integer.getInteger(args[0])).spawnEnemy(player.getWorld(), player.getLocation());
        }
        return false;
    }
}
