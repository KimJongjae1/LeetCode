/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        ListNode ans;
        while(true){
            if(head==null)return null;
            if(set.contains(head)){
                ans=head;
                break;
            } 
            set.add(head);   
            head=head.next;
        }
        return ans;

    }

}