package sharma.priyanshu;

import java.util.Scanner;

public class Reverse_Positive_Negative {

    public static void main (String[] args) {
        System.out.print ("Enter the number that you want to reverse: ");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int reverse_number = reverseNumber (n);
        System.out.println ("The reverse of the given number is: " + reverse_number);
    }

    public static int reverseNumber (int number) {
        boolean isNoNegative = number < 0;
        if ( isNoNegative ) {
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit;
        while (number >= 1) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return isNoNegative ? reverse * -1 : reverse;
    }
}
