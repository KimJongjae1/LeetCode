class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        for(int i=2;i*i<=n;i++){
            dp[i*i]=1;
        }
        for(int i=2;i<=n;i++){
            if(dp[i]==1)continue;
            dp[i]=Integer.MAX_VALUE;
           
            for(int k=1;k*k<=i;k++){
                int temp=k*k;
                dp[i]=Math.min(dp[i],dp[i-temp]+dp[temp]);
            }
            
        }
        return dp[n];
    }
}