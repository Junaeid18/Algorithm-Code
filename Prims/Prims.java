
package Prims;

public class Prims {
    final int v = 6;
    public int minKey(int[] key,boolean[] mstSet)
    {
        int n = Integer.MAX_VALUE;
            int index = -1;
        for(int i = 0 ; i < v ; i++)
        {
            if(key[i] < n && mstSet[i] == false)
            {
                n = key[i];
                index = i;
            }
        }
        return index;
    }
    void print(int[] parent,int[] key,int v)
    {
        System.out.println("Edge    Weight");
        for(int i = 1; i< v ; i++)
        {
            System.out.println(parent[i]+" - "+i+"    "+key[i]);
        }
    }
    void prims(int graph[][])
    {
        int parent[] = new int[v];
        int key[] = new int[v];
        boolean mstSet[] = new boolean[v];
        for(int i = 0 ; i < v ; i++)
        {
            mstSet[i] = false;
            key[i] = Integer.MAX_VALUE;
        }
        parent[0] = -1;
        key[0] = 0;
        for(int i = 0 ; i < v-1 ; i++)
        {
            int a = minKey(key,mstSet);
            mstSet[a] = true;
            for(int j = 0 ; j < v ; j++)
            {
                if(graph[a][j] != 0 && mstSet[j] == false && graph[a][j] < key[j])
                {
                    key[j] = graph[a][j];
                    parent[j] = a;
                }
            }
        }
        print(parent,key,v);
    }
}
