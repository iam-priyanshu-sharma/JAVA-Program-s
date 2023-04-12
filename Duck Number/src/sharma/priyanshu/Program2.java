package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        int range;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the value of range: ");
        range = scanner.nextInt ();

        for (int i = 1; i <= range; i++) {
            if ( checkNumber (i) ) {
                System.out.println (i + " is a Duck number");
            }
        }
    }

    public static boolean checkNumber (int number) {
        while (number != 0) {
            if ( number % 10 == 0 ) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
