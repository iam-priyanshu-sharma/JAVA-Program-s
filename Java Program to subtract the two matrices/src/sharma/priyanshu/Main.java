package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        int rows, cols;
        int[][] a = {
                {4, 5, 6},
                {3, 4, 1},
                {1, 2, 3}
        };
        int[][] b = {
                {2, 0, 3},
                {2, 3, 1},
                {1, 1, 1}
        };
        rows = a.length;
        cols = a[0].length;
        int[][] diff = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                diff[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println ("Subtraction of two matrices: ");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print (diff[i][j] + " ");
            }

            System.out.println ();
        }
    }
}
