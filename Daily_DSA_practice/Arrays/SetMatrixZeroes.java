package Daily_DSA_practice.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 73. Set Matrix Zeroes
 */
public class SetMatrixZeroes {

      public static void setZeroes(int[][] matrix) {
            Set<Integer> rows = new HashSet<>();
            Set<Integer> cols = new HashSet<>();

            for (int i = 0; i < matrix.length; i++) {
                  for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == 0) {
                              rows.add(i);
                              cols.add(j);
                        }
                  }
            }
            for (int i = 0; i < matrix.length; i++) {
                  for (int j = 0; j < matrix[i].length; j++) {
                        if (rows.contains(i) || cols.contains(j)) {
                              matrix[i][j] = 0;
                        }
                  }
            }
      }

      public static void main(String[] args) {
            // int[][] matrix = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
            int[][] matrix = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
            setZeroes(matrix);
            for (int i = 0; i < matrix.length; i++) {
                  System.out.println(Arrays.toString(matrix[i]));
            }

      }
}