package data_structures.arrays_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrix17Test {

    @Test
    void rotateMatrix() {

        int[][] matrix = new int[6][6];

        System.out.println("size: " + matrix.length);

        for (int i = 0; i < matrix.length; i++) {


            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = (int)(Math.random() * 10);
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("-----------");
        RotateMatrix17 rotateMatrix17 = new RotateMatrix17();
        rotateMatrix17.rotateMatrix(matrix);

        for (int[] ints : matrix) {


            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + ints[j]);
            }

            System.out.println();
        }


    }
}