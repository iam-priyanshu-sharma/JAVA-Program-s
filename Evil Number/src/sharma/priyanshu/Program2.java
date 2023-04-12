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
                System.out.println (i + " is an Evil number");
            }
        }
    }

    public static boolean checkNumber (int n) {
        long binaryNumber = convertToBinary (n);
        int count = 0;

        while (binaryNumber != 0) {
            if ( binaryNumber % 10 == 1 ) {
                count++;
            }
            binaryNumber = binaryNumber / 10;
        }

        return count % 2 == 0;
    }

    private static long convertToBinary (int number) {
        long binaryNumber = 0;
        int rem;
        int j = 1;

        while (number != 0) {
            rem = number % 2;
            binaryNumber += rem * j;
            number = number / 2;
            j = j * 10;
        }

        return binaryNumber;
    }
}
