/*


*
**
***
****
*****

*/

package Daily_DSA_practice.Patterns;

public class Pattern2 {
      public void Print(int n) {

            int cols = 0;
            int l = 1;
            for (int i = 1; i <= (n * (n + 1)) / 2; i++) {
                  System.out.print('*');
                  cols++;
                  if (cols == l) {
                        cols = 0;
                        System.out.println();
                        l++;
                  }
            }

      }

      public static void main(String[] args) {
            Pattern2 p = new Pattern2();
            p.Print(5);
      }
}
