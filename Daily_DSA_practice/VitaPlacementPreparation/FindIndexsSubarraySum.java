package Daily_DSA_practice.VitaPlacementPreparation;

import java.util.Arrays;

public class FindIndexsSubarraySum {

      /*With for loop */
      public static int[] findIndexRange(int[] arr, int target) {

            int sum = 0;
            int start = 0;
            int end = 0;
            for (int i = 0; i < arr.length; i++) {

                  for (int j = i; j < arr.length; j++) {

                        sum += arr[j];

                        if (sum == target) {
                              start = i+1;
                              end = j+1;
                              return new int[] { start, end };
                        } else if (sum > target) {
                              break;
                        }
                  }
                  sum = 0;
            }

            return new int[] { -1 };

      }

      /*With while loop*/
      public static int[] subArraySum(int[] arr , int target){

            int left = 0, right = 0 , sum = 0 ;

            while(right < arr.length){
                  sum+=arr[right];
                  while(sum > target && left <= right ){
                        sum -= arr[left];
                        left++;
                  }

                  if(sum == target){
                        return new int[] {left+1, right+1};
                  }
                  right++;

            }

            return new int[] {-1};
      }

      public static void main(String[] args) {
            int[] res = subArraySum(new int[] { 15, 2, 4, 8, 9, 5, 10, 23 }, 23);
            System.out.println(Arrays.toString(res));
      }

}
