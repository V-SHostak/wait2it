package Matrix;

import java.util.Arrays;

public class Matrix1 {
    public static void main(String[] args) {

        int n = 4;
        int m = 6;

        int [][] matrix = new int [n][m];

        for (int i=0; i<n; i++){
            for (int j = 0; j<m; j++){
                matrix[i][j] = i*10;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
