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
    public ListNode partition(ListNode head, int x) {
        if(head==null)return null;
        ListNode H=new ListNode();
        ListNode ans=H;
        H.next=head;
        while(H.next!=null&&H.next.val<x){
            H=H.next;
        }
        ListNode before=H;

        head=before.next;

        while(head!=null){
            if(head.val<x){
                before.next=head.next;
                head.next=H.next;
                H.next=head;
                head=before.next;
                H=H.next; 
            }else{
                before=head;
                head=head.next;
            }
        }

        return ans.next;
    }
}