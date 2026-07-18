package Daily_DSA_practice.Leetcode_Arrays;

public class Remove_Element {

      public int removeElement(int[] nums, int val) {

            int size = 0;

            for (int i = 0; i < nums.length; i++) {
                  boolean duplicate = false;
                  if (nums[i] == val) {
                        duplicate = true;
                  }
                  if (!duplicate) {
                        nums[size] = nums[i];
                        size++;
                  }
            }

            for (int i = size; i < nums.length; i++) {
                  nums[i] = val;
            }

            return size;
      }

      public static void main(String[] args) {
            Remove_Element obj = new Remove_Element();
            int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
            System.out.println(obj.removeElement(arr, 2));
            for (int n : arr) {
                  System.out.print(n + " ");
            }
      }
}
