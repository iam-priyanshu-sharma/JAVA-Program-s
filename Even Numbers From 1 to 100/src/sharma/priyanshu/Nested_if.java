package sharma.priyanshu;

public class Nested_if {

    public static void main (String[] args) {
        System.out.println ("List of even numbers: ");
        displayEvenNumbers (1, 100);
    }

    private static void displayEvenNumbers (int number, int end) {
        if ( number > end ) {
            return;
        }

        if ( number % 2 == 0 ) {
            System.out.print (number + " ");
            displayEvenNumbers (number + 2, end);
        } else {
            displayEvenNumbers (number + 1, end);
        }
    }
}
