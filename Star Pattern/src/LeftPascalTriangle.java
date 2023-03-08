import java.util.Scanner;

public class LeftPascalTriangle {

    public static void main (String[] args) {

        int i, j, k, rows;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the no. of rows you want to print: ");
        rows = scanner.nextInt ();

        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print (" ");
            }

            for (k = 1; k <= i; k++) {
                System.out.print ("*");
            }
            System.out.println ();
        }

        for (i = rows; i >= 1; i--) {
            for (j = i; j <= rows; j++) {
                System.out.print (" ");
            }

            for (k = 1; k < i; k++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
}
