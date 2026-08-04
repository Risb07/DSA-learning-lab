package Daily_DSA_practice.Recursive;

interface Recursion{
      public int print(int n);
}


public class Print_Num_Recursive implements Recursion {

      // print n  to 1 
      
      public int print(int n){
            if(n <= 1 ){
                  System.out.println(n + " ");
                  return 1 ;
            }else{
                  System.out.print(n + " ");
                  return print(--n);
            }
      }
      
      // print 1 to n
      public void print_straight(int n) {
            if(n == 0){
                  return;
            }
            print_straight(n-1);
            System.out.println(n);
      }

      public static void main(String[] args) {
            
            Print_Num_Recursive obj = new Print_Num_Recursive();
            obj.print_straight(10);


      }
      
}
