//Using Sieve of Eratosthenes Approach

package sharma.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2 {

    static int MAX_SIZE = 1000005;
    static ArrayList<Integer> primelist = new ArrayList<> ();

    public static void main (String[] args) {
        findnthPrimeNumber ();
        System.out.println ("7th prime number is " + primelist.get (6));
        System.out.println ("22nd prime number is " + primelist.get (21));
        System.out.println ("10000th prime number is " + primelist.get (9999));
    }

    static void findnthPrimeNumber () {
        boolean[] IsPrime = new boolean[MAX_SIZE];

        Arrays.fill (IsPrime, true);

        for (int p = 2; p * p < MAX_SIZE; p++) {
            if ( IsPrime[p] ) {
                for (int i = p * p; i < MAX_SIZE; i += p) {
                    IsPrime[i] = false;
                }
            }
        }

        for (int p = 2; p < MAX_SIZE; p++) {
            if ( IsPrime[p] ) {
                primelist.add (p);
            }
        }
    }
}
