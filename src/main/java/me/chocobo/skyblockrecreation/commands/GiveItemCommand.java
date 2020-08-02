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
                System.out.println("GiveItemCommand.onCommand 1");
                SkyblockPlayer skyblockPlayer = Startup.getSkyblockPlayers().get(player.getUniqueId());
                System.out.println("GiveItemCommand.onCommand 2");
                SkyblockItem item = Startup.getSkyblockItem(Integer.parseInt(args[0]));
                System.out.println("GiveItemCommand.onCommand 3");
                skyblockPlayer.giveItem(item);
                System.out.println("GiveItemCommand.onCommand 4");
            }
        } else sender.sendMessage("§cYou have to be a Player to use this Command");
        return false;
    }
}
