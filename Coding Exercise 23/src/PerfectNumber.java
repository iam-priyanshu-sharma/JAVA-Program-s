public class PerfectNumber {

    public static void main(String[] args) {

        boolean return_value = isPerfectNumber(6);

        System.out.println(return_value);
    }

    public static boolean isPerfectNumber(int number) {

        int sumOfProperPositiveDivisors = 0;
        int increment = (number % 2 == 0) ? 1 : 2;

        for (int i = 1; i <= number / 2; i += increment) {

            if (number % i == 0) {
                sumOfProperPositiveDivisors += i;
            }
        }

        return (sumOfProperPositiveDivisors == number && number > 1);
    }
}
