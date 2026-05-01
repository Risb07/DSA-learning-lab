import java.util.Scanner;
import java.util.Stack;

class CharacterStack{
      public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         String word, rword=""; //rword needs default parameter else error
         //1
         System.out.println("Enter Word: ");
         word = sc.next();
         Stack<Character> stack = new Stack<> ();
         //2 use loop and till the character is pushed 
         for(char c:word.toCharArray()){ //every character goes in c
            stack.push(c); // and every character in c is pushed 
         }
         //3 till stack is not empty pop and copy it rword 
         while (!stack.isEmpty){
            rword = rword+stack.pop(); //popping everything goes into rword 
         }
         System.out.print("\n ");

      }
}

//when u think u get 100 things in ming 
//when u write one thing gets at a time
//take down notes - to break down the problem - gets steps on to the paper - brain should be able to do one job at a time - so write on paper brain works one thing at a time - as we plan for any presentation - plan before coding - its 60:40 - 60 goes for thinking - read once and write details and then goes after planning - best way to work - 
/* 1st rule - write on paper pen- think -plan - code. use diagrams to plan and understand the question . 
*/