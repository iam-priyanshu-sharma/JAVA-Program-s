package sharma.priyanshu;

import java.util.Arrays;
import java.util.Collections;

public class Descending_Order_ReverseOrder_Method2 {

    public static void main (String[] args) {
        String[] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
        Arrays.sort (strarray, Collections.reverseOrder ());
        System.out.println ("Array elements in descending order: " + Arrays.toString (strarray));
    }
}
