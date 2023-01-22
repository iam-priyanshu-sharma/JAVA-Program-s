public class GreatestCommonDivisor {

    public static void main(String[] args) {

        int return_value = getGreatestCommonDivisor(12, 30);

        if (return_value == -1) {
            System.out.println("Invalid Value!");
        } else {
            System.out.println("GCD of given numbers = " + return_value);
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        while (first != second) {

            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        return second;
    }
}
