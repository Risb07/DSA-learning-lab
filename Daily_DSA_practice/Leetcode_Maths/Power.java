/**
 * Power
 */
package Daily_DSA_practice.Leetcode_Maths;

public class Power {

      public boolean isPowerOfTwo(int n) {
            if (n == 1) {
                  return true;
            }
            if (n <= 0) {
                  return false;
            }
            while (n > 1) {
                  if (n % 2 == 0)
                        n = n / 2;
                  else
                        return false;
            }
            return true;
      }

      public static void main(String[] args) {
            Power p = new Power();
            System.out.println(p.isPowerOfTwo(-16));
      }

}