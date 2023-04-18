package sharma.priyanshu;

public class Separate_Index {

    public static void main (String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 40, 50, 50};
        int length = arr.length;
        length = removeDuplicateElements (arr, length);

        for (int i = 0; i < length; i++)
            System.out.print (arr[i] + " ");
    }

    public static int removeDuplicateElements (int[] arr, int n) {
        if ( n == 0 || n == 1 ) {
            return n;
        }
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if ( arr[i] != arr[i + 1] ) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[n - 1];
        return j;
    }
}
