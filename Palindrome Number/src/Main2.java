import java.util.Scanner;

// using method and scanner
public class Main2 {

    public static void main (String[] args) {

        String original, reverse = "";
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter a number : ");
        original = scanner.nextLine ();

        int length = original.length ();
        for (int i = length - 1; i >= 0; i--) {
            reverse += original.charAt (i);
        }

        if ( original.equals (reverse) ) {
            System.out.println (original + " is a Palindrome Number!!!");
        } else {
            System.out.println (original + " isn't a Palindrome Number!!!");
        }
    }
}
