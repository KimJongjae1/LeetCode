class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i];
        }
        int reverse=1;
        for(int i=nums.length-1;i>0;i--){
            pre[i]=pre[i-1]*reverse;
            reverse*=nums[i];
        }
        pre[0]=reverse;
        return pre;
    }
}