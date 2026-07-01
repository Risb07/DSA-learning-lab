package Daily_DSA_practice.Leetcode_Strings;

/**
 * String_To_Int
 */
public class String_To_Int {

  
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int index = 0;
      long n = 0;

       if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }
          for (int i = index; i < s.length(); i++) {
            char c = s.charAt(i);
            int a = c - '0';
            if(a < 0 | a >9){
                  break; 
            }
            
            n = n*10 + a;
            if (sign == 1 && n > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && (-n) < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
           }
        
      
      return (int) (n * sign);
    }

    public static void main(String[] args) {
      String_To_Int s = new String_To_Int();
     System.out.println( s.myAtoi("-91283472332"));
    }
}
      
