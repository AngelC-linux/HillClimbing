/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hillClimbing;

/**
 *
 * @author AngelC-Linux
 */
public class MainHC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Destination a = new Destination("a");
        Destination b = new Destination("b");
        Destination c = new Destination("c");
        Destination d = new Destination("d");
        Destination e = new Destination("e");

        a.addNeighbor(b, 100);
        a.addNeighbor(c, 125);
        a.addNeighbor(d, 100);
        a.addNeighbor(e, 75);

        b.addNeighbor(a, 100);
        b.addNeighbor(c, 50);
        b.addNeighbor(d, 75);
        b.addNeighbor(e, 125);

        c.addNeighbor(a, 125);
        c.addNeighbor(b, 50);
        c.addNeighbor(d, 100);
        c.addNeighbor(e, 125);

        d.addNeighbor(a, 100);
        d.addNeighbor(b, 75);
        d.addNeighbor(c, 100);
        d.addNeighbor(e, 50);

        e.addNeighbor(a, 75);
        e.addNeighbor(b, 125);
        e.addNeighbor(c, 125);
        e.addNeighbor(d, 50);

        Graph hillClimbing = new Graph(b);
        System.out.println("Estado inicial: " + hillClimbing.getCurrentState().getName());

        hillClimbing.hillClimb();

        System.out.println("Mejor estado encontrado: " + hillClimbing.getCurrentState().getName());

        System.out.println("Estados visitados:");
        for (Destination visitedState : hillClimbing.getVisitedStates()) {
            System.out.print(visitedState.getName() + ", ");
        }
        System.out.println("\n\n");
    }
}
