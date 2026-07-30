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
        ans=true;
        P(head);
        return ans;
    }
    public void P(ListNode root) {
        if(root==null)return;
        if(!ans)return;
        P(root.next);
        if(root.val!=H.val){
            ans=false;
        }else{
            H=H.next;
        }
    }
}