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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode a,ListNode b){
                return a.val-b.val;
            }
        });
        for(int i=0;i<lists.length;i++){
            if(lists[i]==null)continue;
            pq.offer(lists[i]);
        }

        ListNode head=new ListNode();
        ListNode ans=head;
        while(!pq.isEmpty()){
            head.next=pq.poll();
            head=head.next;

            if(head.next==null)continue;

            pq.offer(head.next);
            head.next=null;
        }
        return ans.next;
    } 
}