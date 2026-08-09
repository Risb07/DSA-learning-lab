/**
 * Multiply_Strings
 */
public class Multiply_Strings {

    public String multiply(String num1, String num2) {

        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        
        int i1=0;
        int i2=0;

        
        for (int i = 0 ; i < num1.length(); i++){
            int a = n1[i]-'0';
            i1 = (i1*10)+a;
        }

        for (int i = 0 ; i < num2.length() ; i++){
            int a = n2[i] -'0';
            i2 = (i2*10)+a;
        }

        // System.out.println(i1);
        // System.out.println(i2);
        int result = i1*i2;
        return Integer.toString(result);

    }

    public static void main(String[] args) {
      Multiply_Strings m = new Multiply_Strings();
      System.out.println(m.multiply("123456789", "987654321"));
     
    }
}
