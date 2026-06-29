package DSA_PGCPAC.Day2_LinkedList;
// Linear Linked List

import java.util.Scanner;

class Node{
      int data;
      Node next;
      Node(int data){
            this.data = data;
            this.next = null;
      }
}

public class LinkedListPractice{
      Node root;

      public  void insert_left(int data ){
            Node node = new Node(data);
            if(root == null){
            root = node;
            }else{
                  node.next = root;
                  root = node;      
            }
      }

            public  void insert_right(int data ){
            Node node = new Node(data);
            if(root == null){
            root = node;
            }else{
                  Node t = root;
                  while(t.next != null){
                        t=t.next;
                  }
                  t.next = node;        
            }
      }

      public  void print_list(){
            Node t = root;
            while(t != null){
                  System.out.print(" [ "+t.data+" ] "+"->");
                  t=t.next;
            }
            System.out.print("NULL");
      }
      public static void main(String[] args){
            Scanner sc =  new Scanner(System.in);    
            LinkedListPractice obj= new LinkedListPractice(); 
            obj.insert_left(10);
            obj.insert_left(20);
            obj.insert_right(30);
            obj.print_list();

      }
}