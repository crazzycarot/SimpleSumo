package simplesumo.simplesumo.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import simplesumo.simplesumo.SimpleSumo;
import sun.java2d.pipe.SpanShapeRenderer;

public class SumoCommand implements CommandExecutor {

    private SimpleSumo simpleSumo;

    public SumoCommand(SimpleSumo simpleSumo) {
        this.simpleSumo = simpleSumo;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //Three options, help || no args == random search || username


        if (args.length < 0) {

        }

        if(args.length == 0) {
            if (args[0] == "help") {

            }
            Player target = Bukkit.getPlayer(args[0]);
            if (target != null) {

            }
        }




        return true;
    }
}
