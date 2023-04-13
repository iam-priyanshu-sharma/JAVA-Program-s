/*We have used the following formula to find the square root of a number.sqrtn+1=(sqrtn+(num/sqrtn))/2.0*/

package sharma.priyanshu;

import java.util.Scanner;

public class Program1 {

    public static void main (String[] args) {
        System.out.print ("Enter a number: ");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        System.out.println ("The square root of " + n + " is: " + squareRoot (n));
    }

    public static double squareRoot (int num) {
        double t;
        double sqrtroot = (double) num / 2;

        do {
            t = sqrtroot;
            sqrtroot = (t + (num / t)) / 2;
        }
        while ((t - sqrtroot) != 0);
        return sqrtroot;
    }
}
