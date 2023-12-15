public class P4 {

    public static boolean SearchSorted(int matrix[][], int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col > 0) {
            if (matrix[row][col] == target) {
                System.out.println("Target found at: (" + row + "," + col + ")");
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Target Not found");
        return false;
    }

    public static void printmatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        printmatrix(matrix);
        SearchSorted(matrix, 21);

    }
}
