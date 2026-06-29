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


