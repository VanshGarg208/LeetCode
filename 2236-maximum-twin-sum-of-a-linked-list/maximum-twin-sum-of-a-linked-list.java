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

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = reverse(slow.next);
        ListNode p1 = head;
        ListNode p2 = temp;

        while (p2 != null) {
            int sum = p1.val + p2.val;
            if (max < sum) {
                max = sum;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;

    }
}