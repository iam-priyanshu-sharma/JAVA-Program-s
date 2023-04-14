package sharma.priyanshu;

import java.util.Scanner;

public class Shift_Operator {

    public static void main (String[] args) {
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter a number you want to check: ");
        num = sc.nextInt ();
        String[] result = {"Positive", "Negative"};
        System.out.println (result[(num >> 31) & 1]);
    }
}
