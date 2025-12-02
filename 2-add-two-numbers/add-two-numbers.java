/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(0);
      ListNode temp = dummy;
      
      ListNode p1 = l1;
      ListNode p2 = l2;
      int carry = 0;
      
      while (p1 != null || p2 != null || carry != 0) {
          int x = 0;
          int y = 0;
          
          if (p1 != null) x = p1.val;
          if (p2 != null) y = p2.val;
          
          int sum = x + y + carry;
          
          int digit = sum % 10;
          carry = sum / 10;
          
          if (p1 != null) p1 = p1.next;
          if (p2 != null) p2 = p2.next;
          
          temp.next = new ListNode(digit);
          temp = temp.next;
      }
      return dummy.next;
    }
}