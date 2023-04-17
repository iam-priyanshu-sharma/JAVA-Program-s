package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = 3;
        System.out.println ("Original array: ");

        for (int k : arr) {
            System.out.print (k + " ");
        }

        for (int i = 0; i < n; i++) {
            int j, last;
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

        System.out.println ();
        System.out.println ("Array after right rotation: ");

        for (int j : arr) {
            System.out.print (j + " ");
        }
    }
}
