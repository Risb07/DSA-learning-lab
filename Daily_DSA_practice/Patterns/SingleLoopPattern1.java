public class SingleLoopPattern1 {
      public static void print(int n) {

            int r = 0;
            int c = 0;

            for (r = 1; r <= n;) {
                  if (c < r) {
                        System.out.print("*");
                        c++;
                  }
                  if (c == r) {
                        System.out.println();
                        r++;
                        c = 0;
                  }
            }

            c = 0;
            r = 1;

            for (r = n; r >= 1;) {
                  if (r > c) {
                        System.out.print("*");
                        c++;
                        continue;
                  }
                  if (r == c) {
                        System.out.println();
                        r--;
                        c = 0;
                  }
            }

            /**
             * 1
             * 12
             * 123
             */

            r = 0;
            c = 0;

            for (r = 1; r <= n;) {
                  if (c < r) {
                        System.out.print(c+1);
                        c++;
                  }
                  if (c == r) {
                        System.out.println();
                        r++;
                        c = 0;
                  }
            }

            r = 0;
            c = 0;

            int k=1;

            for (r = 1; r <= n;) {
                  if (c < r) {
                        System.out.print(k++);
                        c++;
                  }
                  if (c == r) {
                        System.out.println();
                        r++;
                        c = 0;
                  }
            }

      
            

      }

      public static void main(String[] args) {
            print(3);
      }
}
