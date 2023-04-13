package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a four-digit number:");
        int num = scanner.nextInt ();

        if ( (num > 999) && (num < 10000) ) {
            int n = num;
            num = num * 2;
            num = num / 10;
            num = num % 100;

            if ( (num / 10) == (num % 10) ) {
                System.out.println (n + " is a strontio number.");
            } else {
                System.out.println (n + " is not a strontio number");
            }
        } else {
            System.out.println ("Please enter a four-digit number.");
        }
    }
}
