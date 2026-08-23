package Daily_DSA_practice.Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInPlace {

      public static void removeDuplicate(int[] nums) {

            /*
             * Sorted array (Most Common Interview Version)
             * Time: O(n)
             * Space: O(1)
             */

            int write = 1;

            for (int read = 1; read < nums.length; read++) {
                  if (nums[read] != nums[read - 1]) {
                        nums[write] = nums[read];
                        write++;
                  }
            }

            /*
             * Unsorted Array (HashSet)
             * Time: O(n)
             * Extra Space: O(n)
             */

            Set<Integer> seen = new HashSet<>();
            int w = 0;

            for (int n : nums) {
                  if (seen.add(n)) {
                        nums[w++] = n;
                  }
            }

            /*
             * Unsorted Array, Truly O(1) Extra Space
             * Best Case O(n2) / Worst Case O(n3)
             * Time: O(n²)
             * Space: O(1)
             */
            /*
             * int n = nums.length;
             * for (int i = 0; i < n; i++) {
             * for (int j = i + 1; j < n;) {
             * if (nums[i] == nums[j]) {
             * for (int k = j; k < n - 1; k++) {
             * nums[k] = nums[k + 1];
             * }
             * n--;
             * } else {
             * j++;
             * }
             * }
             * }
             */
      }
}
