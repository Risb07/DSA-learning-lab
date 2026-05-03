package Linked_List_Examples;
import java.util.Scanner;
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
    void search_list(int key)//key is element to search
    {
        if(root==null)
            System.out.print("\nList Empty");
        else
        {
            Node t=root;
            while(t!=null)
            {
                if(t.data==key)
                {
                    System.out.print("\n"+key+" found in list");
                    return;
                }
                t=t.next;
            }
            System.out.print("\n"+key+" not found in list");
        }
    }

    void insert_after(int ref,int e)//key is element to search
    {
        if(root==null)
            System.out.print("\nList Empty");
        else
        {
            Node t=root;
            while(t!=null)
            {
                if(t.data==ref)
                {
                    System.out.print("\n"+ref+" found in list");
                    //found
                    Node n=new Node(e);//element
                    n.next=t.next;//1
                    t.next=n;//2
                    return;
                }
                t=t.next;
            }
            System.out.print("\n"+ref+" not found in list");
        }
    }
    void delete_element(int e)//e if found will be deleted.
    {
        if(root==null)
            System.out.print("\nList Empty");
        else
        {
            Node t=root;
            Node t2=root;
            while(t!=null)
            {
                if(t.data==e)
                {
                    System.out.print("\n"+e+" found in list");
                    //found nd now search for case
                    if(t==root)//case 1
                        root=root.next;
                    else if(t.next==null)//case 2
                        t2.next=null;
                    else//case 3
                        t2.next=t.next;//re refering to next
                    System.out.print("\n"+t.data+" deleted");
                    return;

                }
                t2=t;
                t=t.next;

            }
            System.out.print("\n"+e+" not found in list");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Linear_Linked_List_Class obj = new Linear_Linked_List_Class();

        int choice = 0, data, key, ref;

        do
        {
            System.out.print("\n\n===== Linked List Menu =====");
            System.out.print("\n1. Insert Left");
            System.out.print("\n2. Insert Right");
            System.out.print("\n3. Delete Left");
            System.out.print("\n4. Delete Right");
            System.out.print("\n5. Print List");
            System.out.print("\n6. Search Element");
            System.out.print("\n7. Insert After Element");
            System.out.print("\n8. Delete Specific Element");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_left(data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_right(data);
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

                case 6:
                    System.out.print("Enter element to search: ");
                    key = sc.nextInt();
                    obj.search_list(key);
                    break;

                case 7:
                    System.out.print("Enter reference element: ");
                    ref = sc.nextInt();
                    System.out.print("Enter new element: ");
                    data = sc.nextInt();
                    obj.insert_after(ref, data);
                    break;

                case 8:
                    System.out.print("Enter element to delete: ");
                    data = sc.nextInt();
                    obj.delete_element(data);
                    break;

                case 0:
                    System.out.print("\nExiting... Career Credentials Mode OFF 🚀");
                    break;

                default:
                    System.out.print("\nInvalid choice. Try again.");
            }

        } while(choice != 0);
    }


}

package Linked_List_Examples;

import Stack_Examples.Stack_Class;

import java.util.Scanner;

public class Dynamic_Stack
{
    Node tos;//all opeartions done by/on root

    void push(int data)
    {
        Node n=new Node(data);//create a node
        if(tos==null)//only 1st time
            tos=n;
        else
        {
            n.next=tos;//1
            tos=n;//2
        }

    }
    void pop()
    {
        if(tos==null)
            System.out.print("\nEmpty Stack");
        else
        {
            Node t=tos;//1
            tos=tos.next;//2
            System.out.print("\nPoped:"+t.data);
        }
    }
    void print_stack()
    {
        if(tos==null)
            System.out.print("\nStack Empty");
        else
        {
            Node t=tos;
            while(t!=null)
            {
                System.out.print("\n|"+t.data+"|");
                System.out.print("\n-----");
                t=t.next;
            }

        }
    }
    void peek()
    {
        if(tos==null)
            System.out.print("\nStack Empty");
        else
        {
                System.out.print("\nAt Peek:"+tos.data);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Dynamic_Stack obj=new Dynamic_Stack();
        int choice=0,e;
        do
        {
            System.out.print("\nStack Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Push");
            System.out.print("\n2.Pop");
            System.out.print("\n3.Peek");
            System.out.print("\n4.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                        System.out.print("\nEnter element to push:");
                        e=sc.nextInt();
                        obj.push(e);//obj.push(sc.nextInt());
                        break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                        System.out.print("\nElements on Stack. \n");
                        obj.print_stack();
                        break;
                case 0:
                    System.out.print("\nExiting code .. coded by amar.career");
                    break;
                default:
                    System.out.print("\nInvalid option selected.");
                    break;
            }
        }while(choice!=0);//Not zero, continue.
    }
}











































package Linked_List_Examples;

import Queue_Examples.Queue_Class;

import java.util.Scanner;

public class Dynamic_Queue
{
    Node front,rear;
    void enqueue(int data)
    {
        Node n=new Node(data);//create a node
        if(rear==null)//only 1st time
        {front=rear=n;}
        else
        {
            rear.next=n;//1
            rear=n;//2
        }
    }
    void dequeue()
    {
        if(front==null)
            System.out.println("Empty queue");
        else
        {
            Node t=front;
            if(front==rear)//single node
                front=rear=null;//manual delete
            else
                front=front.next;//move ahead
            System.out.println("Dequeued:"+t.data);
        }
    }
    void print_queue()
    {
        if(front==null)
            System.out.print("\nQueue Empty");
        else
        {
            Node t=front;
            while(t!=null)
            {
                System.out.print("|"+t.data+"|-");
                t=t.next;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Dynamic_Queue obj=new Dynamic_Queue();
        int choice = 0, e;
        do
        {
            System.out.print("\n\nQueue Menu");
            System.out.print("\n-----------");
            System.out.print("\n1. Enqueue");
            System.out.print("\n2. Dequeue");
            System.out.print("\n3. Print Queue");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                        System.out.print("Enter element: ");
                        e = sc.nextInt();
                        obj.enqueue(e);
                        break;

                case 2:
                         obj.dequeue();
                         break;

                case 3:
                        obj.print_queue();
                    break;

                case 0:
                    System.out.print("\nExiting... coded by Amar Career Credentials");
                    break;

                default:
                    System.out.print("Invalid choice");
            }

        } while(choice != 0);
    }
}




package Linked_List_Examples;

public class Circular_Linked_List 
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
}













package Linked_List_Examples;

public class Circular_Linked_List
{
    Node root,last;

    void insert_left(int data)
    {
        Node n=new Node(data);//create a node
        if(root==null)//only 1st time
        {
            root=last=n;
            last.next=root;
        }
        else
        {
            n.next=root;//1
            root=n;//2
            last.next=root;//3
        }

    }
    void insert_right(int data)
    {    Node n=new Node(data);//create a node
        if(root==null)//only 1st time
        {   root=last=n;
            last.next=root;
        }
        else
        {
            last.next=n;//1
            last=n;//2
            last.next=root;//3
        }
    }
    void delete_left()
    {
        if(root==null)
            System.out.print("\nEmpty List");
        else
        {
            Node t=root;//1
            if(root==last)//songle node
            { root=last=null;}
            else
            {
                root=root.next;//2
                last.next=root;//3
            }
            System.out.print("\n|"+t.data+"|-> deleted");

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
            if(root==last)//single node
            {root=last=null;}//manual deletion
            else
            {
                while(t!=last)//2
                {
                    t2=t;
                    t=t.next;
                }
                last=t2;//3
                last.next=root;//4
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
            do
            {
                System.out.print("|"+t.data+"|->");
                t=t.next;
            }while(t!=root);
        }
    }
}







package Linked_List_Examples;

public class Doubly_Linked_List
{
 Dnode root;//create root
    void insert_left(int data)
    {
        Dnode n=new Dnode(data);//create a node
        if(root==null)//only 1st time
            root=n;
        else
        {
            n.right=root;root.left=n;//1,2
            root=n;//3
        }
    }
    void delete_left()
    {
        if(root==null)
            System.out.print("\nEmpty List");
        else
        {
            Dnode t=root;//1
            if(root.left==null && root.right==null)
                root=null;
            else {
                root = root.right;//2
                root.left = null;//3
            }
            System.out.print("\n<-|"+t.data+"|-> deleted");

        }
    }
    void insert_right(int data)
    {
        Dnode n=new Dnode(data);//create a node
        if(root==null)//only 1st time
            root=n;
        else
        {
            Dnode t=root;//1 start from root
            while(t.right!=null)//2 move to right most
                t=t.right;
            t.right=n;//3 connected
            n.left=t;//4
        }
    }
    void delete_right()
    {
        if(root==null)
            System.out.print("\nEmpty List");
        else
        {
            Dnode t,t2;
            t=root;//1
            if(root.right==null)//single node
                root=null;//manual deletion
            else
            {
                while(t.right!=null)//2
                    t=t.right;
                t2=t.left;//3 ref to pref who is on left
                t2.right=null;//4
                //(t.left).right=null;
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
            Dnode t=root;
            System.out.print("NULL");
            while(t!=null)
            {
                System.out.print("<-|"+t.data+"|->");
                t=t.right;
            }
            System.out.print("NULL");
        }
    }
    void print_list_rev()//print from last to first
    {
        if(root==null)
            System.out.print("\nList Empty");
        else
        {
            Dnode t=root;
            System.out.print("NULL");
            //only go to last and stop
            //loop
            //from last to first print
            //loop2
            while(t!=null)//loop2
            {
                System.out.print("<-|"+t.data+"|->");
                t=t.right;
            }
            System.out.print("NULL");
        }
    }
}

