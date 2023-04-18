package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        int[] a = {1, 2, 5, 6, 3, 2};
        System.out.println ("Odd Numbers:");

        for (int j : a) {
            if ( j % 2 != 0 ) {
                System.out.println (j);
            }
        }
        System.out.println ("Even Numbers:");

        for (int j : a) {
            if ( j % 2 == 0 ) {
                System.out.println (j);
            }
        }
    }
}
