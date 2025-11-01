/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public static int getLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        int m = getLen(headA);
        int n = getLen(headB);

        int diff = 0;
        if (m > n) {
            diff = m-n;
        }
        else if (m < n) {
            diff = n-m;
        }

        if (m > n) {
            for (int i = 0; i < diff; i++) {
                if (temp1 != null) {
                    temp1 = temp1.next;
                }
            }
        }

        else if (m < n) {
            for (int i = 0; i < diff; i++) {
                if (temp2 != null) {
                    temp2 = temp2.next;
                }
            }
        }

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
        
    }
}