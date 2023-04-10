package sharma.priyanshu;

import java.util.ArrayList;
import java.util.Collections;

public class Program1 {

    public static void main (String[] args) {
        if ( isKeith (19) ) {
            System.out.println ("Yes, the given number is a Keith number.");
        } else {
            System.out.println ("No, the given number is not a Keith number.");
        }

        if ( isKeith (742) ) {
            System.out.println ("Yes, the given number is a Keith number.");
        } else {
            System.out.println ("No, the given number is not a Keith number.");
        }

        if ( isKeith (4578) ) {
            System.out.println ("Yes, the given number is a Keith number.");
        } else {
            System.out.println ("No, the given number is not a Keith number.");
        }
    }

    static boolean isKeith (int x) {
        ArrayList<Integer> terms = new ArrayList<> ();
        int temp = x, n = 0;

        while (temp > 0) {
            terms.add (temp % 10);
            temp = temp / 10;
            n++;
        }

        Collections.reverse (terms);
        int next_term = 0, i = n;

        while (next_term < x) {
            next_term = 0;

            for (int j = 1; j <= n; j++) {
                next_term = next_term + terms.get (i - j);
            }

            terms.add (next_term);
            i++;

        }

        return (next_term == x);
    }
}
