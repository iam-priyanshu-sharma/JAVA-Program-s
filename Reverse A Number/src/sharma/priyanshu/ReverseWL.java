package sharma.priyanshu;

import java.util.Scanner;

public class ReverseWL {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a Number: ");
        int number = scanner.nextInt ();
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println ("The reverse of the given number is: " + reverse);
    }
}
