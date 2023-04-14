package sharma.priyanshu;

public class Nested_if {

    public static void main (String[] args) {
        System.out.print ("List of odd numbers: ");
        displayOddNumbers (1, 100);
    }

    private static void displayOddNumbers (int number, int end) {
        if ( number > end ) {
            return;
        }

        if ( number % 2 != 0 ) {
            System.out.print (number + " ");
            displayOddNumbers (number + 2, end);
        } else {
            displayOddNumbers (number + 1, end);
        }
    }
}
