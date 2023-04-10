package sharma.priyanshu;

import java.util.Scanner;

public class Program1 {

    public static void main (String[] args) {
        int sum = 0, n;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the number to check: ");
        n = scanner.nextInt ();
        int square = n * n;

        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if ( n == sum ) {
            System.out.println (n + " is a Neon Number.");
        } else {
            System.out.println (n + " is not a Neon Number.");
        }
    }
}
