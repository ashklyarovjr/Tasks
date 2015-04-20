package com.epam.tal5.shkliarov.lab1;

/**
 * Created by Anton_Shkliarov on 4/20/2015.
 */
public class MatrixMultiply {
    public static int[][] matrixMultiply(int[][] first, int[][] second) {

        int rows1 = first.length;
        int col1 = first[0].length;
        int rows2 = second.length;
        int col2 = second[0].length;
        int[][] result = new int[0][];
        if (!matrixCheck(first, second)) {
            result = new int[rows1][col2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int t = 0; t < col1; t++) {
                        result[i][j] += first[i][t] * second[t][j];
                    }
                }
            }

        }
        return result;
    }

    public static boolean matrixCheck(int[][] first, int[][] second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException();
        }
        if (first[0].length != second.length) {
            throw new IllegalArgumentException();
        }
        if (!nullRowCheck(first) || !nullRowCheck(second)) {
            throw new IllegalArgumentException();
        }
        if (!rowsLengthEqualityCheck(first) || !rowsLengthEqualityCheck(second)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public static boolean nullRowCheck(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean rowsLengthEqualityCheck(int[][] matrix) {
        int row = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != row) {
                return false;
            }
        }
        return true;
    }


}
