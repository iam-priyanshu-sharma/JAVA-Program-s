package sharma.priyanshu;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args) {
        int range;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the value of range: ");
        range = scanner.nextInt ();

        for (int i = 1; i <= range; i++) {
            checkNumber (i);
        }
    }

    static void checkNumber (int number) {
        if ( number % 10 == 7 || number % 7 == 0 ) {
            System.out.println (number + " is an Buzz number");
        }
    }
}
