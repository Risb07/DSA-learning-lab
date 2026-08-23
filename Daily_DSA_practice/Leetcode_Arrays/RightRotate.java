package Daily_DSA_practice.Leetcode_Arrays;

import java.util.Arrays;
public class RightRotate {

      /**
       * 0 ms
       * Beats 100.00%
       * Rotate Elements Right by k elements
       */
      public static void reverse(int[] arr, int start, int end) {

            while (start < end) {
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start++;
                  end--;
            }
      }

      public static void rotateRight(int[] arr, int k) {

            k = k % arr.length;
            if (k < 0) {
                  k = k + arr.length;
            }

            reverse(arr, 0, arr.length - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
      }

      public static void main(String[] args) {
            int[] arr = new int[] { 1, 2, 3, 4, 5 };
            rotateRight(arr, 2);
            System.out.println(Arrays.toString(arr));
      }
}
