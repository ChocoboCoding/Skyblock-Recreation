package me.chocobo.skyblockrecreation.commands;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockEnemy;
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
            SkyblockEnemy enemy = new SkyblockEnemy(Startup.getSkyblockEnemies().get(Integer.parseInt(args[0])));
            enemy.spawnEnemy(player.getWorld(), player.getLocation());
        }
        return false;
    }
}
