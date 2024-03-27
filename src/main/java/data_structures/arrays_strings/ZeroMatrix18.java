package data_structures.arrays_strings;

import java.util.Arrays;

public class ZeroMatrix18 {

    void zeroMatrix(int[][] matrix) {

        int zeroColumn = 1;  // indicator for the first column

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {

                    if (j == 0) {
                        zeroColumn = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                    matrix[i][0] = 0;
                }

            }
        }
        //starting from the second row to not make every column zero
        for (int i = 1; i < matrix.length; i++) {

            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        //starting from the second column because for the first column there is a flag
        for (int j = 1; j < matrix[0].length; j++) {

            if (matrix[0][j] == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;

                }
            }
        }

        if (matrix[0][0] == 0) {
            Arrays.fill(matrix[0], 0);
        }

        if (zeroColumn == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;

            }
        }

    }
}
