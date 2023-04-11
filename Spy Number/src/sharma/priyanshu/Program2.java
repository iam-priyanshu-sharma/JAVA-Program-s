package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        int lowerRange, upperRange;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the lower range: ");
        lowerRange = scanner.nextInt ();
        System.out.print ("Enter upper range: ");
        upperRange = scanner.nextInt ();
        System.out.println ("The Spy numbers between " + lowerRange + " to " + upperRange + " are: ");

        for (int i = lowerRange; i <= upperRange; i++) {
            if ( isSpyNumber (i) ) {
                System.out.print (i + " ");
            }
        }
    }

    private static boolean isSpyNumber (int number) {
        int lastDigit;
        int sum = 0;
        int product = 1;

        while (number != 0) {
            lastDigit = number % 10;
            sum = sum + lastDigit;
            product = product * lastDigit;
            number = number / 10;
        }

        return sum == product;
    }
}
