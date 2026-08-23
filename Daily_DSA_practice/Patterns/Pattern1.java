/*

*****
*****
*****
*****
*****

*/

/**
 * Pattern1
 */
package Daily_DSA_practice.Patterns;

public class Pattern1 {

      public void Print(int n) {

            int cols = 0;
            for (int i = 0; i < n * n; i++) {
                  System.out.print('*');
                  cols++;
                  if (cols == n) {
                        cols = 0;
                        System.out.println();
                        continue;
                  }
            }
      }

      public static void main(String[] args) {
            Pattern1 p = new Pattern1();
            p.Print(10);
      }
}