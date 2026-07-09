class Solution {
    public int maxProfit(int[] prices) {
        int min=10000;
        int ans=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }else{
                ans=Math.max(ans,prices[i]-min);
            }
        }
        return ans;
    }
}