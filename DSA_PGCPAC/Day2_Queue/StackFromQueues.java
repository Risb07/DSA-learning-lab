package Queue_Examples;

import java.util.Scanner;

public class StackFromQueues {
    int front1, rear1, front2, rear2, maxSize;
    int[] queue1, queue2;

    void createQueues(int size) {
        maxSize = size;
        queue1 = new int[maxSize];
        queue2 = new int[maxSize];
        front1 = 0; rear1 = -1;
        front2 = 0; rear2 = -1;
    }

    void push(int e) {
        if (rear1 == maxSize - 1) {
            System.out.println("Stack Full");
            return;
        }
        queue1[++rear1] = e;
    }

    int pop() {
        if (isEmpty1()) {
            System.out.println("Stack Empty");
            return -1;
        }

        while (front1 < rear1) {
            queue2[++rear2] = queue1[front1++];
        }

        int last = queue1[rear1--];

  
        front1 = 0; rear1 = -1;

        while (!isEmpty2()) {
            queue1[++rear1] = queue2[front2++];
        }

        front2 = 0; rear2 = -1;

        return last;
    }

    int peek() {
        if (isEmpty1()) {
            System.out.println("Stack Empty");
            return -1;
        }

        while (front1 < rear1) {
            queue2[++rear2] = queue1[front1++];
        }

        int top = queue1[rear1]; 

        queue2[++rear2] = queue1[rear1--]; 

        front1 = 0; rear1 = -1;
        while (!isEmpty2()) {
            queue1[++rear1] = queue2[front2++];
        }
        front2 = 0; rear2 = -1;

        return top;
    }

    boolean isEmpty1() {
        return front1 > rear1;
    }

    boolean isEmpty2() {
        return front2 > rear2;
    }

    void printStack() {
        if (isEmpty1()) {
            System.out.println("Stack Empty");
            return;
        }
        for (int i = front1; i <= rear1; i++) {
            System.out.print(queue1[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackFromQueues stack = new StackFromQueues();
        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();
        stack.createQueues(size);

        int choice, e;
        do {
            System.out.println("\nStack Menu");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("0. Exit");
            System.out.print(": ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    e = sc.nextInt();
                    stack.push(e);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) System.out.println("Element popped: " + popped);
                    break;
                case 3:
                    int top = stack.peek();
                    if (top != -1) System.out.println("Element @ Peek: " + top);
                    break;
                case 4:
                    stack.printStack();
                    break;
                case 0:
                    System.out.println("Exiting code .. coded by Rishabh");
                    break;
                default:
                    System.out.println("Invalid option selected.");
                    break;
            }
        } while (choice != 0);
    }
}
