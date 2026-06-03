// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.Stack;

// class StackPrac{
//       int tos, maxsize, stack[];

//       void createStack(int size){
//             tos = -1;
//             maxsize = size;
//             stack = new int[maxsize];
//       }

//       void push(int e ){
//             stack[++tos] = e;
//       }

//       int pop(){
//             return stack[tos--];
//       }

//       int peek(){
//             return stack[tos];
//       }

//       boolean isEmpty(){
//             if (tos == -1)
//                   return true;
//             else
//                   return false;
//       }

//       void print(){
//             System.out.print("stack  :  [ ");
//             for (int i = tos ; i >= 0 ; i--) {
//                   System.out.print(stack[i] + " , ");
//             }
//             System.out.print("] ");
//       }


// }

// public class MainClass {

//       public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter size of stack : ");
//             int size = sc.nextInt();
//             // Stack<Integer> stack = new Stack<>();
//             StackPrac stack = new StackPrac();
//             stack.createStack(size);

//             int choice = 1;
//             do {
//                   System.out.println("nEnter your choice:");
//                   System.out.println("Menu:");
//                   System.out.println("1.push");
//                   System.out.println("2.pop");
//                   System.out.println("3.peek");
//                   System.out.println("4.print");
//                   System.out.println("0.exit");
//                   choice = sc.nextInt();

//                   switch (choice) {
//                         case 1:
//                               System.out.print("enter element:");
//                               stack.push(sc.nextInt());
//                               break;
//                         case 2:
//                               if (!stack.isEmpty())
//                                     System.out.println("element popped: " + stack.pop());
//                               else
//                                     System.out.println("stack is empty");
//                               break;
//                         case 3:
//                               if (!stack.isEmpty())
//                                     System.out.println("element at peek: " + stack.peek());
//                               else
//                                     System.out.println("stack is empty");
//                               break;
//                         case 4:
//                               if (!stack.isEmpty())
//                                     // System.out.println("stack : " + stack.toString());
//                                     stack.print();
//                               else
//                                     System.out.println("stack is empty");
//                               break;
//                         case 0:
//                               System.out.println("exiting stack menu . ");
//                               break;
//                         default:
//                               System.out.println("invalid choice .");
//                               break;
//                   }

//             } while (choice != 0);
//             sc.close();
//       }
// }

// import java.util.Scanner;
// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.PriorityQueue;
// import java.util.Queue;

// class QueuePrac{
//       int rear,front,maxsize,queue[];

//       void createQueue(int size){
//             rear = -1;
//             front = 0;
//             maxsize = size;
//             queue = new int[maxsize];
//       }

//       void add(int e){
//             queue[++rear]=e;
//       }  

//       int poll(){
//             return queue[front++];
//       }
      
//       int peek(){
//             return queue[front];
//       }

//       void print(){
//             System.out.println(" [ ");
//             for (int i = front ; i <maxsize ; i++ ){
//                   System.out.print(queue[i]+" , ");
//             }
//             System.out.println("]");
//       }
      
//       boolean isEmpty(){
//             if(front > rear)
//                   return true;
//             else
//                   return false;
//       }
      
// }

// public class MainClass {

//       public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             // System.out.print("Enter size of queue : ");
//             // int size = sc.nextInt();
//             // Queue<Integer> queue = new ArrayDeque<>();
//             // Queue<Integer> queue = new LinkedList<>();
//             Queue<Integer> queue = new PriorityQueue<>();
//             // QueuePrac queue = new QueuePrac();
//             // queue.createQueue(size);

//             int choice = 1;

//             do {
//                   System.out.println("nEnter your choice:");
//                   System.out.println("Menu:");
//                   System.out.println("1.add");
//                   System.out.println("2.poll");
//                   System.out.println("3.peek");
//                   System.out.println("4.print");
//                   System.out.println("0.exit");
//                   choice = sc.nextInt();

//                   switch (choice) {
//                         case 1:
//                               System.out.print("enter element:");
//                               queue.add(sc.nextInt());
//                               break;
//                         case 2:
//                               if (!queue.isEmpty())
//                                     System.out.println("element polled: " + queue.poll());
//                               else
//                                     System.out.println("queue is empty");
//                               break;
//                         case 3:
//                               if (!queue.isEmpty())
//                                     System.out.println("element at peek: " + queue.peek());
//                               else
//                                     System.out.println("queue is empty");
//                               break;
//                         case 4:
//                               if (!queue.isEmpty())
//                                     System.out.println("queue : " + queue.toString());
//                               // queue.print();
//                               else
//                                     System.out.println("queue is empty");
//                               break;
//                         case 0:
//                               System.out.println("exiting queue menu . ");
//                               break;
//                         default:
//                               System.out.println("invalid choice .");
//                               break;
//                   }

//             } while (choice != 0);
//             sc.close();
//       }
// }

// import java.util.Scanner;

// class Node{
//       int data ;
//       Node right;
//       Node left;
//       Node(int data){
//             this.data = data;
//             right = null;
//             left = null;
//       }
// }

// class TreePract {
//       Node root;

//       Node insert(Node root, Node node) {
//             if (root == null) {
//                   return node;
//             }

//             if (node.data < root.data) {
//                   root.left = insert(root.left, node);
//             } else {
//                   root.right = insert(root.right, node);
//             }
//             return root;
//       }

//       void inorder(Node root) {
//             if (root != null) {

//                   inorder(root.left);
//                   System.out.println(root.data + " ");
//                   inorder(root.right);
//             }
//       }

//       void postorder(Node root) {
//             if (root != null) {

//                   postorder(root.left);
//                   postorder(root.right);
//                   System.out.println(root.data + " ");

//             }
//       }

//       void preorder(Node root) {
//             if (root != null) {

//                   System.out.println(root.data + " ");
//                   preorder(root.left);
//                   preorder(root.right);
//             }
//       }

//       int count_nodes(Node root) {
//             if (root == null) {
//                   return 0;
//             } else {
//                   return count_nodes(root.left) + count_nodes(root.right) + 1;
//             }
//       }

//       int count_leafs(Node root) {
//             if (root == null)
//                   return 0;

//             if (root.left == null && root.right == null)
//                   return 1;

//             return count_leafs(root.left) + count_leafs(root.right);

//       }

//       int height(Node root) {
//             if (root == null)
//                   return 0;
//             int leftHeight = height(root.left);
//             int rightHeight = height(root.right);

//             return Math.max(leftHeight, rightHeight) + 1;
//       }
// }

// class MainClass {
//       public static void main(String[] args) {
//             TreePract obj = new TreePract();
//             int choice;
//             Scanner sc = new Scanner(System.in);

//             do {
//                   System.out.println("Menu..........");
//                   System.out.println("1.Insert");
//                   System.out.println("2.Inorder");
//                   System.out.println("3.Postorder");
//                   System.out.println("4.Preorder");
//                   System.out.println("5.count_nodes");
//                   System.out.println("6.count_leaf_nodes");
//                   System.out.println("7.height of tree");
//                   System.out.println("0.exit");
//                   System.out.println("Enter choice. : ");
//                   choice = sc.nextInt();

//                   switch (choice) {
//                         case 1:
//                               System.out.print("enter node data ");
//                               int n = sc.nextInt();
//                               obj.root = obj.insert((obj.root), new Node(n));
//                               break;
//                         case 2:
//                               System.out.print("inorder  : ");
//                               obj.inorder(obj.root);
//                               break;
//                         case 3:
//                               System.out.print("postorder  : ");
//                               obj.postorder(obj.root);
//                               break;
//                         case 4:
//                               System.out.print("preorder  : ");
//                               obj.preorder(obj.root);
//                               break;
//                         case 5:
//                               System.out.println("node of tree   :  " + obj.count_nodes((obj.root)));
//                               break;
//                         case 6:
//                               System.out.println("leafs of tree  :  " + obj.count_leafs(obj.root));
//                               break;
//                         case 7:
//                               System.out.println("height of tree   :   " + obj.height(obj.root));
//                               break;
//                         case 0:
//                               System.out.println("Exiting tree menu...");
//                               break;

//                         default:
//                               System.out.println("Invalid Choice");
//                               break;
//                   }

//             } while (choice != 0);

//       }
// }

// import java.util.Deque;
// import java.util.LinkedList;

// class DNode{
//       int data ;
//       DNode prev ;
//       DNode next ;

//       DNode(int data){
//             this.data = data;
//             prev = next  = null;
//       }
// }

// class DoublyLinkedList {

//       DNode root;

//       void addFirst(DNode node) {
//             if (root == null) {
//                   root = node;
//                   root.next = root;
//                   root.prev = root;
//             } else {
//                   DNode last = root.prev;
//                   node.next = root;
//                   node.prev = last;

//                   root.prev = node;
//                   last.next = node;

//                   root = node;
//             }
//       }

//       void addLast(DNode node) {
//             if (root == null) {
//                   root = node;
//                   root.next = root;
//                   root.prev = root;
//             } else {
//                   DNode t = root;
//                   while (t.next != root) {
//                         t = t.next;
//                   }
//                   root.prev = node;
//                   node.next = root;
//                   t.next = node;
//                   node.prev = t;
//             }
//       }

//       // DNode unlink(DNode node){

//       // }

//       void printList() {

//             DNode t = root;

//             do {
//                   System.out.print(" | " + t.data + " | <->");
//                   t = t.next;
//             } while (t != root);
//             System.out.print(" root");
//       }

//       void insertAfter(int data, int data)

      
// }

//       public class MainClass {
//             public static void main(String[] args) {
//                   // Deque<Integer> list = new LinkedList<>();
//                   DoublyLinkedList list = new DoublyLinkedList();
//                   list.addFirst(new DNode(10));
//                   list.addFirst(new DNode(20));
//                   // list.addLast(new DNode(20));
//                   list.printList();
//             }
// }

// import java.util.Arrays;

// public class MainClass {

//       public static void bubbleSort(int arr[]) {
//             int n = arr.length;
//             for (int i = n - 1; i > 0; i--) {
//                   for (int j = 0; j < i; j++) {
//                         if (arr[j] > arr[j + 1]) {
//                               int temp = arr[j];
//                               arr[j] = arr[j + 1];
//                               arr[j + 1] = temp;
//                         }
//                   }
//             }
//       }

//       public static void insertionSort(int[] arr) {
//             int i, j, new_element;
//             for (i = 0; i < arr.length - 1; i++) {
//                   new_element = arr[i + 1];
//                   j = i + 1;
//                   while (j > 0 && arr[j - 1] > new_element) {
//                         arr[j] = arr[j - 1];
//                         j--;
//                   }
//                   arr[j] = new_element;
//             }
//       }

//       public static void quickSort(int arr[], int start, int end) {
//             int i, j, pivot;
//             i = start;
//             j = end;
//             pivot = start;
//             while (i < j) {
//                   while (arr[j] > arr[pivot]) {
//                         j--;
//                   }
//                   if (i < j) {
//                         int temp = arr[pivot];
//                         arr[pivot] = arr[j];
//                         arr[j] = temp;
//                   }
//                   if (i < end) {
//                         quickSort(arr, start + 1, end);
//                   }
//             }
//       }

//       static void selection_sort(int a[]) {
//             int i, j, min_element, position;
//             for (i = 0; i < a.length - 1; i++)// gives n-1 passes
//             {
//                   min_element = a[i];
//                   position = i;
//                   for (j = i + 1; j < a.length; j++)// j goes to end
//                   {
//                         if (a[j] < min_element) {
//                               min_element = a[j];
//                               position = j;
//                         }
//                   } // j
//                     // SWAP I TH WITH MIN
//                   a[position] = a[i];
//                   a[i] = min_element;
//             }
//       }

//     static void selection_sort(int a[])
// {
//       int i , j, minelement, posisiton;
//       for(i = 0 ; i < a.length -1 ; i++){
//             minelement = a[i];
//             posisiton = i ;
//             for(j = i+1; j < a.length -1 ; j++){
//                   if(a[j] < minelement){
//                         minelement = a[j];
//                         posisiton = j ; 
//                   }
//             }
//             a[i] = minelement;
//             a[posisiton] = a[i]
// }
// }

// public static void QuickSort(int a[] , int start , int end ){
//       int i , j , pivot;
//       i = start;
//       pivot =start ;
//       j = end ;

//       while(i<j){
//             while(a[j]>a[pivot])
//                   j--;
//             if(i<j){
//                   int temp = a[pivot];
//                   a[pivot] = a[j]
//                   a[j]=temp;
//             }
//       }
//       if(i<end){
//             QuickSort(a , start +1 , end );
//       }
// }

//       public static void main(String[] args) {

//             int arr[] = { 1, 2, 3, 4, 1, 23, 4, 5 };
//             int a[] = { 5, 3, 1, 8 };
//             int arr3[] = { 5, 3, 1, 8, 6 };
//             bubbleSort(arr);
//             insertionSort(a);
//             quickSort(arr3, 0, 4);
//             System.out.println("bubbleSort" + Arrays.toString(arr));
//             System.out.println("insertionSort" + Arrays.toString(a));
//             System.out.println("quickSort" + Arrays.toString(arr3));

//       }
// }




// package Linked_List_Examples;

// import java.util.Scanner;
// import java.util.Stack;

// public class Linear_Linked_List_Class

// {

//    Node root;//all opeartions done by/on root



//    void insert_left(int data)

//    {

//        Node n=new Node(data);//create a node

//        if(root==null)//only 1st time

//            root=n;

//        else

//        {

//            n.next=root;//1

//            root=n;//2

//        }



//    }

//    void insert_right(int data)

//    {

//        Node n=new Node(data);//create a node

//        if(root==null)//only 1st time

//            root=n;

//        else

//        {

//            Node t=root;//1 start from root

//            while(t.next!=null)//2 move to right most

//                t=t.next;

//            t.next=n;//3 connected

//        }

//    }

//    void delete_left()

//    {

//        if(root==null)

//            System.out.print("nEmpty List");

//        else

//        {

//            Node t=root;//1

//            root=root.next;//2

//            System.out.print("n|"+t.data+"|-> deleted");

//            //The printing simply prints what is deleted but

//            // AGC will physically delete once method is over

//        }

//    }

//    void delete_right()

//    {

//        if(root==null)

//            System.out.print("nEmpty List");

//        else

//        {

//            Node t,t2;

//            t=t2=root;//1

//            if(root.next==null)//single node

//                root=null;//manual deletion

//            else

//            {

//                while(t.next!=null)//2

//                {

//                    t2=t;

//                    t=t.next;

//                }



//                t2.next=null;//3

//            }

//            System.out.print("n|"+t.data+"|-> deleted");

//        }

//    }

//    void print_list()

//    {

//        if(root==null)

//            System.out.print("nList Empty");

//        else

//        {

//            Node t=root;

//            while(t!=null)

//            {

//                System.out.print("|"+t.data+"|->");

//                t=t.next;

//            }

//            System.out.print("NULL");

//        }

//    }

//    void search_list(int key)//key is element to search

//    {

//        if(root==null)

//            System.out.print("nList Empty");

//        else

//        {

//            Node t=root;

//            while(t!=null)

//            {

//                if(t.data==key)

//                {

//                    System.out.print("n"+key+" found in list");

//                    return;

//                }

//                t=t.next;

//            }

//            System.out.print("n"+key+" not found in list");

//        }

//    }

//    void insert_after(int ref,int e)//key is element to search

//    {

//        if(root==null)

//            System.out.print("nList Empty");

//        else

//        {

//            Node t=root;

//            while(t!=null)

//            {

//                if(t.data==ref)

//                {

//                    System.out.print("n"+ref+" found in list");

//                    //found

//                    Node n=new Node(e);//element

//                    n.next=t.next;//1

//                    t.next=n;//2

//                    return;

//                }

//                t=t.next;

//            }

//            System.out.print("n"+ref+" not found in list");

//        }

//    }

//    void delete_element(int e)//e if found will be deleted.

//    {

//        if(root==null)

//            System.out.print("nList Empty");

//        else

//        {

//            Node t=root;

//            Node t2=root;

//            while(t!=null)

//            {

//                if(t.data==e)

//                {

//                    System.out.print("n"+e+" found in list");

//                    //found nd now search for case

//                    if(t==root)//case 1

//                        root=root.next;

//                    else if(t.next==null)//case 2

//                        t2.next=null;

//                    else//case 3

//                        t2.next=t.next;//re refering to next

//                    System.out.print("n"+t.data+" deleted");

//                    return;



//                }

//                t2=t;

//                t=t.next;



//            }

//            System.out.print("n"+e+" not found in list");

//        }

//    }



//    public static void main(String[] args)

//    {

//        Scanner sc = new Scanner(System.in);

//        Linear_Linked_List_Class obj = new Linear_Linked_List_Class();



//        int choice = 0, data, key, ref;



//        do

//        {

//            System.out.print("nn===== Linked List Menu =====");

//            System.out.print("n1. Insert Left");

//            System.out.print("n2. Insert Right");

//            System.out.print("n3. Delete Left");

//            System.out.print("n4. Delete Right");

//            System.out.print("n5. Print List");

//            System.out.print("n6. Search Element");

//            System.out.print("n7. Insert After Element");

//            System.out.print("n8. Delete Specific Element");

//            System.out.print("n0. Exit");

//            System.out.print("nEnter choice: ");



//            choice = sc.nextInt();



//            switch(choice)

//            {

//                case 1:

//                    System.out.print("Enter data: ");

//                    data = sc.nextInt();

//                    obj.insert_left(data);

//                    break;



//                case 2:

//                    System.out.print("Enter data: ");

//                    data = sc.nextInt();

//                    obj.insert_right(data);

//                    break;



//                case 3:

//                    obj.delete_left();

//                    break;



//                case 4:

//                    obj.delete_right();

//                    break;



//                case 5:

//                    obj.print_list();

//                    break;



//                case 6:

//                    System.out.print("Enter element to search: ");

//                    key = sc.nextInt();

//                    obj.search_list(key);

//                    break;



//                case 7:

//                    System.out.print("Enter reference element: ");

//                    ref = sc.nextInt();

//                    System.out.print("Enter new element: ");

//                    data = sc.nextInt();

//                    obj.insert_after(ref, data);

//                    break;



//                case 8:

//                    System.out.print("Enter element to delete: ");

//                    data = sc.nextInt();

//                    obj.delete_element(data);

//                    break;



//                case 0:

//                    System.out.print("nExiting... Career Credentials Mode OFF 🚀");

//                    break;



//                default:

//                    System.out.print("nInvalid choice. Try again.");

//            }



//        } while(choice != 0);

//    }





// }

// class Node{
//     int data ;
//     Node next ;
//     Node(int data){
//         this.data = data;
//         next=null;
//     }
// }


// public class Linked_List{
//     Node root ;

//     public void insertleft(int data){
//         Node node  =  new Node(data);

//         if (root == null) {
//             root = node;
//         }
//         node.next = root;
//         root = node;
//     }

//     public void insertright(int data){
//         Node node = new Node(data);

//         if(root == null)
//             root = node;
//         Node t = root;
//         while(t != null){
//             t = t.next;
//         }
//         t.next = node;
//     }

//     public void  deleteleft(){
//         if (root == null) {
//              System.out.println("Empty list");
//         }else{
//         Node t = root;
//         root = root.next;
//         System.out.println("| "+t.data+" | deleted." );
//     }
        
//     }

//     public void deleteright(){
    
//         if(root == null){
//             System.out.println("Empty list");
//         }else{
//             if(root.next == null){
//                 root = null;
//                 System.out.println("deleted single node list.");
//             }else{
//                 Node t2 = t = root;
//                 while(t.next == null){
//                     t2 = t;
//                     t = t.next;
//                 }
//                 System.out.println("deleted right node "+t.data);
//             }
//         }

//     }

//     public void printlist(){
//         if ( root == null){
//             System.out.println("empty list");
//         }else{

//             Node t = root;
//             while (t == null) {
//                 System.out.print("| "+t.data+" |->");
//                 t = t.next;
//             }
//             System.out.print("null");
//         }
//     }

//     public void search_list(int key){
//         if ( root == null){
//             System.out.println("empty list");
//         }else{
//             Node t = t2 =  root;
//             while(t != null){
//                 t2 = t ;
//             if (t.data == root) {
//                 System.out.print("key " + key + " found in list after node "+t2.data);
//                 return;
//             }
            
//             t = t.next;
//         }
//         System.out.print("key " + key +" not found in list ");
//         }
//     }


//     void insertafter(int ref, int data ){
//         if(root == null){
//             System.out.println("empty list");
//         }else{
//             Node t = t2 = root;
//             while( t != null){
             
//                 if( t.data == ref){
//                     System.out.println("found in list.");
//                     Node node  =  new Node(data);
//                     t.next = node;
//                     return;
//                 }
//                 t = t.next;
//             }
//         }
//     }

//     void deleteelement(int e){
//         if (root == null) {
//             System.out.println("empty list");
//         }else{
//             Node t= t2 = root;
//             while (t!= null) {
//                 if (t.data == e){
//                     System.out.println("element " +e+" found in list ");
//                     if ( t == root){ 
//                         root = t.next;
//                     }else if(t.next == null){
//                         t2.next = null ;
//                     }else{
//                         t2.next = t.next;
//                     }
//                     System.out.print("n"+t.data+" deleted");
//                     return;
                
//                 }
//                 t2 = t;
//                 t=t.next;
//             }
//             System.out.print("n"+e+" not found in list");

//         }
//     }
    
//     public static void main(String [] args ){
//             Scanner sc = new Scanner(System.in);

//             int choice;
//             do{

//             }while(choice != 0);
//     }
// }

// class Check{


//     boolean wellnessCheck(int arr[]){

//         Stack<Integer> stack  =  new Stack<>();
//         char ch  = "" ;

//         for( int i = 0 ; i <arr.length ; i++){

//             if( arr[i] == '{' || arr[i] == "[" || arr[i] == "(" ){

//                 stack.push(arr[i]);

//             }else if (arr[i] == '}' || arr[i] == "]" || arr[i] == ")"){

//                 if ( stack.isEmpty()){
//                     return false;
//                 }

//                 ch = stack.pop();

//             }
//             if((ch == "{" && arr[i] !=  "}") || (ch == "[" && arr[i] != "]") || (ch == "(" && arr[i] != ")")){

//                 return false;
            
//             }
//         }
//         return stack.isEmpty();

//     }






// }


class MainClass{



      static void merge_sort(int a[],int start,int end)

      {
      if(start<end)
      {
            int mid=(start+end)/2;

            merge_sort(a,start,mid);

            merge_sort(a,mid+1,end);

            merger(a,start,mid,end);
      }

      }
      static void merger(int a[],int start,int mid,int end)

      {

            int i,j;

            int temp[]=new int[a.length];

            int t_index=start;

            //set

            i=start;

            j=mid+1;

            t_index=start;

            while(i<=mid && j<=end)

            {

            if(a[i]<a[j])

                  temp[t_index++]=a[i++];

            else

                  temp[t_index++]=a[j++];

            }

            while(i<=mid)

            temp[t_index++]=a[i++];

            while(j<=end)

            temp[t_index++]=a[j++];

            for(i=start;i<=end;i++)//copy back to a

            a[i]=temp[i];

      }



      public static void main(String[] args) {

       int a[]={33,11,99,88,55,66,77,22,44};

       System.out.println("Initially Array is:"+Arrays.toString(a));



      

       System.out.println("After Sort Array is:"+Arrays.toString(a));

   }



}
