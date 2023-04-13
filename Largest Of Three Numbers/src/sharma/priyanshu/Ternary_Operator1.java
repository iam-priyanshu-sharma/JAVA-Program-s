package sharma.priyanshu;

import java.util.Scanner;

public class Ternary_Operator1 {

    public static void main (String[] args) {
        int a, b, c, largest, temp;
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the first number: ");
        a = sc.nextInt ();
        System.out.print ("Enter the second number: ");
        b = sc.nextInt ();
        System.out.print ("Enter the third number: ");
        c = sc.nextInt ();
        temp = a > b ? a : b;
        largest = c > temp ? c : temp;
        System.out.println ("The largest number is: " + largest);
    }
}
