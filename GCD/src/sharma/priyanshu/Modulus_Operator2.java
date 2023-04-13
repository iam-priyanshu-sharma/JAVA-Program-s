package sharma.priyanshu;

public class Modulus_Operator2 {

    public static void main (String[] args) {
        int a = 54, b = 24;
        System.out.println ("GCD of " + a + " and " + b + " is " + gcd (a, b));
    }

    static int gcd (int a, int b) {
        if ( a == 0 ) {
            return b;
        }

        if ( b == 0 ) {
            return a;
        }

        if ( a == b ) {
            return a;
        }

        if ( a > b ) {
            return gcd (a - b, b);
        }

        return gcd (a, b - a);
    }
}
