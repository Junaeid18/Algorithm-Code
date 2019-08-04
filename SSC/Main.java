
package SSC;

public class Main {
   public static void main(String[] args)
   {
       Strongly_Connected_Component s = new Strongly_Connected_Component(5);
       s.Edge(1, 0);
       s.Edge(0, 2);
       s.Edge(2, 1);
       s.Edge(0, 3);
       s.Edge(3, 4);
       System.out.println("RESULT :");
       s.SSC();
   }
}
