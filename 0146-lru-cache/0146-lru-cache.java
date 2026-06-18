class LRUCache {
    Map<Integer,Node> map=new HashMap<>();
    int max;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        max=capacity;
        head=new Node(-1,-1);
        tail=new Node(-2,-2);
        head.next=tail;
        tail.before=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node N=map.get(key);

            N.before.next=N.next;
            N.next.before=N.before;
            N.next=tail;
            N.before=tail.before;
            tail.before=N;
            N.before.next=N;
            return N.value;
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node N=map.get(key);
            N.value=value;
            N.before.next=N.next;
            N.next.before=N.before;
            N.next=tail;
            N.before=tail.before;
            tail.before=N;
            N.before.next=N;

            return;
        }


        if(map.size()>=max){
            Node Delete=head.next;
            map.remove(Delete.key);
            System.out.println(Delete.key);
            Delete.before.next=Delete.next;
            Delete.next.before=Delete.before;
            Delete.next=null;
            Delete.before=null;
        }

        Node N=new Node(key,value);
        map.put(key,N);
        N.next=tail;
        N.before=tail.before;
        tail.before=N;
        N.before.next=N;
    }
}
class Node{
    int key;
    int value;
    Node before;
    Node next;

    Node(int key,int value){
        this.key=key;
        this.value=value;
        before=null;
        next=null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */