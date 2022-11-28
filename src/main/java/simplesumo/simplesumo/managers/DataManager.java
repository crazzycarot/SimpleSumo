package simplesumo.simplesumo.managers;


import org.bukkit.Location;
import simplesumo.simplesumo.SimpleSumo;
import sun.java2d.pipe.SpanShapeRenderer;

public class DataManager {

    private SimpleSumo simpleSumo;

    public DataManager(SimpleSumo simpleSumo) {
        this.simpleSumo = simpleSumo;
    }

    public void setSpawnPoint(Location spawnPoint, int spawnnumber) {
        if (spawnPoint instanceof Location) {
            if (spawnnumber == 1 || spawnnumber == 2) {
                simpleSumo.getConfig().set("configuration.spawnpoints." + spawnnumber, spawnPoint);
            }

        }
    }

}
