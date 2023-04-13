package sharma.priyanshu;

public class Modulus_Operator {

    public static void main (String[] args) {
        int a = 112, b = 543;
        System.out.println ("GCD of " + a + " and " + b + " is " + findGCD (a, b));
    }

    static int findGCD (int a, int b) {
        if ( b == 0 ) {
            return a;
        }
        return findGCD (b, a % b);
    }
}
