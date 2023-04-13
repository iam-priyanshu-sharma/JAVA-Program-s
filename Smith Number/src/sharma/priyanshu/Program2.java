package sharma.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main (String[] args) {
        for (int n = 1; n < 10000; n++) {
            List<Integer> factors = findPrimeFactors (n);

            if ( factors.size () > 1 ) {
                int sum = sumOfDigits (n);

                for (int f : factors) {
                    sum = sum - sumOfDigits (f);
                }
                if ( sum == 0 ) {
                    System.out.println (n);
                }
            }
        }
    }

    static List<Integer> findPrimeFactors (int n) {
        List<Integer> result = new ArrayList<> ();
        for (int i = 2; n % i == 0; n = n / i) {
            result.add (i);
        }

        for (int i = 3; i * i <= n; i = i + 2) {
            while (n % i == 0) {
                result.add (i);
                n = n / i;
            }
        }

        if ( n != 1 ) {
            result.add (n);
        }

        return result;
    }

    static int sumOfDigits (int n) {
        int sum = 0;

        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }

        return sum;
    }
}
