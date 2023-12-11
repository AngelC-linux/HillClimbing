/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hillClimbing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 *
 * @author AngelC-Linux
 */
public class Graph {
    private Destination currentState;
    private List<Destination> visitedStates;

    public Graph(Destination initialState) {
        this.currentState = initialState;
        this.visitedStates = new ArrayList<>();
    }

    public Destination getCurrentState() {
        return currentState;
    }

    public List<Destination> getVisitedStates() {
        return visitedStates;
    }

    public void hillClimb() {
        while (true) {
            visitedStates.add(currentState);

            Destination nextState = findBestNeighbor();
            if (nextState == null || nextState.equals(currentState)) {
                break;
            }
            currentState = nextState;
        }
    }

    private Destination findBestNeighbor() {
        Map<Destination, Integer> neighbors = currentState.getNeighbors();
        Destination bestNeighbor = null;
        int bestCost = Integer.MAX_VALUE;

        for (Map.Entry<Destination, Integer> entry : neighbors.entrySet()) {
            Destination neighbor = entry.getKey();
            int cost = entry.getValue();

            if (cost < bestCost && !visitedStates.contains(neighbor)) {
                bestCost = cost;
                bestNeighbor = neighbor;
            }
        }

        return bestNeighbor;
    }
}