/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        int lenB=0;
        ListNode A=headA;
        while(A!=null){
            lenA++;
            A=A.next;
        }
        ListNode B=headB;
        while(B!=null){
            lenB++;
            B=B.next;
        }
        ListNode N=headA;
        ListNode left=headB;
        int len=lenA-lenB;
        if(lenB>lenA){
            N=headB;
            left=headA;
            len=lenB-lenA;
        }
        while(len>0){
            N=N.next;
            len--;
        }
        while(N!=left&&N!=null&&left!=null){
            N=N.next;
            left=left.next;
        }
        if(N==null||left==null)return null;
        return N;

    }
}