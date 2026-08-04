package Daily_DSA_practice.Strings;

import java.util.Scanner;

/**
 * Count Words in a sentance.
 */
public class CountWords {

      public static void count(String s) {

            String[] str = s.trim().split(" ");

            System.out.println(str.length);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();

            count(str);

      }

}