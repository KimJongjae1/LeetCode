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
    static ListNode start;
    static ListNode before;
    static boolean flag;
    public ListNode reverseKGroup(ListNode head, int k) {
        start=head;
        ListNode ans=new ListNode();
        ans.next=head;
        before=ans;

        while(true){
            flag=false;
            before=DFS(start,1,k);
            if(before==null)break;
            before.next=start;
            
        }

        return ans.next;

    }
    public static ListNode DFS(ListNode cur,int level,int k){
        if(cur==null)return null;
        if(level==k){
            before.next=cur;
            start=cur.next;

            return cur;
        }

        ListNode next=DFS(cur.next,level+1,k);
        if(next==null)return null;
        next.next=cur;
        return cur;

    }
}