package me.chocobo.skyblockrecreation.commands;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.utils.Startup;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetStrengthCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            SkyblockPlayer player = Startup.getSkyblockPlayers().get(((Player) sender).getUniqueId());
            try {
                player.setStrength(Integer.parseInt(args[0]));
                sender.sendMessage("Succesfully set strength to " + player.getStrength());
            } catch (Exception exception) {
                sender.sendMessage("§cUsage: /setstrength <strength>");
            }
        }
        return false;
    }
}
