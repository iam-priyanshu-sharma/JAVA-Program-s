package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the number of digits the series must have: ");
        int numlen = scanner.nextInt ();
        if ( numlen < 2 ) {
            System.out.println ("The number must have at least 2 digits.");
        } else {
            long lowBound = (long) Math.pow (10, numlen - 1);
            long upperBound = (long) Math.pow (10, numlen);

            for (long l = lowBound; l < upperBound; l++) {
                if ( isKeith (String.valueOf (l)) ) {
                    System.out.print (l + ", ");
                }
            }
        }
    }

    public static boolean isKeith (String input) {
        int numlen = input.length ();
        long[] series = new long[numlen];

        for (int i = 0; i < numlen; i++) {
            series[i] = Long.parseLong (input.substring (i, i + 1));
        }

        long next_term = 0;
        long number = Long.parseLong (input);

        while (next_term < number) {
            next_term = 0;

            for (int i = 0; i < numlen; i++) {
                next_term = next_term + series[i];

                if ( i < numlen - 1 ) {
                    series[i] = series[i + 1];
                } else {
                    series[i] = next_term;
                }
            }

            if ( next_term == number ) {
                return true;
            }
        }

        return false;
    }
}
