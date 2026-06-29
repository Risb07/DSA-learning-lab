// Implement double stack in a single array, operated from either side.

// package Stack_Example;

import java.util.Scanner;
import java.util.Stack;

class TwoStack{
      private int tos1, tos2, Maxsize, stack[];

      void create_stack(int size)
      {
        tos1=-1;
        tos2=size;
        Maxsize=size;
        stack=new int[Maxsize];
        System.out.println("tos1: "+tos1);
      }

      void push1(int num){
            stack[++tos1] = num;
      }

      void push2(int num){
            stack[--tos2] = num;
      }
      
      int pop1(){
            return stack[tos1--] ;
      }

      int pop2(){
            return stack[tos2++];
      }
      int peek1(){
            return stack[tos1] ;
      }

      int peek2(){
            return stack[tos2];
      }

      boolean isEmpty1(){
        return tos1 == -1;
      }

      boolean isEmpty2(){
        return tos2 == Maxsize;
      }

      void print1(){
        for(int i = tos1 ; i>=0 ; i--){
          System.out.print("\n"+stack[i]);
        }
      }
      
      void print2(){
        for(int i = tos2 ; i<Maxsize ; i++){
          System.out.print("\n"+stack[i]);
        }
      }

      boolean isFull(){
        if(tos1 + 1 == tos2){
            return true;
        }else{
            return false;
        }
      }

      void printArray(){
        for(int i = Maxsize-1 ; i>=0 ; i--){
            System.out.print("\n"+stack[i]);
        }
      }

    public static void main(String args[]){
      
        Scanner sc=new Scanner(System.in);
        TwoStack obj=new TwoStack();
        System.out.print("\nEnter size of stack:");
        int size=sc.nextInt();
        int choice=0, e;
        obj.create_stack(size);
      do
        {
            System.out.print("\n\nStack Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Push1");
            System.out.print("\n2.Push2");
            System.out.print("\n3.Pop1");
            System.out.print("\n4.Pop2");
            System.out.print("\n5.Peek1");
            System.out.print("\n6.Peek2");
            System.out.print("\n7.Print1");
            System.out.print("\n8.Print2");
            System.out.print("\n9.Print Array");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    if(!obj.isFull()) 
                    {
                        System.out.print("\nEnter element to push1:");
                        e=sc.nextInt();
                        obj.push1(e); 
                    }
                    else
                    {
                        System.out.print("\nStack1 Full");
                    }
                    break;
                case 2:
                    if(!obj.isFull())
                    {
                        System.out.print("\nEnter element to push2:");
                        e=sc.nextInt();
                        obj.push2(e);
                    }
                    else
                    {
                        System.out.print("\nStack2 Full");
                    }
                    break;
                case 3:
                    if(!obj.isEmpty1())
                    {
                        System.out.print("\nElement poped from stack1:"+obj.pop1());
                    }
                    else
                    {
                        System.out.print("\nStack1 Empty");
                    }
                    break;
                case 4:
                    if(!obj.isEmpty2())
                    {
                        System.out.print("\nElement poped from stack2:"+obj.pop2());
                    }
                    else
                    {
                        System.out.print("\nStack2 Empty");
                    }
                    break;
                case 5:
                     if(!obj.isEmpty1())
                    {
                        System.out.print("\nElement @ Peek:"+obj.peek1());
                    }
                    else
                    {
                        System.out.print("\nStack1 Empty");
                    }
                    break;

                case 6:
                    if(!obj.isEmpty2())
                    {
                        System.out.print("\nElement @ Peek:"+obj.peek2());
                    }
                    else
                    {
                        System.out.print("\nStack2 Empty");
                    }
                    break;
                case 7:
                    if(!obj.isEmpty1())
                    {
                        System.out.print("\nElements on Stack1. \n");
                        obj.print1();
                    }
                    else
                    {
                        System.out.print("\nStack1 Empty");
                    }
                    break;
                case 8:
                    if(!obj.isEmpty2())
                    {
                        System.out.print("\nElements on Stack2. \n");
                        obj.print2();
                    }
                    else
                    {
                        System.out.print("\nStack2 Empty");
                    }
                    break;
                case 9:
                    if(!(obj.isEmpty1() && obj.isEmpty2()))
                    {
                        System.out.print("\nElements on Array. \n");
                        obj.printArray();
                    }
                    else
                    {
                        System.out.print("\nArray is Empty");
                    }
                    break;
                case 0:
                    System.out.print("\nExiting code .. coded by Rishabh Angure.");
                    break;
                default:
                    System.out.print("\nInvalid option selected.");
                    break;
            }
        }while(choice!=0);
      }
}