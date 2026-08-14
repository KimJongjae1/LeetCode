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
    public ListNode swapPairs(ListNode head) {
        if(head==null)return null;

        ListNode NEXT=head.next;
        if(NEXT==null)return head;

        ListNode NEXTNEXT=NEXT.next;
        NEXT.next=head;
        head.next=swapPairs(NEXTNEXT);
        return NEXT;
    }
}