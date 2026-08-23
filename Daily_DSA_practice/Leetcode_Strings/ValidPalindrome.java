package Daily_DSA_practice.Leetcode_Strings;

/**
 * 125. Valid Palindrome
 */
public class ValidPalindrome {

      /*
       * Using s.replaceAll("[^a-zA-Z0-9]", "") is inefficient because it forces Java
       * to scan the text multiple times, compile complex internal patterns, and
       * create massive amounts of duplicate data in memory.
       */
      public static boolean isPalindrome(String s) {
            String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
            if (s1.isEmpty()) {
                  return true;
            }
            char[] chrr = s1.toLowerCase().toCharArray();
            int l = chrr.length - 1;
            for (int i = 0; i <= l / 2; i++) {
                  if (chrr[i] != chrr[l - i]) {
                        return false;
                  }
            }
            return true;
      }

      /*
       * Character.isLetter(char c): Returns true only if the character is an
       * uppercase or lowercase alphabetical letter (a-z, A-Z). It returns false for
       * numbers 0-9.
       */

      public static boolean isPalindrome2(String s) {
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                  char start = s.charAt(left);
                  char end = s.charAt(right);

                  if (!Character.isLetter(start)) {
                        left++;
                  } else if (!Character.isLetter(end)) {
                        right--;
                  } else {
                        if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                              return false;
                        }
                        left++;
                        right--;
                  }
            }
            return true;
      }

      public static void main(String[] args) {
            System.out.println(isPalindrome2("0P"));
      }
}