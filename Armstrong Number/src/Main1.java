// Java program prints all the Armstrong numbers up to the specified limit

import java.util.Scanner;

public class Main1 {

    public static void main (String[] args) {

        int num;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the limit : ");
        num = scanner.nextInt ();
        System.out.println ("Armstrong number upto " + num + " are :");

        for (int i = 0; i <= num; i++) {
            if ( isArmstrong (i) ) {
                System.out.print (i + ",");
            }
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
