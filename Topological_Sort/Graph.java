
package Topological_Sort;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;


public class Graph {
    public int v;
    public Vector<Integer> adj[];
    Graph(int V)
    {
        v = V;
        adj = new Vector[v];
        for(int i = 0 ; i < v; i++)
            adj[i] = new Vector();
    }
    void edge(int s,int e)
    {
        adj[s].add(e);
    }
    void sort()
    {
        Stack s = new Stack();
        boolean visited[] = new boolean[v];
        for(int j = 0 ; j < v ; j++)
            visited[j]= false;
        for(int i = 0 ; i < v ; i++)
        {
            if(visited[i]==false)
            {
                Topo_sort(i,visited,s);
            }    
        }    
        while(s.empty()==false)
        {
            System.out.print(s.pop()+" ");
        }
    }
    void Topo_sort(int v, boolean visited[],Stack s)
    {
        int f;
        visited[v] = true;
        Iterator<Integer> it = adj[v].iterator();
        while(it.hasNext())
        {
            f = it.next();
            if(visited[f]==false)
                Topo_sort(f,visited,s);
        }
        System.out.println("Value"+v);
        s.push(v);
    }
}
