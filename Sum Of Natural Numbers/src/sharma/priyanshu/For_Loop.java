package sharma.priyanshu;

public class For_Loop {

    public static void main (String[] args) {
        int i, num = 10, sum = 0;

        for (i = 1; i <= num; ++i) {
            sum = sum + i;
        }

        System.out.print ("Sum of First 10 Natural Numbers is = " + sum);
    }
}
