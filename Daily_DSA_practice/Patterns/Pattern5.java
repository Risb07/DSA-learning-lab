/*

  3  
 323
32123 
 323
  3 


   --
   3-
   23
   3-
   --
     
*/

package Daily_DSA_practice.Patterns;

public class Pattern5 {
      public static void PrintPattern(int n) {
            for (int i = 3; i >= 1; i--) {
                  for (int s = i; s > 1; s--) {
                        System.out.print(" ");
                  }

                  for (int j = n; j >= i; j--) {
                        System.out.print(j);
                  }
                  System.err.println();

                  // reverse pattern

                  // for(int li = n-1 ; li <= 1 ; li--){}

                  for (int lj = n - 1; lj <= n; lj++) {
                        System.out.print(lj);
                  }
            }

      }

      public static void main(String[] args) {
            PrintPattern(3);
      }

}
