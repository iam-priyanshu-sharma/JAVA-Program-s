package sharma.priyanshu;

import java.util.Scanner;

public class While_Loop {

    public static void main (String[] args) {
        String s;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a String: ");
        s = scanner.nextLine ();
        System.out.print ("After reverse string is: ");
        int i = s.length ();
        while (i > 0) {
            System.out.print (s.charAt (i - 1));
            i--;
        }
    }
}
