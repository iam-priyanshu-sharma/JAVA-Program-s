package sharma.priyanshu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args) {
        long n1, n2;

        try {
            InputStreamReader in = new InputStreamReader (System.in);
            BufferedReader br = new BufferedReader (in);
            System.out.print ("Enter first 10 digit ISBN number: ");
            n1 = Long.parseLong (br.readLine ());
            System.out.print ("Enter second 10 digit ISBN number: ");
            n2 = Long.parseLong (br.readLine ());

            if ( checkISBNNumber (n1) ) {
                System.out.println (n1 + " is a valid ISBN number");
            } else {
                System.out.println (n1 + " is not a valid ISBN number");
            }

            if ( checkISBNNumber (n2) ) {
                System.out.println (n2 + " is a a valid ISBN number");
            } else {
                System.out.println (n2 + " is not a valid ISBN number");
            }

        } catch (java.lang.Exception e) {
            System.out.println ("Error while reading the data.");
        }
    }

    static boolean checkISBNNumber (long number) {
        int sum = 0;
        int i, t, intNumber, dNumber;
        String strNumber;
        strNumber = String.valueOf (number);

        if ( strNumber.length () != 10 ) {
            return false;
        }

        for (i = 0; i < strNumber.length (); i++) {
            intNumber = Integer.parseInt (strNumber.substring (i, i + 1));
            dNumber = i + 1;
            t = dNumber * intNumber;
            sum = sum + t;
        }

        return (sum % 11) == 0;
    }
}
