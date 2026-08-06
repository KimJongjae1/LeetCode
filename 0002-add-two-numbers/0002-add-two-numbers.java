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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
       int N=0;
       ListNode ans=new ListNode();
       ListNode head=ans;
       while(l1!=null||l2!=null){
            int n1=0;
            int n2=0;

            if(l1!=null){
                n1=l1.val;
                l1=l1.next;
            }

            if(l2!=null){
                n2=l2.val;
                l2=l2.next;
            }

            int temp=n1+n2+N;
            if(temp>=10){
                temp-=10;
                N=1;
            }
            else N=0;

            head.next=new ListNode(temp);
            head=head.next;
       }
       if(N==1){
         head.next=new ListNode(1); 
       }
       return ans.next;
    }
}