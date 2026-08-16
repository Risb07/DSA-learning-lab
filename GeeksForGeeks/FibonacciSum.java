package GeeksForGeeks;

/**
 * FibonacciSum
 */
public class FibonacciSum {

      public int fibSum(int n) {
        // code here
        int first = 0;
        int second = 1;
        int next = 0;
        int sum = 0;
        
        while(n>0){
            
            sum += first;
            next = first + second;
            first = second;
            second = next;
            n--;
            
        }
        
        return sum;
      }
      public static void main(String[] args) {
            FibonacciSum fs = new FibonacciSum();
            System.out.println(fs.fibSum(5));
      }
}