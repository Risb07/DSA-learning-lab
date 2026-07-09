/**
 * Square_Root
 */
public class Square_Root {

      public int mySqrt(int x) {
        int n = 2;
        int down = 0;
       while (n*n<=x){
        if(n*n == x){
            return n;
        }else{
            down  = n;
        }
        n++;
       }
       return down;
    }
    public static void main(String[] args) {
      Square_Root s = new Square_Root();
      System.out.println(s.mySqrt(4));
    }
}