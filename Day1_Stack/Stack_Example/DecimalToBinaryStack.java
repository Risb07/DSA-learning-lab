import java.util.Scanner;
import java.util.Stack;

class DecimalToBinaryStack{
      public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int num; 
         //1
         System.out.println("Enter num ");
         num = sc.nextInt();
         Stack<Integer> stack = new Stack<> ();
         String rword = "";
         
         for(; num>0 ; num= num/2){ //every character goes in c
            int c = num%2;
            stack.push(c); // and every character in c is pushed 
         }
         //3 till stack is not empty pop and copy it rword 
         while (!stack.isEmpty()){
            rword = rword+stack.pop(); //popping everything goes into rword 
         }
         System.out.print(rword);


         //doing it with function  - 
         //but the problem is 

      }
}

//flow for most interview 
