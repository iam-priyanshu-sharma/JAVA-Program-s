package sharma.priyanshu;

import java.util.Scanner;

public class Integer_Signum {

    public static void main (String[] args) {
        int num, result;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number you want to check: ");
        num = scanner.nextInt ();
        result = Integer.signum (num);
        System.out.print (result);
    }
}
