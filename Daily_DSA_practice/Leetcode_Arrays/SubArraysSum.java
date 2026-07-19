package Daily_DSA_practice.Leetcode_Arrays;

/**
 * SubArrays
 */
public class SubArraysSum {

      public int GenerateSubArrays(int[] arr) {

            int m = 0;
            int max = arr[0];
            while (m < arr.length) {
                  for (int i = m; i < arr.length; i++) {
                        int sum = 0;
                        for (int j = m; j <= i; j++) {
                              // System.out.print(arr[j]+" ");
                              sum = sum + arr[j];
                        }
                        max = Math.max(sum, max);

                  }

                  m++;
            }
            return max;

      }

      public static void main(String[] args) {
            SubArraysSum s = new SubArraysSum();
            int max = s.GenerateSubArrays(new int[] { -1, -1, 0, -3 });

            System.out.println(max);
      }
}