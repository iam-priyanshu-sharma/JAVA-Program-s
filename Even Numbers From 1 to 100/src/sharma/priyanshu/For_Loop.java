package sharma.priyanshu;

public class For_Loop {

    public static void main (String[] args) {
        int number = 100;
        System.out.println ("List of even numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if ( i % 2 == 0 ) {
                System.out.print (i + " ");
            }
        }
    }
}
