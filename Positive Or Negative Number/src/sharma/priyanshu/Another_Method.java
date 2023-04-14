package sharma.priyanshu;

public class Another_Method {

    public static void main (String[] args) {
        System.out.println (positiveOrNegative (111));
        System.out.println (positiveOrNegative (-444));
    }

    public static String positiveOrNegative (int n) {
        String[] results = {"Negative", "Zero", "Positive"};
        return results[1 + (1 + ((n + 1) % n) * ((n - 1) % n)) / n];
    }
}
