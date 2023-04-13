// Using Multiplication and Division

package sharma.priyanshu;

public class Program3 {

    public static void main (String[] args) {
        int x = 10;
        int y = 20;
        System.out.println ("values before swapping:");
        System.out.println ("x = " + x + " y = " + y);
        x = x * y;
        y = x / y;
        x = x / y;
        System.out.println ("values after swapping:");
        System.out.println ("x = " + x + " y = " + y);
    }
}
