
package SSC;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Strongly_Connected_Component {
    int v;
    Vector<Integer> adj[];
    Strongly_Connected_Component(int V)
    {
        v = V;
        adj = new Vector[v];
        for(int i = 0 ; i < v ; i++)
            adj[i] = new Vector();
    }
    void Edge(int s,int e)
    {
        adj[s].add(e);
    }
    void dfs(int b,boolean visited[])
    {
        visited[b] = true;
        System.out.printf("%d ",b);
        int c;
        Iterator<Integer> it = adj[b].iterator();
        while(it.hasNext())
        {
            c = it.next();
            if( visited[c]== false)
            {
                dfs(c,visited);
            }
        }
    }
    Strongly_Connected_Component transpose()
    {
        Strongly_Connected_Component a = new Strongly_Connected_Component(v);
        for(int j  = 0 ; j < v; j++)
        {
            Iterator<Integer> i = adj[j].iterator();
            while(i.hasNext()){
                a.adj[i.next()].add(j);
            }
        }
        return a;
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
        s.push(v);
    }
    void SSC()
    {
        Stack s = new Stack();
        boolean visited[] = new boolean[v];
        for(int i = 0 ; i< v ; i++)
            visited[i] = false;
        for(int i = 0 ; i < v ; i++)
            if(visited[i] == false)
            {
                Topo_sort(i,visited,s);
            }    
        Strongly_Connected_Component gr = transpose();
        for(int i = 0 ; i< v; i++)
            visited[i] = false;
        while(s.empty() == false)
        {
            int b = (int) s.pop();
            if(visited[b]== false)
            {
                gr.dfs(b,visited);
                System.out.println("");
            }
        }
        
    }
}
