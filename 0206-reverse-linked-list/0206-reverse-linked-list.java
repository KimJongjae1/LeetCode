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
    static ListNode ans;
    public ListNode reverseList(ListNode head) {
        reverse(head);
        return ans.next;
    }
    public static ListNode reverse(ListNode head){
        if(head==null){
            ans=new ListNode();
            return ans;
        }

        reverse(head.next).next=head;
        head.next=null;
        return head;
    }
}