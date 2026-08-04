package Daily_DSA_practice.Recursive;

public class factorial_recursive {
      public int print_fact(int n ){
            int fact;
            if(n == 1 ){
                  return 1 ;
            }else{
            fact = n* print_fact(--n); // n-1
            return fact;
            }
      }
      public static void main(String[] args) {
            factorial_recursive f =  new factorial_recursive();
            System.out.println(f.print_fact(5));
      }
}
