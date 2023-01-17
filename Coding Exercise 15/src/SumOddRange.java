public class SumOddRange {

    public static void main (String[] args) {

        int return_value = sumOdd (1, 10);

        if ( return_value == -1 ) {
            System.out.println ("Invalid Input");
        } else {
            System.out.println ("Sum Of Odd Numbers = " + return_value);
        }
    }

    public static boolean isOdd (int number) {

        if ( number <= 0 ) {
            return false;
        }

        return (number % 2 != 0);
    }

    public static int sumOdd (int start, int end) {

        if ( (start < 0) || (end < 0) || (end < start) ) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {

            if ( isOdd (i) ) {
                sum += i;
            }
        }

        return sum;
    }
}
