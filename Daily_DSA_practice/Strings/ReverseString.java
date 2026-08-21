package Daily_DSA_practice.Strings;

public class ReverseString {
      
      public static void reverse(String str){
            int n = str.length()-1;
            char[] charr = str.toCharArray();
            String s = "";
            for(int i = n ; i >=0 ; i--){
                  s = s+charr[i];
            }
            System.out.println(s);
            if(s.equals(str));
      }
      public static void main(String[] args) {
            reverse("hello");
      }
}
