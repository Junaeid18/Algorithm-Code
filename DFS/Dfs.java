
package DFS;

import java.util.LinkedList;

public class Dfs {
    int Black = 0,Gray = 1,White = 2,time;
    int v;
    int color[] = new int[100];
    int dis[] = new int[100];
    int fin[] = new int[100];
    int parent[] = new int[100];
    LinkedList<Integer> adj[];
    Dfs(int V)
    {
        v = V;
        adj = new LinkedList[v];
        for(int i = 0 ; i < v ;i++)
            adj[i] = new LinkedList();
    }
    void addEdge(int s, int e)
    {
        adj[s].add(e);
    }
    void dfs(int start)
    {
        for(int i = 0 ; i < start ; i++)
            color[i] = White;
        time = 0;
        for(int i = 0 ; i < start; i++ )
        {
            if(color[i]== White)
            {
                dfs_visit(i,start);
            }
        }
    }
    void dfs_visit(int u , int start)
    {
        color[u] = Gray;
        dis[u] = time++;
        for(int i = 0 ;i <start ; i++)
        {
            if(color[i]== White)
            {
                parent[i] = u;
                dfs_visit(i,start);
            }
        }
        color[u] = Black;
        fin[u] = time++;
        System.out.println(u+" ");
    }
}
