package sharma.priyanshu;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        int num = scanner.nextInt ();
        isMysteryNo (num);
    }

    static int reverse (int x) {
        String str = Integer.toString (x);
        StringBuilder string = new StringBuilder ();

        for (int i = str.length () - 1; i >= 0; i--) {
            string.append (str.charAt (i));
        }

        return Integer.parseInt (str);
    }

    static void isMysteryNo (int num) {
        for (int i = 1; i <= num / 2; i++) {
            int j = reverse (i);

            if ( i + j == num ) {
                System.out.println (i + " " + j);
                System.out.println (num + " is a mystery number.");
                return;
            }
        }

        System.out.println ("The given number is not a mystery number.");
    }
}
