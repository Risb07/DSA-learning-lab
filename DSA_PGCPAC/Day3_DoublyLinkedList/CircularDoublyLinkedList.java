
import java.util.Scanner;

class DNode{
      int data;
      DNode left, right;
      DNode(int data){
            this.data = data;
      }
      
}
public class CircularDoublyLinkedList{
      DNode root ,last ;
      void insert_left(int data){
            DNode dnode = new DNode(data);
            if(root == null){
                  root =last  = dnode; // first time single node is root itself

                  root.left = root;
                  root.right = root;
            }else{
                  dnode.right=root;     root.left=dnode; //  dnode points to old node , old node points to dnode
                  dnode.left = last;
                  last.right = dnode;
                  root = dnode; //dnode is new root
                  root.left = last;
            }
      }
      
      void insert_right(int data){
            DNode dnode = new DNode(data);
            if(root == null){
                  root = dnode;
                  last = dnode;

                  root.left = root;
                  root.right = root;
            }else{
                  dnode.left = last;
                  dnode.right = root;

                  last.right = dnode;
                  root.left = dnode;
                  last = dnode;
            }
      }

      void delete_left(){
            
            if(root == null){
                  System.out.print("\nEmpty List.");
            }else if(root == last){
                  System.out.print("\n<-|"+root.data+"|-> deleted");
                  root = last = null;
            } else {
                  DNode t = root;

                  root = root.right;
                  root.left = last;
                  last.right = root;

                  System.out.print("\n<-|"+t.data+"|-> deleted");
                  }
            }

      void delete_right(){
            if(root == null){
                  System.out.print("\nEmpty List");
            } else if(root == last){
                  System.out.print("\n|"+root.data+"|-> deleted");
                  root = last = null;
            } else {
                  DNode t = last;

                  last = last.left;
                  last.right = root;
                  root.left = last;

                  System.out.print("\n|"+t.data+"|-> deleted");
            }
      }


      void print_list()
      {
            if(root==null)
                  System.out.print("\nList Empty");
            else
            {
                  DNode t=root;
                  do{
                      System.out.print("<-|"+t.data+"|->");
                      t=t.right;
                  }
                  while(t!=root );
                  System.out.print("Root");
            }
      }

      void print_list_reverse(){
            if(root == null){
                  System.out.print("\nList Empty");
            } else {
                  DNode t = last;

                  do{
                        System.out.print("<-|"+t.data+"|->");
                        t = t.left;
                  } while(t != last);

                  System.out.print("Root");
            }
      }

      public static void main(String[] args){
            int choice;
            Scanner sc = new Scanner(System.in);
            
          

            CircularDoublyLinkedList ref = new CircularDoublyLinkedList();
   do {
              System.out.print("\n\n Menu------------\n1.insert left\n2.insert right\n3.delete left\n4.delete right\n5.print\n6.print revrese\n0.exit\n");
            System.out.print("\n Enter Choice - ");
            choice=sc.nextInt();

            switch(choice){
                  case 1:
                        System.out.println("\nEnter element - ");
                        ref.insert_left(sc.nextInt());
                        break;
                  case 2:
                        System.out.println("\nEnter element - ");
                        ref.insert_right(sc.nextInt());
                        break;
                  case 3:
                        ref.delete_left();
                        break;
                  case 4:
                        ref.delete_right();
                        break;
                  case 5:
                        ref.print_list();
                        break;
                  case 6:
                        ref.print_list_reverse();
                        break;
                  case 0:
                        System.out.print("\nExiting Doubly Linked List Menu code...");
                        break;
                  default:
                        System.out.print("\nInvalid choice.");
                        break;
            }
      }while(choice!=0);//Not zero, continue.

      }
}