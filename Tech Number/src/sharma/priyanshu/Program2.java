package sharma.priyanshu;

public class Program2 {

    public static void main (String[] args) {
        System.out.println ("Tech numbers between 1 to 1000000 are: ");

        for (int i = 1; i <= 1000000; i++) {
            int p1 = i % 100;
            int p2 = i / 100;
            int sum = p1 + p2;

            if ( i == (sum * sum) ) {
                System.out.println (i);
            }
        }
    }
}
