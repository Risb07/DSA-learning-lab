import java.util.LinkedList;
import java.util.Scanner;
/*
//Implement a student management system consisting of:
//1. Add a student
//2. Delete a student
//3. Search a student
//4. Print list of all the students
*/

class StudentNode{
      private String name;
      private char gender;
      private float pointer;

      StudentNode(String name, char gender, float pointer){
            this.name = name ;
            this.gender = gender;
            this.pointer = pointer;
      }

      void print_student(){
            System.out.print("\n Name "+name+"\tGender "+gender+"\tPointer "+pointer);
      }

      String getName(){
            return name;
      }

      StudentNode left;
      StudentNode right;
}

public class Student_Management_System{
      LinkedList<StudentNode> list = new LinkedList<>();

      void add_student(String name , char gender, float pointer){
            list.add(new StudentNode(name, gender, pointer));
      }

      void delete_student(String name){
            for (StudentNode s :list){
                  if (s.getName().equals(name)) {
                        list.remove(s);
                  }
            }
      }

      StudentNode search_student(String name){
            for(StudentNode s : list){
            if (s.getName().equals("samar")) {
                  return s;
            }
            }
      }

      void print_list(){
            if(list.size()>1){
            for(StudentNode s: list){
                  System.out.print("\n name: "+s.getName()+"\n gender: "+s.getGender()+"\n pointer: "+s.getPointer());
            }}else{
                  System.out.print("\nList is empty");
            }
      }



      public static void main(String[] args) {
        LinkedList<StudentNode> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        //add data manually
      //   list.add(new StudentNode("amar", 'm', 8.9f));
      //   list.add(new StudentNode("amarita", 'f', 9.1f));
      //   list.add(new StudentNode("samarita", 'f', 9.5f));
        //print data maunally
      //   for (StudentNode s : list)
      //       s.print_student();
      //   //search on name
      //   for (StudentNode s : list)//Go through all the students. If the name of a student matches print
      //   {
      //       if (s.getName().equals("samar")) {
      //           System.out.print("\nFound");
      //           s.print_student();
      //       }
      //   }

        Student_Management_System obj = new Student_Management_System();
       int choice;
       do{
            System.out.print("\n Menu....");
            System.out.print("\n 1.add student");
            System.out.print("\n 2.delete stuent");
            System.out.print("\n 3.search student");
            System.out.print("\n 4.print student list");
            System.out.print("\n enter choice.");
            choice = sc.nextInt();

            switch(choice){
                  case 1:
                        System.out.print("\nEnter Student name:");
                        String name = sc.nextLine();
                        System.out.print("\nEnter Student gender:");
                        char gender = sc.next().charAt();
                        System.out.print("\nEnter Student pointer:");
                        float pointer = sc.nextFloat();
                        obj.add_student(name, gender, pointer);
                        break;
                  case 2:
                        System.out.print("\nEnter Student name:");
                        obj.delete_student(sc.next());
                        break;
                  case 3:
                        System.out.print("\nEnter Student name:");
                        obj.search_student(sc.next());
                        break;
                  case 4:
                        obj.print_list();
                        break;
                  case 0:
                        System.out.print("\nExiting code...");
                        break;
                  default:
                        System.out.print("\nInvalid choice.");
            }

       }while(choice!=0);
        

    }

}