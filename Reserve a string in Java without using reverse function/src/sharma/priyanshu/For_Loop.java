package sharma.priyanshu;

import java.util.Scanner;

public class For_Loop {

    public static void main (String[] args) {
        String s;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a String: ");
        s = scanner.nextLine ();
        System.out.print ("After reverse string is: ");
        for (int i = s.length (); i > 0; --i) {
            System.out.print (s.charAt (i - 1));
        }
    }
}
