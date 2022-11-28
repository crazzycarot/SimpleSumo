package simplesumo.simplesumo;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import simplesumo.simplesumo.commands.SetSpawnCommand;
import simplesumo.simplesumo.events.EventManager;

public final class SimpleSumo extends JavaPlugin implements Listener, CommandExecutor {

    private

    @Override
    public void onEnable() {
        new EventManager(this);
        getCommand("setsumospawn").setExecutor(new SetSpawnCommand(this));

    }

    @Override
    public void onDisable() {

    }
}
