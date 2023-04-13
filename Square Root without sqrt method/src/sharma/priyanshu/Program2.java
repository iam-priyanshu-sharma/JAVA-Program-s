/*
In the following example, we have used the following procedure to find the square root.

We have initialized an iterator variable i=1.
Check the number that we have entered is a perfect square or not. If the square of i is equal to n, i will be the square root value of n.
Otherwise, find the lowest value of i. Remember that the square of i must be greater than n. The square root of a number lies between i-1 and i. After performing the steps, we use the binary search algorithm to find the square root of a number up to n decimal places.
Increment the variable i by 1.


Binary Search Algorithm

Find the midvalue of i-1 and i.
Find the square of midvalue and compare it with n.
If midvalue * midvalue = n, the midvalue is the square root of the given number. Compare the square of midvalue with n (up to n decimal places) if the difference is minor, the midvalue will be the square root of the number.
If midvalue * midvalue > n, the square root belongs to the first half.
If midvalue * midvalue < n, the square root belongs to the second half.
*/

package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        double number, sqrt;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        number = scanner.nextDouble ();
        sqrt = squareRoot (number);
        System.out.println ("The square root of " + number + " is " + sqrt);
    }

    private static double squareRoot (double number) {
        int i = 1;
        while (true) {

            if ( i * i == number ) {
                return i;
            } else if ( i * i > number ) {
                return decimalSqrt (number, i - 1, i);
            }
            i++;
        }
    }

    private static double decimalSqrt (double number, double i, double j) {
        double midvalue = (i + j) / 2;
        double square = midvalue * midvalue;

        if ( square == number || Math.abs (square - number) < 0.0000001 ) {
            return midvalue;
        } else if ( square > number ) {
            return decimalSqrt (number, i, midvalue);
        } else {
            return decimalSqrt (number, midvalue, j);
        }
    }
}
