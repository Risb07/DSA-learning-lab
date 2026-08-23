package Daily_DSA_practice.Leetcode_Maths;

class Pow {
    // O(n)
    public double myPow(double x, int n) {
        double pow = 1.00;
        if (n == 0) {
            return 1.0000;
        }
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                pow = pow * x;
            }
        } else {
            for (int i = 0; i < (n * (-1)); i++) {
                pow = pow * x;
            }
            pow = 1 / pow;
        }
        return pow;
    }

    // optimized O (nlogn)
    class Solution {
        public double myPow(double x, int n) {
            long num = n;
            if (num < 0) {
                x = 1 / x;
                num = -num;
            }
            double res = 1;

            while (num > 0) {

                if ((num & 1) == 1) {
                    res *= x;
                }

                x *= x;
                num /= 2;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Pow p = new Pow();
        System.out.println(p.myPow(1.0000, 2147483647));
    }

}