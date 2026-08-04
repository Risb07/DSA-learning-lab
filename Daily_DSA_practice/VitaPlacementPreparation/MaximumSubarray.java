package Daily_DSA_practice.VitaPlacementPreparation;

public class MaximumSubarray {
      public static int findMaxSum(int[] arr, int k ){

            int n = arr.length;
            if(n <=  k){
                  System.out.println("Invalid");
                  return -1;
            }
            int maxSum = 0 ;
            for(int i =0 ; i< k  ; i++){
                  maxSum += arr[i];
            }
            int window_sum = maxSum;
            for(int j = k ; j<arr.length ; j++){
                  window_sum = window_sum + arr[j] - arr[j-k];
                  maxSum = Math.max(window_sum, maxSum);
            }
            return maxSum;
      }
      public static void main(String[] args) {
            System.out.println(findMaxSum(new int[] {1,4,2,10,2,3,1,0,10}, 4));
      }
}
