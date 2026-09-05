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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode t=head;
        ListNode before=null;
        int pos=1;
        while(t!=null){
            if(pos!=left){//issey hm before pointer ko left postion k pehley tk lejyega taaaki last m connection build krney ko
                before=t;
                t=t.next;
                pos++;
                continue;
            }
            ListNode curr=t;
            ListNode prev=null;
            int times=right-left+1;//itney times reverse operation lagaynge
            while(times-->0){
                ListNode sec=curr.next;
                curr.next=prev;
                prev=curr;
                curr=sec;

            }
            t.next=curr;
            if (before != null) {//jab left not equal to 1 meand LL k beech m reverse krana h 
                before.next = prev;
                return head;
            } else {//when left ==1 tb prev hi head bangea to prev ko return kraynge
                return prev;
            }
        }
        return head;
        
    }
}