
public class SCC_Main {
    public static void main(String[] args)
    {
        SCC sc = new SCC(7);
        sc.addEdge(0, 1);
        sc.addEdge(0, 3);
        sc.addEdge(0, 4);
        sc.addEdge(1, 2);
        sc.addEdge(2, 4);
        sc.addEdge(4, 5);
        sc.addEdge(1, 3);
        
        sc.printSCC();
    }
}
