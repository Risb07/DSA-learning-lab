
/***
 * Write a function to solve the following equation a3 + a2b + 2a2b + 2ab2 + ab2 + b3.
 */

import java.util.Scanner;

public class Polynomial {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value for a: ");
            int a = scanner.nextInt();
            System.out.print("Enter value for b: ");
            int b = scanner.nextInt();

            int result = solvePolynomial(a, b);
            System.out.println("The result of the polynomial is: " + result);
            scanner.close();
      }

      public static int solvePolynomial(int a, int b) {
            return (int) (Math.pow(a, 3) + Math.pow(a, 2) * b + 2 * Math.pow(a, 2) * b + 2 * a * Math.pow(b, 2)
                        + a * Math.pow(b, 2) + Math.pow(b, 3));
      }
}
