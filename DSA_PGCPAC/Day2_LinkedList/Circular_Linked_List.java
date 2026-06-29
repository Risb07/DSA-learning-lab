package DSA_PGCPAC.Day2_LinkedList;

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

