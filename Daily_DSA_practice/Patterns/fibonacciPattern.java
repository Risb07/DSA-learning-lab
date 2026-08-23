package Daily_DSA_practice.Patterns;

/*

1 //  0+1
2 3 // 1+1 //2+1
5 8 13
*/

public class fibonacciPattern {
      public static void fib_pattern(int n) {
            int first = 0;
            int second = 1;
            for (int i = 1; i < n; i++) {

                  for (int j = 1; j <= i; j++) {
                        System.out.print(first + " ");
                        int next = first + second;
                        first = second;
                        second = next;
                  }
                  System.out.println();
            }
      }

      public static void main(String[] args) {
            fib_pattern(5);
      }
}
