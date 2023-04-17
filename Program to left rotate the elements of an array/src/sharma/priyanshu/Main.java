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
            int j, first;
            first = arr[0];

            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[j] = first;
        }

        System.out.println ();
        System.out.println ("Array after left rotation: ");

        for (int j : arr) {
            System.out.print (j + " ");
        }
    }
}
