package Daily_DSA_practice.Leetcode_Maths;

public class Add_Digits {
      public int addDigits(int num) {
            int x = num;
            // int result = 0;
            while (x >= 10) {
                  int result = 0;
                  int n = x;
                  while (n > 0) {
                        result += n % 10;
                        n = n / 10;
                  }
                  x = result;
            }
            return x;
      }

      public static void main(String[] args) {

            Add_Digits add = new Add_Digits();
            System.out.println(add.addDigits(100));
      }
}
