
package Greedy;

import java.util.HashSet;
import java.util.Iterator;

public class Dijkstra {
    int[] distance;
    HashSet<Integer> s;     //s = settled
    HashSet<Integer> uns;   //uns = unsettled
    int[][] adj;
    int vertex;
    final int max = 555;
    Dijkstra(int v)
    {
        this.distance = new int[v+1];
        this.s =  new HashSet<Integer>();
        this.uns = new HashSet<Integer>();
        this.adj = new int[v+1][v+1];
        this.vertex = v;
    }
    public void work(int source, int adj_m[][])
    {
        int u;
        for(int i = 1 ; i <= vertex ; i++)
        {
            for(int j = 0 ; j <= vertex ; j++)
            {
                adj[i][j] = adj_m[i][j];
            }
        }
        for(int i = 1 ; i<= vertex ; i++)
        {
            distance[i] = max;
        }
        uns.add(source);
        distance[source] = 0 ;
        while(!uns.isEmpty())
        {
            u = ExtractMin();
            uns.remove(u);
            s.add(u);
            discover_neighbour(u);
        }
    }
    public int ExtractMin()
    {
        int min;
        int node = 0;
        Iterator<Integer> i = uns.iterator();
        node = i.next();
        min = distance[node];
        for(int j = 1 ; j <= vertex ; j++)
        {
            if(uns.contains(j))
            {
                if(distance[j] <= min)
                {
                    min = distance[j];
                    node = j;
                }
            }
        }
        return node;
    }
    public void discover_neighbour(int u)
    {
        int edge_dis = -1;
        int new_dis = -1;
        for(int i = 1 ; i<= vertex; i++)
        {
            if(!s.contains(i))
            {
                if(adj[u][i] != max)
                {
                    edge_dis = adj[u][i];
                    new_dis =distance[u] + edge_dis;
                    if(distance[i] > new_dis)
                    {
                        distance[i] = new_dis;
                    }
                    uns.add(i);
                }
            }
        }
    }
    public void print( int s)
    {
        for(int i = 1 ; i<= vertex ; i++)
        {
            System.out.println(s+" From "+i+" is : "+distance[i]);
        }
    }
}
