package hillClimbing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AngelC-Linux
 */
public class Destination {
    private String name;
    private Map<Destination, Integer> neighbors;

    public Destination(String name) {
        this.name = name;
        this.neighbors = new HashMap<>();
    }

    public void addNeighbor(Destination neighbor, int cost) {
        neighbors.put(neighbor, cost);
    }

    public String getName() {
        return name;
    }

    public Map<Destination, Integer> getNeighbors() {
        return neighbors;
    }    
}
