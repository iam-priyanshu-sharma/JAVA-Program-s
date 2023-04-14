package sharma.priyanshu;

import java.util.Scanner;

public class Relational_Operator2 {

    public static void main (String[] args) {
        int num;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        num = scanner.nextInt ();

        if ( num > 0 ) {
            System.out.println ("The number is positive.");
        } else if ( num < 0 ) {
            System.out.println ("The number is negative.");
        } else {
            System.out.println ("The number is zero.");
        }
    }
}
