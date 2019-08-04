
package Online_last_Week;

import java.util.Vector;

public class Problem {
    int s,d;
    int[] n;
    Vector<Integer> v = new Vector();
    Problem(int S,int[] N,int D)
    {
        s = S;
        n = N;
        d = D;
    }
    void work()
    {
        v.add(s);
        int step = 0;
        int l = 0;
        while(l==0)
        {
            step++;
            Vector<Integer> w = new Vector();
            int x = v.size();
            int y = n.length;
            for(int i = 0 ; i < x; i++)
            {
                for(int j =0 ; j < y ; j++)
                {
                    int a = v.elementAt(i)+ n[j];
                    w.add(a);
                    if(a == d)
                    {
                        System.out.println("Step :"+step );
                        l = 5;
                        break;
                    }
                }
                if(l==5)
                    break;
            }
            if(l == 0)
            {
                v.clear();
                int x1 = w.size();
                for(int i = 0 ; i < x1; i++)
                {
                    int k = w.elementAt(i);
                    v.add(k);
                }   
            }
        }
    }        
}
