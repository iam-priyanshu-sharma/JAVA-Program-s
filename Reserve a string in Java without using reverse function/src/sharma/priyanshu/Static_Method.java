package sharma.priyanshu;

import java.util.Scanner;

public class Static_Method {

    public static void main (String[] arg) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter a string: ");
        String s = sc.nextLine ();
        System.out.println ("Reverse String is: " + Static_Method.reverse (s));
    }

    public static String reverse (String str) {
        StringBuilder rev = new StringBuilder ();

        for (int i = str.length (); i > 0; --i) {
            rev.append (str.charAt (i - 1));
        }

        return rev.toString ();
    }
}