package Daily_DSA_practice.Leetcode_Strings;

/**
 * String_To_Int
 */
public class String_To_Int {

   int n=0 ;
    public int myAtoi(String s) {
        for(char c : s.toCharArray()){
            
            int a = c-'0';
            
            n = n*10 + a;
            
        }
        return n;
    }

    public static void main(String[] args) {
      String_To_Int s = new String_To_Int();
     System.out.println( s.myAtoi("42"));
    }
}
      
