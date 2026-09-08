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
    void reverse(ListNode head,int times){
        ListNode curr=head;
        ListNode prev=null;

        while(times-->0){
            ListNode sec=curr.next;
            curr.next=prev;
            prev=curr;
            curr=sec;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null||k==1){
            return head;
        }

        ListNode left=head;
        ListNode right;
        int size=k;
        ListNode prevleft=null;
        ListNode res=null;

        while(true){
            right=left;

            for(int i=0;i<size-1;i++){
                if(right==null){
                    break;
                }
                right=right.next;
            }

            if(right!=null){
                ListNode nextleft=right.next;

                reverse(left,k);

                if(prevleft!=null){
                    prevleft.next=right;
                }

                prevleft=left;

                if(res==null){
                    res=right;
                }

                left=nextleft;
            }
            else{
                if(prevleft!=null){
                    prevleft.next=left;
                }
                break;
            }
        }

        return res;
        
    }
}