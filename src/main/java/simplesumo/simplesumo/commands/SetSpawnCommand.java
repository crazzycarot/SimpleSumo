package simplesumo.simplesumo.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import simplesumo.simplesumo.SimpleSumo;

public class SetSpawnCommand implements CommandExecutor {

    private SimpleSumo simpleSumo;

    public SetSpawnCommand(SimpleSumo simpleSumo) {
        this.simpleSumo = simpleSumo;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args[0] == "1" || args[0] == "2") {
            if (sender instanceof Player) {
                Player player = ((Player) sender).getPlayer();
                Location playerLocation = player.getLocation();
                playerLocation.setY(playerLocation.getY() + 2);

                //do things in data manager

            } else {
                Bukkit.getLogger().fine("You need to be a Player to execute this command");
            }

        } else {
            //send error message
            return true;
        }



        return true;
    }
}
