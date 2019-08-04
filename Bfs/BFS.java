
package Bfs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    int v;
    LinkedList<Integer> adj[];
    BFS(int V)
    {
        v = V;
        adj = new LinkedList[v];
        for(int  i = 0 ; i < v ; i++)
            adj[i] = new LinkedList();
    }
    void addEdge(int s,int e)
    {
        adj[s].add(e);
    }
    void work(int start)
    {
        int inf = 100000;
        int d[] = new int[v];
        for(int  j  = 0 ; j < v ; j++)
        {
            d[j] = inf;
        }
        LinkedList<Integer> q = new LinkedList<Integer>();
        d[0] = 0;
        q.offer(start);
        while(q.size() > 0)
        {
            int a = q.poll();
            System.out.println(a+" ");
            int b = adj[a].size();
            for(int k  = 0 ;k < b ;k++)
            {
                int h = adj[a].get(k);
                if(d[h]== inf)
                {
                    d[h] = d[a]+1;
                    q.offer(h);
                }
            }
        }
        for(int i = 0 ; i < v ; i++ )
        {
            System.out.printf("%d ",d[i]);
        }
    }
}
