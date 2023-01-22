public class FirstLastDigitSum {

    public static void main(String[] args) {

        int return_value = sumFirstAndLastDigit(5);

        if (return_value == -1) {
            System.out.println("Invalid Value!");
        } else {
            System.out.println("Sum of First and Last digit = " + return_value);
        }
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int last_digit = number % 10;

        while (number > 9) {
            number /= 10;
        }

        return last_digit + number;
    }
}
