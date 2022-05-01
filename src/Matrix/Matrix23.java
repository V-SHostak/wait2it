package Matrix;

public class Matrix23 {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 6, 2, 7, 1},
                {4, 6, 2, 7, 1},
                {4, -66, 2, 7, 1},
                {4, 6, -2, 7, 1},
                {4, 6, 2, -77, 1},
        };
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            System.out.println(min);
        }
    }
}
