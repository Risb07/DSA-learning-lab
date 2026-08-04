package Daily_DSA_practice.VitaPlacementPreparation;

import java.util.Arrays;

public class UniqueUnsortedArray {
      
      public static void unique(int[] arr){
            int n = arr.length;
            int[] temp = new int[n];
            int unique= 0;
            for(int i = 0; i < n ; i++){
                  boolean isduplicate = false;
                  for(int j = 0 ; j < unique; j++){
                        if(arr[j] == arr[i]){
                              isduplicate = true;
                              break;
                        }
                  }
                  if(!isduplicate){
                        temp[unique] = arr[i];                                                                                                 
                        // System.out.print(arr[i]);
                        unique++;
                  }
            }
            System.out.println(Arrays.toString(temp));
      }
      public static void main(String[] args) {
            unique(new int[]{4,2,1,1,2,3,6,7,5,5,5,5});
      }
}
