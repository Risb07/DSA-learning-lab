/**
 * Pattern4
 */
public class Pattern4 {

      public static void printPattern(int n) {
            for (int i = 0; i < n ; i++) {
                  for (int j = 3; j > i; j--) {
                        System.out.print(j);
                  }
                  System.out.println();
            }
      }


      public static void oneLoopPrintPattern(int n ){
            int rows = 1;
            int cols = 1;
            for(int i = 0 ; i < 6 ; i++){
                  
                  if(cols == rows){
                        rows++;
                        cols = 1;
                        System.out.println();
                  }
                        System.out.print(cols++);
                        
                  
                  
            }
      }
      public static void main(String[] args) {
            // printPattern(3);
            oneLoopPrintPattern(3);
      }
}