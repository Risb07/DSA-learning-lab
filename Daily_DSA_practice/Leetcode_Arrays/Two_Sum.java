package Daily_DSA_practice.Leetcode_Arrays;

import java.util.Arrays;
public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            int find = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] == find) {
                    if (j != i && nums[j] == find) {
                        return new int[] { i, j };
                    }
                }
            }
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        Two_Sum t = new Two_Sum();
        System.out.print(Arrays.toString(t.twoSum(new int[] { 1, 2, 3, 4, 4 }, 8)));

    }
}
