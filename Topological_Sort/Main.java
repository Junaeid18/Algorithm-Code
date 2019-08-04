
package Topological_Sort;

public class Main {
    public static void main(String[] args)
    {
        Graph g = new Graph(6);
        g.edge(5, 2);
        g.edge(5, 0);
        g.edge(4, 0);
        g.edge(4, 1);
        g.edge(2, 3);
        g.edge(3, 1);
        System.out.println("Result :");
        g.sort();
    }
}
