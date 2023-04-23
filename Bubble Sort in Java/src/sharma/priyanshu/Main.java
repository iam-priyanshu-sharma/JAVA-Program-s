package sharma.priyanshu;

public class Main {
    public static void main (String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};

        System.out.println ("Array Before Bubble Sort");

        for (int k : arr) {
            System.out.print (k + " ");
        }

        System.out.println ();
        bubbleSort (arr);

        System.out.println ("Array After Bubble Sort: ");

        for (int j : arr) {
            System.out.print (j + " ");
        }
    }

    static void bubbleSort (int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < (n - i); j++) {

                if ( arr[j - 1] > arr[j] ) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
