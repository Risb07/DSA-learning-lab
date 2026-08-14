package Daily_DSA_practice.Leetcode_Arrays;

import java.util.Arrays;

public class MergeSortedArray {

      public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;

            while (j >= 0) {
                  if (i >= 0 && nums1[i] > nums2[j]) {
                        nums1[k] = nums1[i];
                        k--;
                        i--;

                  } else {
                        nums1[k] = nums2[j];
                        k--;
                        j--;
                  }
            }
      }

      public static void main(String[] args) {
            int[] arr = new int[] { 1, 2, 3, 0, 0, 0 };
            int[] arr2 = new int[] { 2, 5, 6 };
            MergeSortedArray m = new MergeSortedArray();
            m.merge(arr, 3, arr2, 3);
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr2));
      }
}
