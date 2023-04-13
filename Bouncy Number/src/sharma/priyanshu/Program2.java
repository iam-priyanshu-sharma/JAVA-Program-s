package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        int n;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        n = scanner.nextInt ();

        if ( n < 100 ) {
            System.out.println (n + " is not a Bouncy Number.");
            return;
        }

        int t = n;
        boolean isIncreasing = true, isDecreasing = true;
        int prev = t % 10;

        while (t != 0) {
            int d = t % 10;

            if ( d > prev ) {
                isIncreasing = false;
                break;
            }
            prev = d;
            t = t / 10;
        }

        t = n;
        prev = t % 10;

        while (t != 0) {
            int d = t % 10;
            if ( d < prev ) {
                isDecreasing = false;
                break;
            }
            prev = d;
            t = t / 10;
        }

        if ( !isIncreasing && !isDecreasing ) {
            System.out.println (n + " is a bouncy number.");
        } else {
            System.out.println (n + " is not a bouncy number.");
        }
    }
}
