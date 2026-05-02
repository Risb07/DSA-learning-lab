
// ########### linked list version 1 methods ###################


import java.util.Scanner;

class Node
{
   int data;
   Node next;
   Node(int data)
   {
       this.data=data;
       this.next=null;
   }
}

public class Linear_Linked_List_Class
{
    Node root;//all opeartions done by/on root

    void insert_left(int data)
    {
        Node n=new Node(data);//create a node
        if(root==null)//only 1st time
            root=n;
        else
        {
            n.next=root;//1
            root=n;//2
        }

    }
    void insert_right(int data)
    {
        Node n=new Node(data);//create a node
        if(root==null)//only 1st time
            root=n;
        else
        {
            Node t=root;//1 start from root
            while(t.next!=null)//2 move to right most
                t=t.next;
            t.next=n;//3 connected
        }
    }
    void delete_left()
    {
        if(root==null)
            System.out.print("\nEmpty List");
        else
        {
            Node t=root;//1
            root=root.next;//2
            System.out.print("\n|"+t.data+"|-> deleted");
            //The printing simply prints what is deleted but
            // AGC will physically delete once method is over
        }
    }
    void delete_right()
    {
        if(root==null)
            System.out.print("\nEmpty List");
        else
        {
            Node t,t2;
            t=t2=root;//1
            if(root.next==null)//single node
                root=null;//manual deletion
            else
            {
                while(t.next!=null)//2
                {
                    t2=t;
                    t=t.next;
                }

                t2.next=null;//3
            }
            System.out.print("\n|"+t.data+"|-> deleted");
        }
    }
    void print_list()
    {
        if(root==null)
            System.out.print("\nList Empty");
        else
        {
            Node t=root;
            while(t!=null)
            {
                System.out.print("|"+t.data+"|->");
                t=t.next;
            }
            System.out.print("NULL");
        }
    }

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        Linear_Linked_List_Class obj=new Linear_Linked_List_Class();
        int choice=0,e;

        do
        {
            System.out.print("\nLinkedList Menu");
            System.out.print("\n----------------");
            System.out.print("\n1.insert left ");
            System.out.print("\n2.insert right");
            System.out.print("\n3.delete left");
            System.out.print("\n4.delete right");
            System.out.print("\n5.print LinkedList");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("\nEnter element on left:");
                    e=sc.nextInt();
                    obj.insert_left(e);//obj.enqueue(sc.nextInt());
                    break;
                case 2:
                    System.out.print("\nEnter element on right:");
                    e=sc.nextInt();
                    obj.insert_right(e);
                    break;
                case 3:
                    obj.delete_left();
                    break;
                case 4:
                    obj.delete_right();
                    break;
                case 5:
                     obj.print_list();
                     break;
                case 0:
                    System.out.print("\nExiting code .. coded by Rishabh");
                    break;
                default:
                    System.out.print("\nInvalid option selected.");
                    break;
            }
        }while(choice!=0);//Not zero, continue.
    }


}

