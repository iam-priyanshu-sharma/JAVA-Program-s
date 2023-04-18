package sharma.priyanshu;

import java.util.Arrays;

public class Sub_Array {

    public static void main (String[] args) {
        int[] a = {12, 90, 34, 2, 45, 3, 22, 18, 5, 78};
        Arrays.sort (a, 2, 7);

        for (int j : a) {
            System.out.println (j);
        }
    }
}
