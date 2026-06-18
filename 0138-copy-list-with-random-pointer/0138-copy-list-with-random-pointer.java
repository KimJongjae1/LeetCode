/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        Node H=head;
        Node Before=null;
        while(H!=null){
            Node NEW=new Node(H.val);
            map.put(H,NEW);
            if(Before!=null){
                Before.next=NEW;
            }
            Before=NEW;
            H=H.next;
        }
        H=head;
        Node Start=map.get(head);
        while(Start!=null){
            if(H.random!=null){
                Node random=map.get(H.random);
                Start.random=random;
            }

            Start=Start.next;
            H=H.next;            
        }
        return map.get(head);
    }
}