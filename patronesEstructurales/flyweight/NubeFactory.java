package patronesEstructurales.flyweight;

import java.util.HashMap;

public class NubeFactory {
    private HashMap<TipoNube, Nube> nubesMap;

    public NubeFactory() {
        nubesMap = new HashMap<TipoNube, Nube>();
    }

    public Nube getNube(TipoNube tipo) {
        Nube nube = nubesMap.get(tipo);

        if (nube == null) {
            nube = new Nube(tipo, "nube.png", 100, 100);
            nubesMap.put(tipo, nube);
        }
        return nube;
    }

    public int countNubesMap() {
        return nubesMap.size();
    }
}
