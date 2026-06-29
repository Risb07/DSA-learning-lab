

package Queue_Examples;

import java.util.Scanner;

public class CircularQueue
{
    private int queue[], front, rear, MaxSize, count;

    public void createQueue(int size) {
        MaxSize = size;
        rear = -1;
        front = 0;
        count = 0;
        queue = new int[size];
    }

    //Enqueue(data):
//it increments rear by 1 and insert element at queue[rear]
    void enqueue(int e) {
        rear = (rear + 1) % MaxSize;
        count++;
        queue[rear] = e;
    }

    //isFull():Returns true if queue is full, else false.
    boolean isFull() {
        return (count == MaxSize);//optimized
    }

    //dequeue:Remove elements from front of queue
//it will increment front to refere next (front+1)
    int dequeue() {
        int temp = queue[front];
        front = (front + 1) % MaxSize;
        count--;
        return (temp);
        //return(queue(front++);
    }

    //isEmpty():Return true if it is empty; else false.
    boolean isEmpty() {
        return (count == 0);//optimized
    }

    void print_queue()//Printing of queue should be done in FIFO.
    {
        int i = front, c = 0;
        //i would print data.
        // c:will count data.
        while (c < count) {
            System.out.print(queue[i] + " - ");
            i = (i + 1) % MaxSize;
            c++;
        }
    }

    public static void main(String[] args) {
        int size, e, choice;

        CircularQueue obj = new CircularQueue(); // FIXED

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Queue:");
        size = sc.nextInt();

        obj.createQueue(size); // FIXED

        do {
            System.out.print("\nQueue Menu");
            System.out.print("\n==========");
            System.out.print("\n1.Enqueue");
            System.out.print("\n2.Dequeue");
            System.out.print("\n3.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (!obj.isFull()) {
                        System.out.print("\nEnter Data:");
                        e = sc.nextInt();
                        obj.enqueue(e); // enqueue
                        System.out.print("\n" + e + " Enqueued");
                    } else {
                        System.out.print("\nQueue Full");
                    }
                    break;

                case 2:
                    if (!obj.isEmpty()) {
                        System.out.print("\n" + obj.dequeue() + " Dequeued");
                    } else {
                        System.out.print("\nQueue Empty");
                    }
                    break;

                case 3:
                    if (!obj.isEmpty()) {
                        System.out.print("\nQueue has:\n");
                        obj.print_queue();
                    } else {
                        System.out.print("\nQueue Empty");
                    }
                    break;

                case 0:
                    System.out.print("\nExiting code......");
                    break;

                default:
                    System.out.print("\nInvalid choice");
                    break;
            }

        } while (choice != 0);
    }
}







