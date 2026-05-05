// package Tree_Examples;

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

    int count_leaf_nodes(Node r)
    {
        if (r==null)
            return 0;
        if(r.left == null & r.right == null){
            return 1;
        }
            return count_leaf_nodes(r.left)+count_leaf_nodes(r.right);
        
    }

    int tree_height(Node r){
        
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

