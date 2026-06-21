/*287. Find the Duplicate Number */


import java.util.Arrays;

class FindDuplicates {

/*1. Sort + Compare Adjacent Elements*/

    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        
            for (int j =1 ; j<nums.length ; j++){
                if (nums[j] == nums[j-1]){
                    return nums[j];
                }
            }
        return 0;
    } 



    public static void main(String[] args) {
      FindDuplicates f = new FindDuplicates();
      int[] arr = {1,3,4,2,4,4};
      int result  = f.findDuplicate(arr);
      System.out.println(result);
    }
}