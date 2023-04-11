package sharma.priyanshu;

import java.util.Scanner;

public class Program1 {

    public static void main (String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter first number: ");
        n1 = scanner.nextInt ();
        System.out.print ("Enter second number: ");
        n2 = scanner.nextInt ();

        if ( checkNumber (n1) ) {
            System.out.println (n1 + " is a Buzz number");
        } else {
            System.out.println (n1 + " is not a Buzz number");
        }

        if ( checkNumber (n2) ) {
            System.out.println (n2 + " is a Buzz number");
        } else {
            System.out.println (n2 + " is not a Buzz number");
        }
    }

    static boolean checkNumber (int number) {

        return number % 10 == 7 || number % 7 == 0;
    }
}
