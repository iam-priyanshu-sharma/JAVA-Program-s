package sharma.priyanshu;

import java.util.Scanner;

public class Math_Signum {

    public static void main (String[] args) {
        double num, result;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number you want to check: ");
        num = scanner.nextDouble ();
        result = Math.signum (num);
        System.out.print (result);
    }
}
