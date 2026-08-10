package GeeksForGeeks;

public class SumPalindrome {

      public static int reverse(int num) {

            int rnum = 0;
            while (num > 0) {
                  rnum = rnum * 10 + num % 10;
                  num = num / 10;
            }

            return rnum;
      }

      public static int SumPal(int num) {
            if (num == reverse(num)) {
                  return num;
            }
            int count = 5;
            while (count > 0) {
                  int rnum = reverse(num);
                  int sum = num + rnum;
                  int rsum = reverse(sum);
                  if (rsum == sum)
                        return sum;
                  else
                        num = sum;
                  count--;
            }
            return -1;
      }

      public static void main(String[] args) {
            int num = 73;
            System.out.println(SumPal(num));
      }

}
