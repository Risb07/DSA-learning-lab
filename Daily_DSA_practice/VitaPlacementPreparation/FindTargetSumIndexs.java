package Daily_DSA_practice.VitaPlacementPreparation;

import java.util.Arrays;

/**
 * Given a 1-based indexing array arr[] of non-negative integers and an integer
 * sum. You mainly need to return the left and right indexes(1-based indexing)
 * of that subarray. In case of multiple subarrays, return the subarray indexes
 * which come first on moving from left to right. If no such subarray exists
 * return an array consisting of element -1. Examples: Input: arr[] = [15, 2, 4,
 * 8, 9, 5, 10, 23], target = 23 Output: [2, 5] Explanation: Sum of subarray
 * arr[2…5] is 2 + 4 + 8 + 9 = 23. Input: arr[] = [1, 10, 4, 0, 3, 5], target =
 * 7 Output: [3, 5] Explanation: Sum of subarray arr[3…5] is 4 + 0 + 3 = 7.
 * Input: arr[] = [1, 4], target = 0 Output: [-1] Explanation: There is no
 * subarray with 0 sum.
 */
public class FindTargetSumIndexs {

      public static int[] FindSubSum(int[] arr, int target) {

            int left = 0, right = 0, sum = 0;
            int n = arr.length;

            while (right < n) {

                  sum += arr[right];
                  while (sum > target && left <= right) {
                        sum -= arr[left];
                        left++;
                  }
                  if (sum == target) {
                        return new int[] { left+1, right+1 };
                  }
                  right++;
            }
            return new int[] { -1 };
      }

      public static void main(String[] args) {
            int[] res = FindSubSum(new int[] { 15, 2, 4, 8, 9, 5, 10, 23 }, 23);
            System.out.println(Arrays.toString(res));
      }
}