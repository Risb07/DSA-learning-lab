import java.util.Arrays;
import java.util.Scanner;

/**
 * BinarySearch
 * 
 * find the median of array and if number is greater then go to right side else
 * go to left side.
 * 
 * 
 */
public class BinarySearch {

      public static void Binary_Search(int[] arr, int num) {

            Arrays.sort(arr);
            int left = 0, right = arr.length - 1;
            boolean found = false;
            while (left <= right) {
                  int mid = (right + left) / 2;

                  if (arr[mid] == num) {
                        found = true;
                        break;
                  } else if (arr[mid] < num) {
                        left = mid + 1;
                  } else {
                        right = mid - 1;
                  }
            }
            ;

            if (found) {
                  System.out.println("found number ");
            } else {
                  System.err.println("not found");
            }

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }

            int num = 7;
            Binary_Search(arr, num);
      }

}