package sharma.priyanshu;

public class Nested_if1 {

    public static void main (String[] args) {
        int x = 1010, y = 170, z = 169;

        if ( x >= y ) {
            if ( x >= z ) {
                System.out.println ("The largest number is: " + x);
            } else {
                System.out.println ("The largest number is: " + z);
            }
        } else {
            if ( y >= z ) {
                System.out.println ("The largest number is: " + y);
            } else {
                System.out.println ("The largest number is: " + z);
            }
        }
    }
}
