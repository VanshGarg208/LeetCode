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
    public ListNode mergeKLists(ListNode[] lists) {
        List <Integer> temp = new ArrayList<>();

        for (ListNode k : lists) {
            while (k != null) {
                temp.add(k.val);
                k = k.next;
            }
        }

        if (temp.size() == 0) return null;
        Collections.sort(temp);

        ListNode dummy = new ListNode(temp.get(0));
        ListNode curr = dummy;
        for (int i = 1; i < temp.size(); i++) {
            curr.next = new ListNode(temp.get(i));
            curr = curr.next;
        }

        return dummy;
    }
}