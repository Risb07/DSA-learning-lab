package Daily_DSA_practice.Leetcode_Strings;

import java.util.HashSet;

/**
 * Longest_Substring_Without_Repeating_Characters
 */
public class Longest_Substring_Without_Repeating_Characters {

      public int lengthOfLongestSubstring(String s) {

            char[] chArr = s.toCharArray();
            int n = chArr.length;
            int k = 0, max = 0;

            while (k < n) {

                  HashSet<Character> set = new HashSet<>();

                  for (int i = k; i < n; i++) {
                        if (set.contains(chArr[i])) {
                              break;
                        } else {
                              set.add(chArr[i]);
                        }
                  }
                  max = Math.max(max, set.size());
                  k++;
            }
            return max;

      }

      public static void main(String[] args) {
            Longest_Substring_Without_Repeating_Characters obj = new Longest_Substring_Without_Repeating_Characters();
            System.out.println(obj.lengthOfLongestSubstring("pwwkew"));
      }
}