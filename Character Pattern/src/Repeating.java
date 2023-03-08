public class Repeating {

    public static void main (String[] args) {

        int letter = 65; //ASCII value of capital A is 65

        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print ((char) letter + " ");
            }
            letter++;
            System.out.println ();
        }
    }
}