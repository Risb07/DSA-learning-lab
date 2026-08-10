package DSA_PGCPAC.Day2_LinkedList;
import java.util.Scanner;
class Node{
      
      int data;
      Node next;
   
      Node(int data){
            this.data = data;
            this.next = null;
      }
}
public class SearchList{
      Node root;
      
      // inserting nodes on left of linkedlist.

      void insert_left(int num){
            Node node = new Node(num); //create a new node
            if(root == null){ //if first node
                  root = node;// set first node root
            }
            else{
                  node.next = root;
                  root = node; // make new node (leftmost) root 
            } 
      }


      void insert_right(int num){
            Node newnode = new Node(num);
            if(root==null){
                  root=newnode;
                  System.out.print("\nEmpty List.");
            }else{
            Node node = root;
            while(node.next!= null){
                  node= root.next;
            }
            node.next = newnode;
            }            
      }

      void insert_after(int num1, int num2){
            Node node = root;
            
            while(node != null){
                  if(node.data == num1){
                  System.out.println("Element found.");
                  break;
                  }
            node = node.next;
            }
            Node newnode = new Node(num2);
            newnode.next = node.next;
            node.next = newnode; //connected 
            

      }
      
      void delete_right(int num){}
      void delete_middle(int num){}
      void print_list(){
            if(root == null){
                  System.out.println("Empty List.");
            }else{
            Node node = root;
            while(node!=null){
                  System.out.print("|"+" "+node.data+" "+"|");
                  node = node.next;
            }
            System.out.print("NUll");
            }
      }


      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            Node node = new Node(10);
            // at first - node - data - 10 , next null
            SearchList obj = new SearchList();
            int choice, num;
            do {
                  System.out.print("\n Menu---------");
                  System.out.print("\n 1. Insert left.");
                  System.out.print("\n 2. Insert right.");
                  System.out.print("\n 3. Insert after.");
                  System.out.print("\n 4. Delete Left.");
                  System.out.print("\n 5. Delete Right.");
                  System.out.print("\n 6. Delete Middle.");
                  System.out.print("\n 7. Print.");
                  System.out.print("\n 0. Exit.");

                  System.out.print("\n Enter your choice :");
                  choice = sc.nextInt();

                  switch(choice){
                        case 1:
                              System.out.println("\n Enter element : ");
                              num = sc.nextInt();
                              obj.insert_left(num);
                              break;
                        case 2:
                              System.out.println("\n Enter element : ");
                              num = sc.nextInt();
                              obj.insert_right(num);
                              break;
                        case 3:
                              System.out.println("\n Enter elements after : ");
                              int num1 = sc.nextInt();
                              System.out.println("\n Enter new elements : ");
                              int num2 = sc.nextInt();
                              obj.insert_after(num1, num2);
                              break;
                        case 4:
                              System.out.println("\n Enter element : ");
                              num = sc.nextInt();
                              // obj.delete_left(num);
                              break;
                        case 5:
                              System.out.println("\n Enter element : ");
                              num = sc.nextInt();
                              obj.delete_right(num);
                              break;
                        case 6:
                              System.out.println("\n Enter element : ");
                              num = sc.nextInt();
                              obj.delete_middle(num);
                              break;
                        case 7:
                              obj.print_list();
                              break;
                        case 0:
                              System.out.print("\n Exiting code....by Rishabh Angure");
                              break;

                        default:
                              System.out.print("\n Invalid choice.");
                              break;
                  }

            }
            while (choice != 0);

      }
}