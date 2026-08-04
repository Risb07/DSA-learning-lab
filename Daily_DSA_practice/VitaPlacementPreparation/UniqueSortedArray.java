package Daily_DSA_practice.VitaPlacementPreparation;

/**
 * Q.1) Print unique sorted array Accept data in sorted order having duplicate
 * value. You need to print unique array using single loop . Unique sorted array
 * using 1 loop Input - 1 1 2 2 2 5 output - 1 2 5
 */
public class UniqueSortedArray {

      public static void uniqueSort(int[] arr ){
            int previous = 0, cnt = 0;
            int[] temp = new int[arr.length] ;

            for(int i  = 0 ; i < arr.length ; i++){
                  if(arr[i] != previous){
                        temp[cnt++] = arr[i];
                        previous = arr[i];
                  }
            }
            for(int i  = 0 ; i < temp.length ; i++){
                  System.out.print(temp[i]+" ");
            }
      }
      public static void main(String[] args) {
            uniqueSort(new int[] { 1,2,3,3,3,3,2,4,5});
      }
      
}