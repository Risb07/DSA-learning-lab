package Queue_Example;

import java.util.Scanner;

public class QueueClass
{
    private int rear,front, Maxsize,queue[];

    void create_queue(int size)
    {
        rear=-1;
        front= 0;
        Maxsize=size;
        queue=new int[Maxsize];
    }
    //enqueue(e):Increment rear by one and accept element at a q[rear].
    void enqueue(int e)
    {
        queue[++rear]=e; // rear= ++(-1) = 0, queue[0]= e
    }

    boolean is_full()
    {
        return(rear==Maxsize-1);
    }
    //deque():remove and return elelement at tos
    int dequeue()
    {
        return(queue[front++]); //queue[0] queue[1] queue[2] . . . 
    }
    boolean is_empty()
    {
        return(front>rear);
    }
    //peek():only return element at tos
//     int peek()
//     {
//        return(queue[tos]);
//     }
    void print_queue()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(queue[i]+" - ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        QueueClass obj=new QueueClass();
        System.out.print("\nEnter size of queue:");
        int size=sc.nextInt();
        int choice=0,e;
        obj.create_queue(size);
        do
        {
            System.out.print("\nqueue Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.enqueue");
            System.out.print("\n2.deque");
            System.out.print("\n3.Peek");
            System.out.print("\n4.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    if(!obj.is_full())//if not full
                    {
                        System.out.print("\nEnter element to enqueue:");
                        e=sc.nextInt();
                        obj.enqueue(e);//obj.enqueue(sc.nextInt());
                    }
                    else
                    {
                        System.out.print("\nqueue Full");
                    }
                    break;
                case 2:
                    if(!obj.is_empty())//if not empty
                    {
                        System.out.print("\nElement dequeed:"+obj.dequeue());
                    }
                    else
                    {
                        System.out.print("\nqueue Empty");
                    }
                    break;
                case 3:
                    if(!obj.is_empty())//if not empty
                    {
                        // System.out.print("\nElement @ Peek:"+obj.peek());
                    }
                    else
                    {
                        System.out.print("\nqueue Empty");
                    }
                    break;
                case 4:
                    if(!obj.is_empty())//if not empty
                    {
                        System.out.print("\nElements on queue. \n");
                        obj.print_queue();
                    }
                    else
                    {
                        System.out.print("\nqueue Empty");
                    }
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








// no entry  = -1 
/* enqueue = entry on queue 
   with every dequeue operation front increments by one
   interview Question - in queue what increment or decrement in enqueue?
   interview Question - how u checck if queue is Empty - when front > queue

    drawback of linear queue is it moves in single direction 

    better option is circular queue 
    - linear cannot reclaim empty spaces from dequeue.
    - queue which restarts from zero when it reaches the last .
    - for circular queue -  front is  = 0  and rear  is -1 same like a linear queue but
    
    ram uses page replacement algorithms- 


    Round Robin - 
    
    */