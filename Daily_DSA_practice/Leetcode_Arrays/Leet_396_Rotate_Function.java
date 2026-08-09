package Daily_DSA_practice.Leetcode_Arrays;

public class Leet_396_Rotate_Function {

      public static void reverse(int[] arr , int start , int end){

            while(start<end){
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
            }
      }

      public static int maxRotateFunction(int[] nums) {

            int maxSum = 0, k = 0 ;
            int n  = nums.length-1;
            int m = n;
            while (m>=0 && k < n){
                  k = k%n;
                  
                  reverse(nums, 0, n);
                  reverse(nums, 0, k);//0 -1
                  reverse(nums, k, n);
                  k++;
                  int sum = 0;
                  for(int i = 0 ; i < n ; i++){
                        sum = sum + (nums[i] * i);
                  }
                  maxSum = Math.max(maxSum, sum);
                  m--;
            }

            return maxSum;
      }
      public static void main(String[] args) {
            int[] arr= new int[]{4,3,2,6};
            int max_sum = maxRotateFunction(arr);
            System.out.println(max_sum);
      }
      
}
