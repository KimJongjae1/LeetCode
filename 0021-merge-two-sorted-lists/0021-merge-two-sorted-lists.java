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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        ListNode head=new ListNode();
        ListNode ans=head;
        while(list1!=null||list2!=null){
            int n1=200;
            int n2=200;

            if(list1!=null) n1=list1.val;
            if(list2!=null) n2=list2.val;  

            if(n1>n2){
                head.next=list2;
                list2=list2.next;
            }
            else {
                head.next=list1;
                list1=list1.next;
            }
            
            head=head.next;

        }
        return ans.next;
    }
}