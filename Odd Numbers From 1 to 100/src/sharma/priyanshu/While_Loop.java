package sharma.priyanshu;

import java.util.Scanner;

public class While_Loop {

    public static void main (String[] args) {
        int number, i;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the limit: ");
        number = scanner.nextInt ();
        i = 1;
        System.out.print ("Lit of odd numbers: ");

        while (i <= number) {
            System.out.print (i + " ");
            i = i + 2;
        }
    }
}
