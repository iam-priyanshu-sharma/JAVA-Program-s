// using loop

public class Main1 {

    public static void main (String[] args) {

        int i, fact = 1, number = 5;

        for (i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println ("Factorial of " + number + " is " + fact);
    }
}
