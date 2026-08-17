package Daily_DSA_practice.Leetcode_Strings;

/**
 * 125. Valid Palindrome
 */
public class ValidPalindrome {
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

      public static void main(String[] args) {
            System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
      }
}
