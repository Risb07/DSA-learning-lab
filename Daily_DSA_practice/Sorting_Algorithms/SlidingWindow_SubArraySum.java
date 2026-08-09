package Daily_DSA_practice.Sorting_Algorithms;

public class SlidingWindow_SubArraySum {

      public static void max_subarray_sum(int[] arr, int k){
            int current = 0 ;
            for(int i = 0 ; i < k ; i++){
                  current+=arr[i];
            }
            int max = current;
            for(int i = k ; i < arr.length ; i++){
                  current  = current + arr[i] - arr[i-k];
                  max  = Math.max(max, current);
                  System.out.print(i+" ");
            }
            // System.out.println(max);
      }

      public static void main(String[] args) {
            SlidingWindow_SubArraySum.max_subarray_sum(new int[]{1,2,3,4,5}, 4);
      }
}
