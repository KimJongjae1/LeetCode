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
        ListNode head=new ListNode();
        ListNode ans=head;
        int N=0;
        while(true){
            int n=0;
            if(l1!=null){
               n+=l1.val; 
               l1=l1.next;
            }

            if(l2!=null){
                n+=l2.val;
                l2=l2.next;
            }
       
            n+=N;
            if(n>=10){
                N=1;
                n-=10;
            }
            else N=0;

            ListNode NEW=new ListNode(n);
            head.next=NEW;
            head=NEW;
            if(l1==null&&l2==null){
                if(N==1){
                    head.next=new ListNode(1);
                }
                break;
            }
        }
        return ans.next;
    }
}