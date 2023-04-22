package sharma.priyanshu;

import java.util.Scanner;

public class Example2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a string: ");
        String str = scanner.nextLine ();
        System.out.println ("Reverse of a String is: " + reverseString (str));
        scanner.close ();
    }

    static String reverseString (String s) {
        StringBuilder r = new StringBuilder ();

        for (int i = s.length (); i > 0; --i) {
            r.append (s.charAt (i - 1));
        }

        return r.toString ();
    }
}