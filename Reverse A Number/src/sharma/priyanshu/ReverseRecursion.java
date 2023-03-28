package sharma.priyanshu;

import java.util.Scanner;

public class ReverseRecursion {

    public static void main (String[] args) {
        System.out.print ("Enter the number that you want to reverse: ");
        Scanner scanner = new Scanner (System.in);
        int num = scanner.nextInt ();
        System.out.print ("The reverse of the given number is: ");
        reverseNumber (num);
    }

    public static void reverseNumber (int number) {
        if ( number < 10 ) {
            System.out.println (number);
        } else {
            System.out.print (number % 10);
            reverseNumber (number / 10);
        }
    }
}
