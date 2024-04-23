package clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> spectatorMap;

    public Fabrica() {
        this.spectatorMap = new HashMap<String, Flyweight>();
    }
    public Flyweight getSpectator(int inaltime, int latime) {
        String cheie = "" + inaltime + "_" + latime;
        Flyweight flyweight = spectatorMap.get(cheie);
        if(flyweight == null) {
            flyweight = new Spectator(inaltime,latime);
            spectatorMap.put(cheie, flyweight);
        }
        return flyweight;
    }
}
