package sharma.priyanshu;

import java.util.Scanner;

public class Program3 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int x, num, a, b, cp, ctr;
        System.out.print ("Enter the lower limit: ");
        a = scanner.nextInt ();
        System.out.print ("Enter the upper limit: ");
        b = scanner.nextInt ();

        for (num = a; num <= b; num++) {
            int c, f = 1;
            cp = num;
            ctr = 0;

            for (x = 2; x <= cp; x++) {
                c = 0;
                while ((cp % x) == 0) {
                    cp = cp / x;
                    c++;
                }
                if ( c == 1 ) {
                    f = f * x;
                    ctr++;
                }
            }

            if ( f == num && ctr == 3 ) {
                System.out.print (num + "\t");
            }
        }
    }
}
