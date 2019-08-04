
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


public class SCC {
    private int v;   
    private LinkedList<Integer> adj[]; 
 
    SCC(int V)
    {
        v = V;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w)  { adj[v].add(w); }
    
    void dfs(int c,boolean visited[])
    {
        visited[c] = true;
        System.out.print(c + " ");
        int n;
        Iterator<Integer> i =adj[c].iterator();
        while (i.hasNext())
        {
            n = i.next();
            if (!visited[n])
                dfs(n,visited);
        }
    }
    SCC getTranspose()
    {
        SCC g = new SCC(v);
        for (int a = 0; a < v; a++)
        {
            Iterator<Integer> i =adj[a].listIterator();
            while(i.hasNext())
                g.adj[i.next()].add(a);
        }
        return g;
    }
 
    void fillOrder(int b, boolean visited[], Stack stack)
    {
        visited[b] = true;
        Iterator<Integer> i = adj[b].iterator();
        while (i.hasNext())
        {
            int n = i.next();
            if(!visited[n])
                fillOrder(n, visited, stack);
        }
        stack.push(b);
    }
 
    void printSCC()
    {
        Stack stack = new Stack();
        boolean visited[] = new boolean[v];
        for(int i = 0; i < v; i++)
            visited[i] = false;
        for (int i = 0; i < v; i++)
            if (visited[i] == false)
                fillOrder(i, visited, stack);
        SCC s = getTranspose();
        for (int i = 0; i < v; i++)
            visited[i] = false;
        while (stack.empty() == false)
        {
            int d = (int)stack.pop();
            if (visited[d] == false)
            {
                s.dfs(d, visited);
                System.out.println();
            }
        }
    }
}
