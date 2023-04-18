package sharma.priyanshu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection {

    public static void main (String[] args) {
        Integer[] a = {1, 2, 5, 6, 3, 2};
        Integer[] b = {44, 66, 99, 77, 33, 22, 55};
        System.out.println ("Second Smallest: " + getSecondSmallest (a, 6));
        System.out.println ("Second Smallest: " + getSecondSmallest (b, 7));
    }

    public static int getSecondSmallest (Integer[] a, int total) {
        List<Integer> list = Arrays.asList (a);
        Collections.sort (list);
        return list.get (1);
    }
}
