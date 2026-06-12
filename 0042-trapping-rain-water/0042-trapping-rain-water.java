class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack=new Stack<>();
        
        int idx=0;
        int ret=0;
        while(idx<height.length){
           int h=height[idx];
           if(h==0){
            idx++;
            continue;
           }

            int max=0;
            while(!stack.isEmpty()&&height[stack.peek()]<=h){
                int id=stack.pop();
                ret+=(idx-id-1)*(height[id]-max);
                max=Math.max(max,height[id]);

            }   
           if(!stack.isEmpty()){
             int id=stack.peek();
             ret+=(idx-id-1)*(h-max);
           }
           
           stack.push(idx);
           idx++;
        }
        return ret;

        
    }
}