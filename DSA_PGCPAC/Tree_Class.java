package DSA_PGCPAC;

// import java.util.Scanner;

// public class Graph_Class {

//     int v, visited[], g[][];

//     //v number of nodes

//     //g is Adjacency matrix of v x v

//     //visited[i] is 1: node i is visited     0:node i is not visited



//     void createGraph(int nodes) {

//         v = nodes;

//         Scanner in = new Scanner(System.in);

//         g = new int[v][v];//adj mat

//         visited = new int[v];//visited array

//         for (int i = 0; i < v; i++)//source

//         {

//             for (int j = 0; j < v; j++)//dest

//             {

//                 System.out.println("Enter value for v" + i + " to v" + j + " (999 for infinity):");

//                 g[i][j] = in.nextInt();



//             }

//         }

//     }



//     void printG() {

//         for (int i = 0; i < v; i++) {

//             for (int j = 0; j < v; j++) {

//                 System.out.print(g[i][j] + "t");

//             }

//             System.out.println();//next line

//         }

//     }



//     public void resetvisited() {

//         for (int i = 0; i < v; i++) {

//             visited[i] = 0;//unvisited 0 and 1 means visited

//         }



//     }



//     public void DFS(int source) {

//         visited[source] = 1;

//         System.out.println("V" + source);

//         for (int i = 0; i < v; i++) {

//             if (g[source][i] == 1 && visited[i] != 1)

//             //neighbour and unvisited
            
//             {

//                 DFS(i);

//             }

//         }

//     }



//     public void BFS(int source) {

//         int q[] = new int[v];

//         int front = 0, rear = -1;

//         visited[source] = 1;

//         q[++rear] = source;//enqueue

//         while (front <= rear)//not empty

//         {

//             int element = q[front++];//dequeue

//             System.out.print("V" + element + "-");



//             for (int i = 0; i < v; i++) {

//                 if (g[element][i] == 1 && visited[i] != 1)//neighbour and unvisited

//                 {

//                     visited[i] = 1;//visited

//                     q[++rear] = i;//enqueue

//                 }

//             }

//         }

//     }



//     public static void main(String args[]) {

//         Graph_Class obj = new Graph_Class();

//         obj.createGraph(4);

//         obj.printG();

//        // obj.resetvisited();

//         System.out.println("DFS");

//         obj.DFS(0);

//         /*obj.resetvisited();

//         System.out.println("BFS");

//         obj.BFS(0);*/



//     }

// }

// class Node{
//     private int data ;
//     Node next;
//     Node(int data){
//         this.data = data;
//         next = null;
//     }
// }


// class DNode{
//     private int data ;
//     private Node next;
//     private Node prev;

//     DNode(int data){
//         this.data = data ;
//         next = null;
//         prev = null; 

//     }
// }

// LinkedList<Integer> list = new LinkedList<>() ;







import java.util.Scanner;

public class Tree_Class {

   private Node root;



   // INSERT

   Node insert(Node r, Node n) {

       if (r == null) {

           return n;

       }



       if (n.data < r.data) {

           r.left = insert(r.left, n);

       } else {

           r.right = insert(r.right, n);

       }

       return r;

   }



   // INORDER (LNR)

   void inorder(Node r) {

       if (r != null) {

           inorder(r.left);

           System.out.print(r.data + " ");

           inorder(r.right);

       }

   }



   // PREORDER (NLR)

   void preorder(Node r) {

       if (r != null) {

           System.out.print(r.data + " ");

           preorder(r.left);

           preorder(r.right);

       }

   }



   // POSTORDER (LRN)

   void postorder(Node r) {

       if (r != null) {

           postorder(r.left);

           postorder(r.right);

           System.out.print(r.data + " ");

       }

   }



   int count_nodes(Node r)

   {

       if (r==null)

           return 0;

       else

           return count_nodes(r.left)+count_nodes(r.right)+1;

   }



   int count_leaf_nodes(Node r) {

       if (r == null)

           return 0;

       if(r.left==null && r.right==null)

           return 1;

       return count_leaf_nodes(r.left)+count_leaf_nodes(r.right);

   }

   int height(Node r) {

       if (r == null)

           return 0;

       int left_length=height(r.left);

       int right_length=height(r.right);

       return Math.max(left_length,right_length)+1;

   }



   // MAIN MENU

   public static void main(String[] args) {

       Tree_Class obj = new Tree_Class();

       Scanner sc = new Scanner(System.in);

       int choice, value;



       do {

           System.out.println("n--- MENU ---");

           System.out.println("1. Insert");

           System.out.println("2. Inorder");

           System.out.println("3. Preorder");

           System.out.println("4. Postorder");

           System.out.println("5. Count Nodes");

           System.out.println("6. Count Leaf Nodes");

           System.out.println("7. Height Of Tree");

           System.out.println("0. Exit");

           System.out.print("Enter choice: ");



           choice = sc.nextInt();



           switch (choice) {

               case 1:

                   System.out.print("Enter value: ");

                   value = sc.nextInt();

                   obj.root = obj.insert(obj.root, new Node(value));

                   break;



               case 2:

                   System.out.print("Inorder: ");

                   obj.inorder(obj.root);

                   System.out.println();

                   break;



               case 3:

                   System.out.print("Preorder: ");

                   obj.preorder(obj.root);

                   System.out.println();

                   break;



               case 4:

                   System.out.print("Postorder: ");

                   obj.postorder(obj.root);

                   System.out.println();

                   break;

               case 5:

                   System.out.print("Total nodes in tree:"+obj.count_nodes(obj.root));

                   System.out.println();

                   break;

               case 6:

                   System.out.print("Total leaf nodes in tree:"+obj.count_leaf_nodes(obj.root));

                   System.out.println();

                   break;

               case 7:

                   System.out.print("Height of tree is:"+(obj.height(obj.root)-1));

                   System.out.println();

                   break;

               case 0:

                   System.out.println("Exiting...");

                   break;



               default:

                   System.out.println("Invalid choice!");

           }

       } while (choice != 0);

   }

}





