class PascalsTriangle{
      public static int[][] pascalT(int a){
            if(a<1){
                  return new int[0][];
            }
            if(a == 1){
                  return new int[][]{{1}};
            }
            int[][] arr = new int[a][];
            arr[0] = new int[]{1};
            arr[1] = new int[]{1,1};
            for( int i = 2 ; i < a ; i++ ){
                  arr[i] = new int[i+1];
                  arr[i][0] = 1;
                  arr[i][i] = 1;
                  for(int j = 1 ; j < i ; j++){
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                  }
            }
            return arr;
      }
      public static void main(String[] args) {
            int[][] arr = pascalT(5);
            for(int i =0 ; i<arr.length; i++){
                  for(int j =0 ; j<arr[i].length ; j++){
                        System.out.print(arr[i][j]+" ");
                  }
                  System.out.println("");
            }
      }
}