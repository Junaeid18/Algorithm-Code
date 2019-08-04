
package Greedy;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args)
    {
        final int max = 555;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of vertex : ");
        int v = s.nextInt();
        int[][] adj = new int[v+1][v+1];
        System.out.println("Enter adjacency Matrix : ");
        for(int i = 1 ; i <= v ; i++)
        {
            for(int j = 1; j <= v ; j++)
            {
                adj[i][j] = s.nextInt();
                if(i == j)
                {
                    adj[i][j] = 0;
                }
                if(adj[i][j] == 0)
                {
                    adj[i][j] = max;
                }
            }
        }
        System.out.println("Enter Source vertex : ");
        int source = s.nextInt();
        Dijkstra d = new Dijkstra(v);
        d.work(source, adj);
        d.print(source);
    }
}
