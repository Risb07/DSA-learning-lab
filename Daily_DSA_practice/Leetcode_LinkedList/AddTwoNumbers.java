package Daily_DSA_practice.Leetcode_LinkedList;

//   Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;

      ListNode() {
      }

      ListNode(int val) {
            this.val = val;
      }

      ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
      }
}

public class AddTwoNumbers {
      public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int n = 0;
            int n2 = 0;
            while (l1 != null) {
                  n = n * 10 + l1.val;
                  l1 = l1.next;
            }

            while (l2 != null) {
                  n2 = n2 * 10 + l2.val;
                  l2 = l2.next;
            }

            if(n != 0 && n2 != 0){
                  return new ListNode();
            }

            int x1 = 0;
            int num = n;
            while (num > 0) {
                  int k = num % 10;
                  x1 = x1 * 10 + k;
                  num = num / 10;
            }
            int x2 = 0;
            int num2 = n2;
            while (num2 > 0) {
                  int k = num2 % 10;
                  x2 = x2 * 10 + k;
                  num2 = num2 / 10;
            }
            // System.out.println(n);
            // System.out.println(x1);
            // System.out.println(n2);
            // System.out.println(x2);

            int res = x1 + x2;
            // System.out.println(res);
            ListNode head = null;

            while (res > 0) {
                  int i = res % 10;
                  // System.out.println(i);
                  ListNode node = new ListNode(i);
                  if (head == null) {
                        head = node;
                  } else {+
                        ListNode t = head;
                        while (t.next != null) {
                              t = t.next;
                        }
                        t.next = node;

                  }
                  res = res / 10;
            }

            return head;

      }

      public static void main(String[] args) {
            ListNode n3 = new ListNode(9);
            ListNode n2 = new ListNode(4, n3);
            ListNode l1 = new ListNode(2, n2);

            ListNode m4 = new ListNode(9);
            ListNode m3 = new ListNode(4, m4);
            ListNode m2 = new ListNode(6, m3);
            ListNode l2 = new ListNode(5, m2);

            ListNode sum = addTwoNumbers(l1, l2);

            while (sum != null) {
                  System.out.print(sum.val);
                  sum = sum.next;
            }
      }
}
