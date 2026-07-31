class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int[] sum=new int[nums.length+1];
        
        for(int i=1;i<=nums.length;i++){
            sum[i]+=sum[i-1]+nums[i-1];
        }
        int ans=0;
        for(int i=nums.length;i>=0;i--){
            for(int K=0;K<i;K++){
                if(sum[i]-sum[K]==k)ans++;
            }
        }
        return ans;
        
    }
}