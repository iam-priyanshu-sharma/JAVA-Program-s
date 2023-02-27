// Java program that checks if the given number is an Armstrong number or not

import java.util.Scanner;

public class Main2 {

    public static void main (String[] args) {

        int num;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the number : ");
        num = scanner.nextInt ();

        if ( isArmstrong (num) ) {
            System.out.println (num + " is an Armstrong number");
        } else {
            System.out.println (num + " isn't an Armstrong number");
        }
    }

    public static boolean isArmstrong (int n) {

        int temp, digits = 0, last, sum = 0;

        temp = n;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow (last, digits));
            temp /= 10;
        }

        if ( n == sum ) {
            return true;
        } else {
            return false;
        }
    }
}
