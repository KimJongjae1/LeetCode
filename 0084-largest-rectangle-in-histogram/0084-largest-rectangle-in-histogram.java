class Solution {
    public int largestRectangleArea(int[] heights) {
         Stack<Integer> stack=new Stack<>();
         int ans=0;
         for(int i=0;i<=heights.length;i++){
            int H=0;
            if(i<heights.length)H=heights[i];
            
            while(!stack.isEmpty()&&heights[stack.peek()]>H){
                int h=heights[stack.pop()];

                if(stack.isEmpty()){
                    ans=Math.max(ans,i*h);
                }else{
                    ans=Math.max(ans,(i-stack.peek()-1)*h);
                }

            }
            stack.push(i);
         }
         return ans;
    }
}