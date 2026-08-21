import java.util.Arrays;

/**
 * Q3. Accept 5 number in an array. Display all even number at the beginning and
 * all Odd at the end. Use only one loop 5 6 4 1 2 6 4 2 1 5
 */
package Daily_DSA_practice.Arrays;

public class BinarySearchOddEven {

      public static void Bin_Single_Swap(int[] arr) {

            int left = 0, right = arr.length - 1;
            while (left < right) {
                  if (arr[left] < 0) {
                        left++;
                  } else if (arr[right] > 0) {
                        right--;
                  } else {
                        int temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;
                        left++;
                        right--;
                  }
            }

      }

      public static void main(String[] args) {
            int[] arr = new int[] { 19, -13, 15, -12, -18, -16, 1, 3 };
            Bin_Single_Swap(arr);
            System.out.println(Arrays.toString(arr));
      }

}