package sharma.priyanshu;

public class Function2 {

    public static void main (String[] args) {
        int n = 5;
        System.out.print ("Sum of Natural Numbers is: " + sumOfNaturalNumbers (n));
    }

    static int sumOfNaturalNumbers (int n) {
        return n * (n + 1) / 2;
    }
}
