class OverlappingCondition{
      // static int[][] merge_intervals(int arr[][]){

      // static ArrayList<Integer> merge_intervals(int arr[][]){ // this is not feisable for creating two d array
      static ArrayList<int [][]> merge_intervals(int arr[][]){ // we can pass 2d array in the arrayList 

            // int temp [][] = new int[arr.length][2];

            ArrayList<int[]> merged = new ArrayList<>();

            for(int i = 1 ; i < arr.length ; i++){
                for(int j =0 ; j < arr[i].length ; j++){

                  // System.out.print("[" + arr[i][0] + ","+ arr[i][1] + "]");
                  //increment
                  // arr[i][0]+=10;
                  // arr[i][1]+=10;


                  if( arr[i][0] <= arr[i-1][1] ){
                        System.out.print("\n Merged [" + m[i-1][0] + "," + m[i,1]+"]");
                  }
                }
            }
            return arr ;
      }
      public static void main(String [] args ){
            int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
            int[][] res = merge_intervals(arr);
            // System.out.print("\n"+arr.toString());
      }
}


/* we can finish this either by using comparator lambda and toString  */