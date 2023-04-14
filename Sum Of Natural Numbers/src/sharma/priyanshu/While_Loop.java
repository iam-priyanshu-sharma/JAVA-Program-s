package sharma.priyanshu;

public class While_Loop {

    public static void main (String[] args) {
        int num = 100, i = 1, sum = 0;

        while (i <= num) {
            sum = sum + i;
            i++;
        }

        System.out.print ("Sum of First 100 Natural Numbers is = " + sum);
    }
}
