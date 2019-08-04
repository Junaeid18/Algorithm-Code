
package Floyd_Warshall;
public class Main {
    public static void main(String[] args){
        final int INF = 99999, V = 4;
        int ar[][] =    { {0,   5,  INF, 10},
                          {INF, 0,   3, INF},
                          {INF, INF, 0,   1},
                          {INF, INF, INF, 0}
                        };
        Floyd_Warshall war = new Floyd_Warshall();
        war.floydWarshall(ar);
    }
}
