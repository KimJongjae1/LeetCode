class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length==1)return false;
        

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }    
        if(sum%2!=0)return false;
        sum/=2;
        boolean[] dp=new boolean[sum+1];
        dp[0]=true;
        for(int i=0;i<nums.length;i++){
            if(sum<nums[i])return false;
            for(int k=sum;k>=0;k--){
                if(k-nums[i]<0)continue;

                if(dp[k-nums[i]])dp[k]=true;
            }
            if(dp[sum])return true;
        }
        return dp[sum];
    }
}