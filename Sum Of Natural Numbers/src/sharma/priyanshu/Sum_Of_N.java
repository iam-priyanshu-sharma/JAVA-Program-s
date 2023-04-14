package sharma.priyanshu;

import java.util.Scanner;

public class Sum_Of_N {

    public static void main (String[] args) {
        int num, i, sum = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Sum from: ");
        i = scanner.nextInt ();
        System.out.print ("Sum up to: ");
        num = scanner.nextInt ();

        while (i <= num) {
            sum = sum + i;
            i++;
        }

        System.out.print ("Sum of Natural Numbers = " + sum);
    }
}
