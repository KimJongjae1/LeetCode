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
        
        return MAKE(head,map);


    }
    public Node MAKE(Node head,Map<Node,Node> map){
        if(head==null)return null;
        if(map.containsKey(head))return map.get(head);

        Node start=new Node(head.val);
        map.put(head,start);
        start.next=MAKE(head.next,map);
        start.random=MAKE(head.random,map);
        return start;
    }
}