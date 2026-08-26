package Daily_DSA_practice.Leetcode_Strings;

import java.util.Arrays;

/**
 * CheckifStringsCanbeMadeEqualWithOperationsI
 */
public class CheckifStringsCanbeMadeEqualWithOperationsI {

      public static boolean canBeEqual(String str1, String str2) {

            if (str1.length() != str2.length())
                  return false;

            if (str1.equals(str2))
                  return false;

            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            int first = -1;
            int second = -1;

            for (int i = 0; i < s1.length; i++) {

                  if (s1[i] != s2[i]) {

                        if (first == -1)
                              first = i;
                        else if (second == -1)
                              second = i;
                        else
                              return false; // more than 2 mismatches
                  }
            }
            if(first == -1 || second == -1){
                  return false;
            }

            char temp = s2[first];
            s2[first] =s2[second];
            s2[second] = temp;

            String string2 = new String(s2);
            if(str1.equals(string2)){
                  return true;
            }else{
                  return false;
            }


      }

      public static void main(String[] args) {

            System.out.println(canBeEqual("coding", "codnig"));
      }

}