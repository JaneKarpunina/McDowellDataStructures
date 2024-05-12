package data_structures.arrays_strings;

import org.junit.jupiter.api.Test;

class ZeroMatrix18Test {

    @Test
    void zeroMatrix() {

        int[][] matrix = new int[4][5];

        System.out.println("size: " + matrix.length);

        for (int i = 0; i < matrix.length; i++) {


            for (int j = 0; j < matrix[0].length; j++) {

                matrix[i][j] = (int)(Math.random() * 7);
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("-----------");
        ZeroMatrix18 zeroMatrix18 = new ZeroMatrix18();
        zeroMatrix18.zeroMatrix(matrix);

        for (int[] ints : matrix) {


            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + ints[j]);
            }

            System.out.println();
        }

    }
}