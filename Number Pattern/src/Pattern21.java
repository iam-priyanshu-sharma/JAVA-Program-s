import java.util.Scanner;

public class Pattern21 {

    public static void main (String[] args) {

        int i, j, min, n;
        System.out.print ("Enter the value of n: ");
        Scanner scanner = new Scanner (System.in);
        n = scanner.nextInt ();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                min = Math.min (i, j);
                System.out.print (n - min + 1 + " ");
            }

            for (j = n - 1; j >= 1; j--) {
                min = Math.min (i, j);
                System.out.print (n - min + 1 + " ");
            }
            System.out.println ();
        }

        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n; j++) {
                min = Math.min (i, j);
                System.out.print (n - min + 1 + " ");
            }

            for (j = n - 1; j >= 1; j--) {
                min = Math.min (i, j);
                System.out.print (n - min + 1 + " ");
            }
            System.out.println ();
        }
    }
}