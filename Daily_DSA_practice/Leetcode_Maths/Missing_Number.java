import java.util.Arrays;

public class Missing_Number {
      public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            if(nums.length == 0)
                  return 0;
            if(nums[0] == 0 && nums.length == 1)
                  return 1;
            if(nums[0] != 0)
                  return 0;
            for(int i  =1 ; i < nums.length; i++){

                  if(nums[i]-nums[i-1] != 1){
                              return nums[i-1] +1;
                  }
                  if(i == nums.length -1){
                        return nums[i] + 1;
                  }
            }
            return 0;
      
      }
      public static void main(String[] args) {
            Missing_Number m = new Missing_Number();
            System.out.println(m.missingNumber(new int[]{}));
      }
}
