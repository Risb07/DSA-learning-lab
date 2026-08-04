package Daily_DSA_practice.Strings;

import java.util.Scanner;

/**
 * Check if a string is a Palindrome String
 * 
 * 
 * 
 */
public class CheckPalindromeString {

      public static void check_Palindrome(String str) {
            char[] charr = str.toCharArray();

            int n = charr.length / 2;
            int flag = 0;
            for (int i = 0; i < n; i++) {
                  if (charr[i] != charr[charr.length - 1 - i]) {
                        flag = 1;
                        break;
                  }
            }
            if (flag == 0) {
                  System.out.println("String is Palindrome.");
            } else {
                  System.out.println("String is not a Palindrome.");
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            check_Palindrome(s);
      }
}