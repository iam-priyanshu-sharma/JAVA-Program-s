public class RightTriangle {

    public static void main (String[] args) {

        int alphabet = 65; //ASCII value of capital A is 65

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print ((char) (alphabet + j) + " ");
            }
            System.out.println ();
        }
    }
}