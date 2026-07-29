package Java_Logic_Preparation;

import java.util.Arrays;

public class AlternateMinMaxArray {

      public static int[] print(int[] arr){


            int n = arr.length;
            int large = n-1;
            int small = 0;
            boolean flag = false;
            int[] nums = new int[n]; 
            for(int i = 0 ; i < n ; i++){

                  if(flag){
                        nums[i]  = arr[small++];
                  }else{
                        nums[i] = arr[large--];
                  }
                  flag = !flag;
            }
            return nums;

      }
      public static void main(String[] args) {
            int[] n =new int[]{1,2,3,4,5,6,7,8};
            int[] res = print(n);
            System.out.println(Arrays.toString(res));

      }
      
}
