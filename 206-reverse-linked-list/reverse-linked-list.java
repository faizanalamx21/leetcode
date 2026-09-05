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
    public ListNode reverseList(ListNode head) {
        
        ListNode curr=head;//shuru m do pointer ek ko head p aur ek uskey just peechey that is null
        ListNode prev=null;
        while(curr!=null){
            ListNode sec=curr.next;//ye isliye use kr rhey ki jab current.next ko prev p point krnege tb current ko aagey nahi badha paynge isliye ismey initialize kr denge
            curr.next=prev;//arrow ko reverse
            prev=curr;//dono prev aur curr ko aagey badhaynge
            curr=sec;
        }
        return prev;//jab loop tutega to prev pointer revesed LL k head p hoga to usey return kra denge
    }
}