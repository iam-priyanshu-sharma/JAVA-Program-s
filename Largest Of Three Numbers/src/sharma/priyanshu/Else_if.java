package sharma.priyanshu;

public class Else_if {

    public static void main (String[] args) {
        int a = 40, b = 78, c = 19;

        if ( a >= b && a >= c ) {
            System.out.println (a + " is the largest Number");
        } else if ( b >= a && b >= c ) {
            System.out.println (b + " is the largest Number");
        } else {
            System.out.println (c + " is the largest number");
        }
    }
}
