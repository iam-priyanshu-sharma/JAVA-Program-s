package sharma.priyanshu;

import java.util.Scanner;

public class User_Defined2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        int number = scanner.nextInt ();
        System.out.print ("Is the number perfect square? " + checkPerfectSquare (number));
    }

    public static boolean checkPerfectSquare (int number) {
        int x = number % 10;

        if ( x == 2 || x == 3 || x == 7 || x == 8 ) {
            return false;
        }

        for (int i = 0; i <= number / 2 + 1; i++) {
            if ( i * i == number ) {
                return true;
            }
        }

        return false;
    }
}
