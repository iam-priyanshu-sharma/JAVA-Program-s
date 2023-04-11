package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int lower, upper, i, n, f, count, k;
        System.out.print ("Enter the lower limit: ");
        lower = scanner.nextInt ();
        System.out.print ("Enter the upper limit: ");
        upper = scanner.nextInt ();
        System.out.println ("Sphenic numbers between the given range are: ");

        for (i = lower; i <= upper; i++) {
            n = i;
            k = 0;
            int[] prime = {0, 0, 0};

            for (f = 2; n != 1; f++) {
                count = 0;
                while (n % f == 0) {
                    count++;
                    n = n / f;
                }
                if ( count == 1 ) {
                    prime[k++] = f;
                }
                if ( k == prime.length ) {
                    break;
                }
            }

            n = prime[0] * prime[1] * prime[2];

            if ( i == n ) {
                System.out.print (i + " ");
            }
        }

        System.out.println ();
    }
}
