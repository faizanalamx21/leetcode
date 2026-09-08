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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int n = 0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        k = k % n;

        if (k == 0) {
            return head;
        }

        
        ListNode curr = head;

        while (curr.next != null) {//last node ko head s join kr dega
            curr = curr.next;
        }

        curr.next = head;

        
        curr = head;

        for (int i = 1; i < n - k; i++) {//n-k node k next nulll krdenge aur n-k+1 node ko head bana denge
            curr = curr.next;
        }

        
        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}