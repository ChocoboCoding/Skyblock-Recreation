package me.chocobo.skyblockrecreation.commands;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveItemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            SkyblockPlayer skyblockPlayer = Startup.getSkyblockPlayers().get(player);
            skyblockPlayer.giveItem(Startup.getSkyblockItems().get(Integer.getInteger(args[0])));

        } else sender.sendMessage("§cYou have to be a Player to use this Command");
        return false;
    }
}
