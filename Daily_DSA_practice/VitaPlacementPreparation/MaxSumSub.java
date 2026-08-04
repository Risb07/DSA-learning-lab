package Daily_DSA_practice.VitaPlacementPreparation;

/**
 * To find the maximum sum of all subarrays of size K: Given an array of
 * integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’
 * consecutive elements in the array. Input : arr[] = {100, 200, 300, 400},
 * k = 2 Output : 700
 */
public class MaxSumSub {

      public static int findMaxSubSum(int[] arr, int k) {

            int maxSum = 0;
            for (int i = 0; i < k; i++) {
                  maxSum += arr[i];
            }
            int window_sum = maxSum;

            for (int i = k; i < arr.length; i++) {
                  window_sum = window_sum + arr[i] - arr[i - k];
                  maxSum = Math.max((maxSum), window_sum);
            }
            return maxSum;

      }

      public static void main(String[] args) {
            System.out.println(findMaxSubSum(new int[] { 100, 200, 300, 400 }, 2));
      }
}