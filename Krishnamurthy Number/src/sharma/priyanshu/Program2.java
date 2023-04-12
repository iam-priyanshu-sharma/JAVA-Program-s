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

    static int fact (int number) {
        int f = 1;

        while (number != 0) {
            f = f * number;
            number--;
        }

        return f;
    }

    static void checkNumber (int number) {
        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            sum = sum + fact (tempNumber % 10);
            tempNumber = tempNumber / 10;
        }

        if ( sum == number ) {
            System.out.println (number + " is a krishnamurthy number");
        }
    }
}
