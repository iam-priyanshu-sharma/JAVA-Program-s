package sharma.priyanshu;

import java.util.Scanner;

public class Sqrt_Method {

    public static void main (String[] args) {
        System.out.print ("Enter any number: ");
        Scanner scanner = new Scanner (System.in);
        double number = scanner.nextDouble ();

        if ( checkPerfectSquare (number) ) {
            System.out.println ("Yes, the given number is perfect square.");
        } else {
            System.out.println ("No, the given number is not perfect square.");
        }
    }

    static boolean checkPerfectSquare (double number) {
        double sqrt = Math.sqrt (number);
        return ((sqrt - Math.floor (sqrt)) == 0);
    }
}
