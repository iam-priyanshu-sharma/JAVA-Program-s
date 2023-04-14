package sharma.priyanshu;

import java.util.ArrayList;

public class Array_List {

    public static void main (String[] args) {
        System.out.println (positiveOrNegative (42));
        System.out.println (positiveOrNegative (0));
        System.out.println (positiveOrNegative (-190));
    }

    public static String positiveOrNegative (int n) {
        ArrayList<String> result = new ArrayList<> ();
        result.add ("Zero");

        for (int i = 0; i < n; i++) {
            result.add ("Positive");
        }

        String res;

        try {
            res = result.get (n);
        } catch (Exception e) {
            res = "Negative";
        }

        return res;
    }

}
