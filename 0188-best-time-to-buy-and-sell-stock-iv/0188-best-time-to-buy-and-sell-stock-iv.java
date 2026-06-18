class Solution {
    static int K;
    public int maxProfit(int k, int[] prices) {
        int[] buy=new int[k];
        int[] sell=new int[k];
        Arrays.fill(buy, Integer.MIN_VALUE / 2);
        buy[0]=-prices[0];
        K=k;
        for(int i=1;i<prices.length;i++){
            buy[0]=Math.max(buy[0],-prices[i]);
            sell[0]=Math.max(sell[0],buy[0]+prices[i]);
            DY(buy,sell,1,i,prices);
        }
        return sell[K-1];
    }
    public static void DY(int[] buy,int[] sell,int level,int idx,int[] prices){
        if(level==K)return;
     

        buy[level]=Math.max(buy[level],sell[level-1]-prices[idx]);
        sell[level]=Math.max(sell[level],buy[level]+prices[idx]);
        
        DY(buy,sell,level+1,idx,prices);
        
    }
}