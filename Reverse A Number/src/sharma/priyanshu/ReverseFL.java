package sharma.priyanshu;

import java.util.Scanner;

public class ReverseFL {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a Number: ");
        int number = scanner.nextInt ();
        int reverse = 0;

        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println ("The reverse of the given number is: " + reverse);
    }
}
