package simplesumo.simplesumo.events;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import simplesumo.simplesumo.SimpleSumo;

public class EventManager implements Listener {

    private SimpleSumo simpleSumo;

    public EventManager(SimpleSumo simpleSumo) {
        this.simpleSumo = simpleSumo;
        Bukkit.getPluginManager().registerEvents(this, simpleSumo);
    }





}
