package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        int[] arr = new int[]{25, 11, 7, 75, 56};
        int max = arr[0];

        for (int j : arr) {
            if ( j > max )
                max = j;
        }
        
        System.out.println ("Largest element present in given array: " + max);
    }
}
