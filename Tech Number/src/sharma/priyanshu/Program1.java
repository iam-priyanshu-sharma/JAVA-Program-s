package sharma.priyanshu;

import java.util.Scanner;

public class Program1 {

    public static void main (String[] args) {
        int n, num, firstHalf, secondHalf, digits = 0, squareOfSum;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number to check: ");
        n = scanner.nextInt ();
        num = n;

        while (num > 0) {
            digits++;
            num = num / 10;
        }

        if ( digits % 2 == 0 ) {
            num = n;
            firstHalf = num % (int) Math.pow (10, (double) digits / 2);
            secondHalf = num / (int) Math.pow (10, (double) digits / 2);
            squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);

            if ( n == squareOfSum ) {
                System.out.println (n + " is a tech number.");
            } else {
                System.out.println (n + " is not a tech number.");
            }
        } else {
            System.out.println (n + " is not a tech number.");
        }
    }
}
