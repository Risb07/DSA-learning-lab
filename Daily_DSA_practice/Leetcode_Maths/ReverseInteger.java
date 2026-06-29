/**
 * ReverseInteger
 */
public class ReverseInteger {

    public int reverse(int x) {
        long num = 0;
        int n = Math.abs(x);

        while(n>0){

            int a = x%10;
            num = num*10+a;
            x=x/10;
            n=n/10;
        }
        if(num>Integer.MAX_VALUE || num <Integer.MIN_VALUE)
            return 0;
        else
            return (int)num;
        
    }
    public static void main(String[] args) {
      ReverseInteger r = new ReverseInteger();
      System.out.println(r.reverse(1534236469));
    }
}
      
