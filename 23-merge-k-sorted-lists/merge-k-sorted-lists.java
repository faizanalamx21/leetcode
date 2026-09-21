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
import java.util.*;

class Solution {

    class Node {
        int value;
        int row;
        int col;

        Node(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> a.value - b.value
        );

        //  first node of every list  heap m daaaalenge
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(new Node(lists[i].val, i, 0));
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {

            Node node = pq.poll();

            // minimum nideb ko answer m daalnge
            curr.next = lists[node.row];
            curr = curr.next;

            //  next col of the value added in answer p move krnge
            lists[node.row] = lists[node.row].next;

            if (lists[node.row] != null) {
                pq.add(new Node(
                    lists[node.row].val,
                    node.row,
                    node.col + 1
                ));
            }
        }

        return dummy.next;
    }
}