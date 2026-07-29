package Java_Logic_Preparation;

import java.util.Scanner;

/**
 * Q.4) Accept a sentence from user and count total number of words
 */

class CountWords {

      public static void countWords(String str) {

            System.out.println(str.trim().split(" ").length);

      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            countWords(str);

      }
}
