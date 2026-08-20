package Daily_DSA_practice.Arrays;

import java.util.Arrays;

public class DistributeElementsIntoTwoArraysI {
      public static int[] solution(int[] nums) {

            int n = nums.length;
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int a1 = 0;
            int a2 = 0;
            int[] result = new int[n];

            arr1[a1++] = nums[0];
            arr2[a2++] = nums[1];

            for (int i = 2; i < n; i++) {

                  if (arr1[a1 - 1] > arr2[a2 - 1]) {
                        arr1[a1++] = nums[i];
                  } else {
                        arr2[a2++] = nums[i];
                  }
            }


            for (int i = 0; i < a1; i++) {
                  result[i] = arr1[i];
            }
            int t = 0;
            for (int i = a1; i < n; i++) {
                  result[i] = arr2[t++];
            }
            return result;

      }

      public static void main(String[] args) {
            int[] nums = new int[] { 2, 1, 3 };
            System.out.println(Arrays.toString(solution(nums)));
      }
}
