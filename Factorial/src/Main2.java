// using recursion

import java.util.Scanner;

public class Main2 {

    public static void main (String[] args) {

        int fact, number;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number : ");
        number = scanner.nextInt ();
        fact = factorial (number);
        System.out.println ("Factorial of " + number + " is " + fact);
    }

    public static int factorial (int n) {
        if ( n == 0 ) {
            return 1;
        } else {
            return (n * factorial (n - 1));
        }
    }
}
