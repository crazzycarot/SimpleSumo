package simplesumo.simplesumo.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import simplesumo.simplesumo.SimpleSumo;

public class DebugCommand implements CommandExecutor {

    private SimpleSumo simpleSumo;

    public DebugCommand(SimpleSumo simpleSumo) {
        this.simpleSumo = simpleSumo;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.DARK_RED + "Running debugger:");
        //get location

        return true;
    }
}
