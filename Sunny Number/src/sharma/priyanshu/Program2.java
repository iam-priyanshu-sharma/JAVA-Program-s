package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        int lr, ur;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter lower range: ");
        lr = scan.nextInt ();
        System.out.print ("Enter upper range: ");
        ur = scan.nextInt ();
        System.out.println ("The Sunny number from " + lr + " to " + ur + " are: ");

        for (int i = lr; i <= ur; i++) {
            if ( isSunnyNumber (i) ) {
                System.out.print (i + " ");
            }
        }
    }

    public static boolean isSunnyNumber (int number) {
        return Math.sqrt (number + 1) % 1 == 0;
    }
}
