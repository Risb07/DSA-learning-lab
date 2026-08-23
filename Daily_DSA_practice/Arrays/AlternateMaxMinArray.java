package Daily_DSA_practice.Arrays;

import java.util.Arrays;

public class AlternateMaxMinArray {

      public static int[] printAlternately(int[] arr) {

            boolean flag = false;
            int small = 0;
            int large = arr.length - 1;
            int[] temp = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {

                  if (flag == false) {
                        temp[i] = arr[large--];
                  } else {
                        temp[i] = arr[small++];
                  }
                  flag = !flag;
            }
            return temp;
      }

      public static void main(String[] args) {
            int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
            int[] temp = printAlternately(arr);
            System.out.println(Arrays.toString(temp));

      }
}
