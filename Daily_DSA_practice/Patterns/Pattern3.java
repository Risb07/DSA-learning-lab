/**
 * Pattern3
 */
public class Pattern3 {

      public void printPattern(int n) {

            for (int i = n; i > 0; i--) {

                  for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                  }
                  System.out.println();
            }
      }
      public static void main(String[] args) {
            Pattern3 p = new Pattern3();
            p.printPattern(3);
      }
}