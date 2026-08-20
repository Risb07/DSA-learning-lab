package Daily_DSA_practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix {
      /*
       * traverseing any matrix elements take O(n2)
       */
      public static void print(int[][] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                        System.out.print(arr[i][j] + " ");
                  }
                  System.out.println();
            }
      }

      /* Maximum row sum */
      public static void maxRowSum(int[][] arr) {
            int max = arr[0][0];
            for (int i = 0; i < arr.length; i++) {
                  int sum = 0;
                  for (int j = 0; j < arr[i].length; j++) {
                        sum += arr[i][j];
                  }
                  max = Math.max(max, sum);
            }
            System.out.println(max);
      }

      /* Maximum column sum */
      public static void maxColSum(int[][] arr) {
            int n = arr.length;
            int max = arr[0][0];
            for (int i = 0; i < n; i++) {
                  int sum = 0;
                  for (int j = 0; j < n; j++) {
                        sum += arr[j][i];
                  }
                  max = Math.max(max, sum);
            }
            System.out.println(max);
      }

      /** print diagonals of n x n matrix O(n) */
      public static void diagonals(int[][] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                  System.out.println(arr[i][i]);
            }
      }

      /** print diagonals sum of n x n matrix O(n) */
      public static void diagonalSum(int[][] arr) {
            int n = arr.length;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                  sum += arr[i][i];
            }
            System.out.println(sum);
      }
      /*
       * 2D vectors in c++ - they can resize at runtime
       * ArrayList in Java - they can resize at runtime
       * vector in c++ = ArrayList in java
       */

      public static void printDynamic(List<List<Integer>> list) {
            // System.out.println(list);
            for (int i = 0; i < list.size(); i++) {
                  System.out.println(list.get(i));
            }
      }

      public static void main(String[] args) {

            int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

            // print(arr);
            // maxRowSum(arr);
            // maxColSum(arr);
            // diagonals(arr);
            // diagonalSum(arr);

            /* Dynamic Matrix */
            List<List<Integer>> list = new ArrayList<>();

            List<Integer> row1 = new ArrayList<>();
            row1.add(1);
            row1.add(2);
            row1.add(3);

            List<Integer> row2 = new ArrayList<>();
            row2.add(4);
            row2.add(5);

            List<Integer> row3 = new ArrayList<>();
            row3.add(6);
            row3.add(7);
            row3.add(8);
            row3.add(9);

            list.add(row1);
            list.add(row2);
            list.add(row3);

            printDynamic(list);

      }
}
