package sharma.priyanshu;

import java.util.Scanner;

public class Ternary_Operator2 {

    public static void main (String[] args) {
        int a, b, c, smallest;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the first number: ");
        a = scanner.nextInt ();
        System.out.print ("Enter the second number: ");
        b = scanner.nextInt ();
        System.out.print ("Enter the third number: ");
        c = scanner.nextInt ();
        smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        System.out.println ("The smallest number is: " + smallest);
    }
}
