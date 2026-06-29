import java.util.Scanner;
import java.util.LinkedList;

public class Binary_Addition{


      static LinkedList<Integer> create_list(String bin){
            LinkedList<Integer> list = new LinkedList<>();
            for(char c : bin.toCharArray()){
                  list.add(c-'0');//character to digit 
            }
            return list;
      }

      static LinkedList<Integer> add(LinkedList<Integer> l1, LinkedList<Integer> l2){
            LinkedList <Integer> res = new LinkedList<>();

            int i = l1.size()-1;
            int j = l2.size()-1;
            int carry = 0;

            while(i>=0 || j >= 0 || carry !=0){
                  int sum = carry;

                  if(i >= 0) sum += l1.get(i--);
                  if(j >= 0) sum += l2.get(j--);

                  res.addFirst(sum%2);
                  carry = sum/2;
            }
            return res;
      }

      public static void main(String[] args ){
            Scanner sc = new  Scanner(System.in);
            System.out.print("\nBinary Addition \n\n");
            System.out.print("Enter first 8 bit binary: ");
            String b1 =sc.nextLine();

            System.out.print("Enter second 8 bit binary: ");
            String b2 =sc.nextLine();
            
            LinkedList<Integer> bin_l1 = create_list(b1);
            LinkedList<Integer> bin_l2 = create_list(b2);

            LinkedList<Integer> result = add(bin_l1, bin_l2);
            System.out.print("\nBinary Addition of "+b1+" and "+b2+" is : ");
            for(int n : result){
                  System.out.print(n);
            }

            System.out.print("\n\nExiting Binary Addition By Rishabh Angure ...\n");

      }
}