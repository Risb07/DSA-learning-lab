

/**
 * Rotate
 */
package Daily_DSA_practice.Arrays;

import java.util.Arrays;

public class Rotate {

      /**
       * complexity : time limit exceeds exception on leetcode while using below
       * program
       * 
       * time - O(k*n)
       * need to optimize it !
       */
      public void rotate(int[] nums, int k) {

            if (k < 0) {
                  k = k + nums.length;
            } else {
                  k = k % nums.length;
            }

            for (int i = 0; i < k; i++) {
                  rotate(nums);
            }
      }

      public void rotate(int[] arr) {
            int n = arr.length;
            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                  arr[i] = arr[i - 1];
            }
            arr[0] = temp;
      }

      /**
       * Optimizing code using reverse approach
       * Time - O(n)
       * step 1 : divide the array in half
       * step 2 : reverse the both parts of array
       * step 3 : reverse the whole array.
       */

      public void rotateWithReverse(int[] arr, int k) {

            k = k % arr.length;
            if (k < 0)
                  k = k + arr.length;

            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
            reverse(arr, 0, arr.length - 1);

      }

      public void reverse(int[] arr, int start, int end) {

            while (start < end) {
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start++;
                  end--;
            }

      }

      /**
       * rotate right
       */

      public void rotateRightWithReverse(int[] arr, int k) {

            k = k % arr.length;
            if (k < 0)
                  k = k + arr.length;

            reverse(arr, k - 1, 0);
            reverse(arr, k, arr.length - 1);
            reverse(arr, 0, arr.length - 1);

      }

      public static void main(String[] args) {
            Rotate obj = new Rotate();
            int[] arr = new int[] { 1, 2, 3, 4, 5 };
            System.out.println(Arrays.toString(arr));

            obj.rotateWithReverse(arr, 1);
            System.out.println(Arrays.toString(arr));
      }

}