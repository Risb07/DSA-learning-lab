package Daily_DSA_practice.Leetcode_Arrays;

public class Longest_Repeating_Character_Replacement {
      public static void replace(String s, int k) {

            char[] charr = s.toCharArray();
            int max = 1;
            for (int i = 0; i < charr.length; i++) {
                  char ch = charr[i];
                  String s2 = "";

                  for (int l = 1; l < charr.length; l++) {
                        if (k != 0) {
                              if (charr[l] != ch) {
                                    charr[l] = ch;
                                    k--;
                              } else {
                                    s2 = s2 + ch;
                              }
                        } else {
                              break;
                        }
                  }

                  int count = 0;
                  for (char c : charr) {
                        if (c != ch) {
                              break;
                        } else {
                              count++;
                        }
                  }
                  max = Math.max(max, count);
            }
            System.out.println(max);
      }

      public static void checkConsecutive(String str) {
            char[] strarr = str.toCharArray();
            int count = 1;
            int max = 1;

            for (int i = 1; i < strarr.length; i++) {
                  if (strarr[i] == strarr[i - 1]) {
                        count++;
                  } else if(i==strarr.length-1){
                        max = Math.max(count, max);
                  }else {
                        max = Math.max(count, max);
                        count = 1;
                  }
                  
            }
            System.out.println(max);
      }

      public static void main(String[] args) {
            checkConsecutive("AAA");
      }
}
