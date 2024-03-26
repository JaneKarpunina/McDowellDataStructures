package data_structures.arrays_strings;

public class RotateMatrix17 {

    public void rotateMatrix(int[][] matrix) {

        int n = matrix.length;
        int value;
        int value2;

        int numberOfLayers = n/2;

        for (int i = 0; i < numberOfLayers; i++ ) {

            int last = n - i - 1;

            for (int j = i; j < n - i - 1; j++) {

                value = matrix[j][last];

                matrix[j][last] = matrix[i][j];

                value2 = matrix[last][n - j - 1];

                matrix[last][n - j - 1] = value;
                value = matrix[n - j - 1][i];

                matrix[n - j - 1][i] = value2;
                matrix[i][j] = value;
            }
        }

    }
}
