package sharma.priyanshu;

public class User_Defined5 {

    public static void main (String[] args) {
        int number = 50;
        System.out.println (number + " is a perfect square number? " + checkPerfectSquare (number));
        number = 361;
        System.out.println (number + " is a perfect square number? " + checkPerfectSquare (number));
    }

    public static boolean checkPerfectSquare (int number) {
        if ( number == 0 || number == 1 ) {
            return true;
        }

        for (int i = 0; i <= number / 2; i++) {
            int x = i * i;

            if ( x == number ) {
                return true;
            } else if ( number < x ) {
                return false;
            }
        }

        return false;
    }
}
