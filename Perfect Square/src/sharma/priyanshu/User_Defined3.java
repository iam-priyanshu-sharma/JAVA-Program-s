package sharma.priyanshu;

import java.util.Scanner;

public class User_Defined3 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        int number = scanner.nextInt ();
        double x = Math.sqrt (number);

        if ( x == (int) x ) {
            System.out.println (number + " is a perfect square.");
        } else {
            System.out.println (number + " is not a perfect square.");
        }
    }
}
