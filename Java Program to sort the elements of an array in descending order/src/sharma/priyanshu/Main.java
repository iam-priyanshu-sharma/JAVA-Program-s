package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        int[] arr = new int[]{5, 2, 8, 7, 1};
        int temp;
        System.out.println ("Elements of original array: ");

        for (int k : arr) {
            System.out.print (k + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[i] < arr[j] ) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println ();
        System.out.println ("Elements of array sorted in descending order: ");

        for (int j : arr) {
            System.out.print (j + " ");
        }
    }
}
