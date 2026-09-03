package Daily_DSA_practice.Leetcode_LinkedList;

import java.util.HashSet;

// Definition for singly-linked list.
class LinkedListNode {
      int val;
      LinkedListNode next;

      LinkedListNode() {
      }

      LinkedListNode(int val) {
            this.val = val;
      }

      LinkedListNode(int val, LinkedListNode next) {
            this.val = val;
            this.next = next;
      }
}

public class RemoveDuplicatesFromSortedList {

      public LinkedListNode deleteDuplicates(LinkedListNode head) {
            if (head == null) {
                  return head;
            }

            LinkedListNode node = head;
            LinkedListNode node2 = node.next;

            HashSet<Integer> set = new HashSet<>();

            set.add(head.val);

            while (node2 != null) {
                  if (set.contains(node2.val)) {
                        node.next = node2.next;
                        if (node2 != null)
                              node2 = node2.next;
                  } else {
                        set.add(node2.val);
                        node = node.next;
                        node2 = node2.next;
                  }
            }
            return head;
      }

      public static void main(String[] args) {

      }
}
