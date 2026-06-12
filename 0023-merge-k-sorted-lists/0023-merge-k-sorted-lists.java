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

       ListNode head=new ListNode();
       ListNode cur=head;
        while(true){
            int cnt=0;
            int min=Integer.MAX_VALUE;
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<lists.length;i++){
                if(lists[i]==null){
                    cnt++;
                    continue;
                }

                if(min>lists[i].val){
                    min=lists[i].val;
                    list.clear();
                    list.add(i);
                }else if(min==lists[i].val){
                    list.add(i);
                }

            }   
            if(cnt==lists.length)break;
            for(int add:list){
                cur.next=lists[add];
                cur=cur.next;
                lists[add]=lists[add].next;
            }
        }
        return head.next;
    }
}