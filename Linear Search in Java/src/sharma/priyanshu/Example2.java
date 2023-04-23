package sharma.priyanshu;

import java.util.Scanner;

public class Example2 {

    public static void main (String[] args) {
        int c;
        int n;
        int search;
        int[] array;

        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of elements: ");
        n = scanner.nextInt ();
        array = new int[n];

        System.out.println ("Enter those " + n + " elements: ");

        for (c = 0; c < n; c++) {
            array[c] = scanner.nextInt ();
        }

        System.out.print ("Enter value to find: ");
        search = scanner.nextInt ();

        for (c = 0; c < n; c++) {
            if ( array[c] == search ) {
                System.out.println (search + " is present at location " + (c + 1) + ".");
                break;
            }
        }

        if ( c == n ) {
            System.out.println (search + " isn't present scanner array.");
        }
    }
}
