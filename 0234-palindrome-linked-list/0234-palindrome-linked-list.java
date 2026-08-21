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
    static ListNode H;
    static boolean ans;
    public boolean isPalindrome(ListNode head) {
       H=head;

        return DFS(head);

    }
    public static boolean DFS(ListNode head){
        if(head==null)return true;

        if(!DFS(head.next))return false;
        if(head.val!=H.val)return false;
        H=H.next;
        return true;
    }
}