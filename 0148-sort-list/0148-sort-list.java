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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)return head;

        ListNode H=head;

        ListNode prev=null;
        ListNode slow=H;
        ListNode fast=H;

        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        prev.next=null;

        ListNode left=sortList(head);
        ListNode right=sortList(slow);

        return merge(left,right);
    }
    public static ListNode merge(ListNode N1,ListNode N2){
        ListNode dummy=new ListNode();
        ListNode H=dummy;

        while(N1!=null&&N2!=null){
            if(N1.val<=N2.val){
                H.next=N1;
                N1=N1.next;
            }else{
                H.next=N2;
                N2=N2.next;
            }
            H=H.next;
        }

        if(N1!=null){
            H.next=N1;
        }else{
            H.next=N2;
        }

        return dummy.next;
    }
}