package Daily_DSA_practice.Leetcode_Arrays;

import java.util.Arrays;

public class Anagram {

      public static boolean check_anagram(String s1, String s2) {
            char[] chrr1 = s1.toCharArray();
            Arrays.sort(chrr1);
            System.out.println(Arrays.toString(chrr1));
            char[] chrr2 = s2.toCharArray();
            Arrays.sort(chrr2);
            System.out.println(Arrays.toString(chrr2));
            return Arrays.equals(chrr1, chrr2);
      }

      public static void main(String[] args) {

            System.out.println(check_anagram("silent", "listen"));

      }
}
