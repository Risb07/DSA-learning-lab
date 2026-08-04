package Daily_DSA_practice.Recursive;

/**
 * fibonacci_recursive
 */
public class fibonacci_recursive {

      public static int x = 0, y = 1;

      public void print_fibonacci(int n) {
            int c;
            c = x + y;
            System.out.println(c);
            x = y;
            y = c;
            n--;
            if (n > 2)
                  print_fibonacci(n);

      }
      public static void main(String[] args) {

      }
}