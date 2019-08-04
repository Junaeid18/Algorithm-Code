
package DFS;

public class Main {
    public static void main(String[] args)
    {
       Dfs s = new Dfs(7);
       s.addEdge(0, 1);
       s.addEdge(0, 3);
       s.addEdge(0, 4);
       s.addEdge(1, 2);
       s.addEdge(2, 4);
       s.addEdge(4, 5);
       s.addEdge(1, 3);
       s.dfs(1);
    }
}
