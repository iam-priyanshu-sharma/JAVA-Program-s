package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        System.arraycopy (arr1, 0, arr2, 0, arr1.length);

        System.out.println ("Elements of original array: ");

        for (int k : arr1) {
            System.out.print (k + " ");
        }

        System.out.println ();

        System.out.println ("Elements of new array: ");
        for (int j : arr2) {
            System.out.print (j + " ");
        }
    }
}
