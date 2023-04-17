package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 0;

        for (int j : arr) {
            sum = sum + j;
        }

        System.out.println ("Sum of all the elements of an array: " + sum);
    }
}
