package sharma.priyanshu;

import java.util.Scanner;

public class Program1 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the number: ");
        int num = scanner.nextInt ();
        int n = num;
        num = (num * 2 % 1000) / 10;

        if ( num % 10 == num / 10 ) {
            System.out.println (n + " is a strontio number.");
        } else {
            System.out.println (n + " is not a strontio number.");
        }
    }
}
