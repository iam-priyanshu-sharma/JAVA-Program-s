package sharma.priyanshu;

import java.util.Arrays;

public class Ascending_Order_Sort_Method {

    public static void main (String[] args) {
        int[] array = new int[]{90, 23, 5, 109, 12, 22, 67, 34};
        Arrays.sort (array);
        System.out.println ("Elements of array sorted in ascending order: ");

        for (int j : array) {
            System.out.println (j);
        }
    }
}
