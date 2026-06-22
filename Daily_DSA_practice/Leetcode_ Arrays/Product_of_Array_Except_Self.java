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
    
    public static void main(String[] args) {
        Product_of_Array_Except_Self p = new Product_of_Array_Except_Self();
        System.out.println(Arrays.toString(p.productExceptSelf(new int[]{1,2,3,4})));
    }
}