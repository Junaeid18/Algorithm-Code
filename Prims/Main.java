
package Prims;

public class Main {
    public static void main(String[] args)
    {
        int graph[][] = {{0, 3, 0, 1, 0,0},
                         {3 ,0, 1, 3, 0,0},
                         {0, 1, 0, 1, 3,4},
                         {1, 3, 1, 0, 6,0},
                         {0, 0, 3, 6, 0,2},
                         {0, 0, 4, 0, 2,0},
                         };
        Prims p = new Prims();
        p.prims(graph);
    }
}
