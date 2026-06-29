//make a function accepts string and return rword
import java.util.Scanner;
import java.util.Stack;

class Reverse_Word_using_funtion{

      static String reverseString(String str) {
                  char[] charArr = str.toCharArray();
                  int len = charArr.length();
                  Stack<Character> stack = new Stack<> ();
                    String rword = "";
                  for(int i =0;i<len ;i++)
                  {
                         stack.push(charArr[i]);
                  }
                  while (!stack.isEmpty()){
                        rword = rword+stack.pop(); //popping everything goes into rword 
                  }
                  return rword;
            }

      public static void main(String args[]){
            System.out.println("Enter a string : ");
            Scanner sc = new Scanner(System.in);
            String word = sc.next();

            String reverse = reverseString(word);
            System.out.println("revrese string is  : "+ reverse);
      }
}