package sharma.priyanshu;

import java.util.Scanner;

public class Euclidean_Algorithm {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the two numbers: ");
        int x = sc.nextInt ();
        int y = sc.nextInt ();
        System.out.println ("The GCD of two numbers is: " + findGCD (x, y));
    }

    static int findGCD (int x, int y) {
        int r, a, b;
        a = Math.max (x, y);
        b = Math.min (x, y);
        r = b;

        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }

        return r;
    }
}
