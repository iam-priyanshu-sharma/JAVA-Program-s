package sharma.priyanshu;

import java.util.Scanner;

public class User_Define_Method {

    public static void main (String[] args) {
        int a, b, gcd;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the First Number: ");
        a = scanner.nextInt ();
        System.out.print ("Enter the Second Number: ");
        b = scanner.nextInt ();
        gcd = findGCD (a, b);
        System.out.println ("GCD of " + a + " and " + b + " =  " + gcd);
    }

    public static int findGCD (int a, int b) {
        while (b != 0) {
            if ( a > b ) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }
}
