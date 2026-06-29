import java.util.Scanner;

public class StudentNode{
      private String name;
      private char gender;
      private float pointer;

      StudentNode(String name, char gender, float pointer){
            this.name = name ;
            this.gender = gender;
            this.pointer = pointer;
      }

      void print_student(){
            System.out.print("\n Name " +name+"\tGender "+gender+"\tPointer"+pointer);
      }

      String getName(){
            return name;
      }

      StudentNode left;
      StudentNode right;
}
