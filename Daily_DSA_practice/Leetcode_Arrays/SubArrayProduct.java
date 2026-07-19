package Daily_DSA_practice.Leetcode_Arrays;

public class SubArrayProduct {
      public static int maxProduct(int[] nums) {

            int max = nums[0];

            for (int i = 0; i < nums.length; i++) {
                  for (int j = i; j < nums.length; j++) {
                        int prod = 1;
                        for (int k = i; k <= j; k++) {
                              // System.out.print(nums[k] + " ");
                              prod *= nums[k];
                        }
                        // System.out.println();
                        max = Math.max(max, prod);
                  }
            }
            return max;
      }

      public static void main(String[] args) {
            int product = maxProduct(new int[] { -1, 2, -3, -4 });
            System.out.println(product);
      }
}
