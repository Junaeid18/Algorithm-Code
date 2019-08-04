
package Online_last_Week;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s,d,num;
        System.out.println("Enter Source : ");
            s = sc.nextInt();
        System.out.println("Enter Number of Element in array :");
            num = sc.nextInt();
        int ar[] = new int[num];     
        for(int i = 0 ; i < num; i++)
        {
            System.out.println("Enter Element no."+(i+1)+" : ");
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter your Destination : ");
            d = sc.nextInt();
        Problem p = new Problem(s,ar,d);
        p.work();
    }
}
