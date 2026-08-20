package Daily_DSA_practice.Arrays;

import java.util.*;

/**
 * 48. Rotate Image
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * 
 * 7 4 1
 * 8 5 2
 * 9 6 3
 */
public class RotateImage {

      public static void Rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                  int temp = matrix[i][i];
                  matrix[i][i] = matrix[n - 1][i];
                  matrix[n - 1][i] = matrix[n - 1][n - 1];
                  matrix[n - 1][n - 1] = matrix[i][n - 1];
                  matrix[i][n - 1] = temp;
            }
      }

      public static void main(String[] args) {
            int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            Rotate(matrix);
            for (int i = 0; i < matrix.length; i++) {
                  System.out.println(Arrays.toString(matrix[i]));
            }

      }

}