package simplesumo.simplesumo;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import simplesumo.simplesumo.commands.DebugCommand;
import simplesumo.simplesumo.commands.SetSpawnCommand;
import simplesumo.simplesumo.events.EventManager;

public final class SimpleSumo extends JavaPlugin implements Listener, CommandExecutor {


    @Override
    public void onEnable() {
        new EventManager(this);
        getCommand("setsumospawn").setExecutor(new SetSpawnCommand(this));
        getCommand("debugcommand").setExecutor(new DebugCommand(this));
        getCommand("sumo").setExecutor(new DebugCommand(this));
    }

    @Override
    public void onDisable() {

    }
}
