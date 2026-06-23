import java.util.Arrays;


class Product_of_Array_Except_Self {

    /*O(n2)*/
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 1)
            return nums;
        int[] sums = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            int sum = 1;
            for(int j = 0 ; j < nums.length ; j++){
                    if(j==i)
                        continue;
                    else
                        sum*=nums[j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    // /* O(n) */ 
    public int[] productExceptSelfnew(int[] nums) {
        int[] sums = new int[nums.length];
        int sum = 1;
        int zeros = 0;

        for(int i = 0 ; i < nums.length ; i++){
                if (nums[i] == 0){
                    zeros++;
                }else{
                    sum*=nums[i];
                }
        }
        
        for(int k = 0 ; k < nums.length ; k++){
            if(zeros == 0 ) { 
                sums[k] = (sum/nums[k]);
            }else if(((nums[k] == 0) & (zeros == 1))){
                     sums[k] = sum;
            }else{
                   sums[k] = 0 ;
                }
        }
        
        return sums;
    }
    
    public static void main(String[] args) {
        Product_of_Array_Except_Self p = new Product_of_Array_Except_Self();
        System.out.println(Arrays.toString(p.productExceptSelfnew(new int[]{-1,1,0,-3,3})));
    }
}