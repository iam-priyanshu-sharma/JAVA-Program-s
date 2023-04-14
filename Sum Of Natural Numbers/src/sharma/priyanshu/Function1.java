package sharma.priyanshu;

public class Function1 {

    public static void main (String[] args) {
        int n = 50;
        System.out.print ("Sum of Natural Numbers is: " + naturalNumberSum (n));
    }

    static int naturalNumberSum (int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
