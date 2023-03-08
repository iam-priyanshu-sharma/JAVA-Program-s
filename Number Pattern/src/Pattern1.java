public class Pattern1 {

    public static void main (String[] args) {

        int i, j, number, n = 7;

        for (i = 0; i < n; i++) {
            number = 1;
            for (j = 0; j <= i; j++) {
                System.out.print (number + " ");
                number++;
            }
            System.out.println ();
        }
    }
}