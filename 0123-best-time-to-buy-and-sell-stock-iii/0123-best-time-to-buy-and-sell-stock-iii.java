class Solution {
    public int maxProfit(int[] prices) {
        int[] dp=new int[prices.length];
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i]=Math.max(dp[i-1],prices[i]-min);
            min=Math.min(prices[i],min);
        }
        int max=prices[prices.length-1];
        int M=0;
        int ret=dp[prices.length-1];
        for(int i=prices.length-2;i>=1;i--){
            M=Math.max(M,max-prices[i]);
            ret=Math.max(ret,dp[i-1]+M);
            max=Math.max(max,prices[i]);
        }

        return ret;

    }
}