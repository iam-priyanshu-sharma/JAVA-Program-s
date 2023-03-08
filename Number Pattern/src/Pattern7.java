import java.util.Scanner;

public class Pattern7 {

    public static void main (String[] args) {

        int i, j, n;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the no. of rows you want to print: ");
        n = scanner.nextInt ();

        for (i = 1; i <= n; i++) {
            for (j = i; j >= 1; j--) {
                System.out.print (j + " ");
            }
            System.out.println ();
        }
    }
}