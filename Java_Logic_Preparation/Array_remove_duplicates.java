package Java_Logic_Preparation;

import java.util.Arrays;

public class Array_remove_duplicates {

      public static void RemoveDuplicates(int[] arr) {

            Arrays.sort(arr);
            int[] temp = new int[arr.length];
            int previous = 0;
            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] != previous) {
                        temp[cnt++] = arr[i];
                        previous = arr[i];
                  }
            }

            System.out.println(Arrays.toString(temp));
            for (int j = 0; j < cnt; j++) {
                  System.out.print(temp[j]);
            }

      }

      public static void main(String[] args) {
            RemoveDuplicates(new int[] { 3, 5, 3, 7, 9, 7, 3, 1 });
      }
}
