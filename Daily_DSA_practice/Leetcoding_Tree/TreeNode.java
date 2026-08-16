
/**94. Binary Tree Inorder Traversal 
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:

Input: root = [1,null,2,3]

Output: [1,3,2]
*/

package Daily_DSA_practice.Leetcoding_Tree;

import java.util.*;

/**
 * Definition for a binary tree node.
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {
      }

      TreeNode(int val) {
            this.val = val;
      }

      TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
      }
}

class BinaryTreeInorderTraversal {
      List<Integer> list = new LinkedList<>();

      public List<Integer> inorderTraversal(TreeNode root) {

            if (root != null) {

                  inorderTraversal(root.left);

                  list.add(root.val);

                  inorderTraversal(root.right);

            } else {
                  return list;
            }
            return list;
      }

}