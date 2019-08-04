
package Knapsack;

public class Main {
    public static void main(String[] args)
    {
        int profit;
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        int n = val.length;
        Knapsack k = new Knapsack();
        profit =(k.knapSack(W, wt, val, n));
        System.out.println("Result : "+profit);
    }
}
