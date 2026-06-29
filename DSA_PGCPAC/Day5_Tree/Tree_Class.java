// package Tree_Examples;

import java.util.Scanner;
public class Tree_Class {
    private Node root;

    // INSERT
    Node insert(Node r, Node n) { // r is the root n is the new node
        if (r == null) { //if root is null
            return n;
        }

        if (n.data < r.data) { // if node data is smaller than root data 
            r.left = insert(r.left, n);  // will be inserting on left of root but agar left me koi node hai, agar vo smaller hai then go to left recursively and insert.
        } else {
            r.right = insert(r.right, n); //else if node is greater then and equal to then check recursively all right nodes and insert it.
        }

        return r;
    }

    // INORDER (LNR)  L
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

    int count_leaf_nodes(Node r)
    {
        if (r==null)
            return 0;
        if(r.left == null & r.right == null){
            return 1;
        }
            return count_leaf_nodes(r.left)+count_leaf_nodes(r.right);
        
    }

    int height(Node r) {
        if (r == null)
            return 0;
        int left_length=height(r.left);
        int right_length=height(r.right);
        return Math.max(left_length,right_length)+1; // 1+ 
    }

    list diameter(Node r){
        if ( r == null)
            leaf = r
            list.add(leaf.data);
        int left_length=diameter(r.left);
        int right_length=diameter(r.right);
         list.add(r.right)
    }

    // MAIN MENU
    public static void main(String[] args) {
        Tree_Class obj = new Tree_Class();
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Inorder");
            System.out.println("3. Preorder");
            System.out.println("4. Postorder");
            System.out.println("5. Count Nodes");
            System.out.println("6. Count Leafs");
            System.out.println("7. Height");
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
                    System.out.print("Total leafs in tree:"+obj.count_leaf_nodes(obj.root));
                    System.out.println();
                case 7:
                    System.out.print("Height of tree:"+obj.tree_height(obj.root));
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}

