package Java_Logic_Preparation;

import java.util.Scanner;

/**
 * 
 * Q.3) Accept a name from user and check if it is palindrome or not
 */

public class Check_palindrom {
      public static void checkP(String s) {
            char[] chArr = s.toCharArray();
            int n = s.length() / 2;
            int flag = 0;
            for (int i = 0; i < n; i++) {
                  if (chArr[i] != chArr[n - 1 - i]) {
                        flag = 1;
                  }
            }
            if (flag == 0) {
                  System.out.println("string is a palindrome.");
            } else {
                  System.out.println("string is not a palindrome.");
            }
      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            checkP(s);
      }
}
