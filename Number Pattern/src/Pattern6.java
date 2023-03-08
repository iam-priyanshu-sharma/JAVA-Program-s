import java.util.Scanner;

public class Pattern6 {

    public static void main (String[] args) {

        int i, j, rows;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the no. of rows youy want to print: ");
        rows = scanner.nextInt ();

        for (i = rows; i >= 1; i--) {
            for (j = rows; j >= i; j--) {
                System.out.print (j + " ");
            }
            System.out.println ();
        }
    }
}