
package Online_last_Week;

import java.util.Vector;

public class Vect {
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector();
        v.add(5);
        v.add(45);
        v.add(7);
        int f = v.elementAt(0);
        int s = v.size();
        System.out.println("Size : " +s);
        System.out.println("First : "+f);
        v.remove(0);
        f = v.elementAt(0);
        System.out.println("First : "+f);
     }
}
