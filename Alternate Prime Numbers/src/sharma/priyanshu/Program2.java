package sharma.priyanshu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        int n;
        int status = 1;
        int num = 3;
        List<Integer> primelist = new ArrayList<> ();
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the value of n: ");
        n = scanner.nextInt ();

        if ( n >= 1 ) {
            System.out.println ("First " + n + " prime numbers are: ");
            System.out.println (2);
            primelist.add (2);
        }

        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt (num); j++) {
                if ( num % j == 0 ) {
                    status = 0;
                    break;
                }
            }

            if ( status != 0 ) {
                System.out.println (num);
                primelist.add (num);
                i++;
            }

            status = 1;
            num++;
        }

        System.out.println ("Alternate prime numbers are:");

        for (int k = 0; k < primelist.size (); k++) {
            if ( (k % 2) == 0 ) {
                System.out.println (primelist.get (k));
            }
        }
    }
}
