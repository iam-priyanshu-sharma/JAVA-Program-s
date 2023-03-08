import java.util.Scanner;

public class Diamond {

    public static void main (String[] args) {

        int row, i, j, space;
        System.out.print ("Enter the no. of rows you want to print: ");
        Scanner scanner = new Scanner (System.in);
        row = scanner.nextInt ();
        space = row - 1;

        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print (" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print (" ");
            }
            space++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
}