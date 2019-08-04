
package Greedy;

public class BellmanFord {
   public int[] distance;
   public int vertex;
   public final int max = 555;
   BellmanFord(int vertex)
   {
       this.vertex = vertex;
       this.distance = new int[vertex+1];
   }
   public void work(int source,int adj[][])
   {
       for(int i = 1 ; i <= vertex ; i++)
       {
           distance[i] = max;
       }
       distance[source] = 0;
       for(int n =  1 ; n <= vertex-1 ; n++)
       {
           for(int s = 1 ; s <= vertex ; s++)
           {
               for(int d = 1 ; d<= vertex ; d++)
               {
                   if(adj[s][d] != max)
                   {
                       if(distance[d] > distance[s]+adj[s][d])
                       {
                           distance[d] = distance[s]+adj[s][d];
                       }
                   }
               }
           }
       }
       for(int s = 1; s<= vertex ; s++)
       {
           for(int d = 1 ; d <= vertex ; d++)
           {
               if(adj[s][d] != max)
                {
                    if(distance[d] > distance[s]+adj[s][d])
                    {
                        System.out.println("There is a negative cycle in this Graph");
                    }
                }
           }
       }
       for(int v = 1 ; v <= vertex ; v++)
       {
           System.out.println("Distance from "+source+" To "+v+
                   " is : "+distance[v]);
       }
   }
}
