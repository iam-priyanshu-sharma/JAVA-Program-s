package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        int lowerRange, upperRange;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter lower range:");
        lowerRange = scan.nextInt ();
        System.out.print ("Enter upper range:");
        upperRange = scan.nextInt ();
        System.out.println ("The Fascinating number from " + lowerRange + " to " + upperRange + " are: ");

        for (int i = lowerRange; i <= upperRange; i++) {
            if ( isFascinatingNumber (i) ) {
                System.out.print (i + " ");
            }
        }
    }

    public static boolean isFascinatingNumber (int number) {
        int digit;
        String str = String.valueOf (number) + number * 2 + number * 3;
        int[] digitarray = new int[10];

        for (int i = 0; i < str.length (); i++) {
            digit = str.charAt (i) - '0';

            if ( digit == 0 || digitarray[digit] == 0 ) {
                digitarray[digit]++;
            } else {
                return false;
            }
        }

        for (int i = 1; i < digitarray.length; i++) {
            if ( digitarray[i] == 0 )
                return false;
        }

        return true;
    }
}
