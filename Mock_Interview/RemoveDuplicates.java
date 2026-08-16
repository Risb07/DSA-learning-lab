package Mock_Interview;

import java.util.*;

public class RemoveDuplicates {

      public static void main(String[] args) {
            String s = "Programming";
            LinkedHashSet<Character> set = new LinkedHashSet<>();

            for (char c : s.toCharArray()) {
                  set.add(c);
            }
            String res = "";
            for (char c : set) {
                  res += c;
            }
            System.out.print(res);
      }

}
