package me.chocobo.skyblockrecreation.commands;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockItem;
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
            if (args.length == 1) {
                Player player = (Player) sender;
                SkyblockPlayer skyblockPlayer = Startup.getSkyblockPlayers().get(player.getUniqueId());
                SkyblockItem item = Startup.getSkyblockItems().get(Integer.parseInt(args[0]));
                skyblockPlayer.giveItem(item);
            }
        } else sender.sendMessage("§cYou have to be a Player to use this Command");
        return false;
    }
}
