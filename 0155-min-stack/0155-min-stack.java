class MinStack {
    Stack<Integer> stack;
    TreeMap<Integer,Integer> map;
    int min;
    public MinStack() {
        map=new TreeMap<>();
        stack=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        stack.push(value);
        if(min>value)min=value;
        map.putIfAbsent(value,0);
        map.put(value,map.get(value)+1);
    }
    
    public void pop() {
        int n=stack.pop();
        int cnt=map.get(n);
        if(cnt==1)map.remove(n);
        else map.put(n,cnt-1);

        if(n==min&&!map.containsKey(n)){
            if(map.size()==0){
                min=Integer.MAX_VALUE;
                return;
            }
            min=map.ceilingKey(Integer.MIN_VALUE);
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */