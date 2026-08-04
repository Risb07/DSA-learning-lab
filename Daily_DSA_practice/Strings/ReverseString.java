package Daily_DSA_practice.Strings;

public class ReverseString {
      
      public static void reverse(String str){
            int n = str.length();
            char[] charr = str.toCharArray();
            String s = "";
            for(int i = 0 ; i < n ; i++){
                  s = s+charr[i];
            }
            
            if(s.equals(str));

      }
}
