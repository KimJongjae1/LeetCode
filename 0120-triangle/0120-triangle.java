class Solution {
    static int[][] dp;
    static int N;
    public int minimumTotal(List<List<Integer>> triangle) {
        N=triangle.size();
        dp=new int[N][];
        for(int i=0;i<N;i++){
            dp[i]=new int[i+1];
            Arrays.fill(dp[i],-100000);
        }
        return DP(0,0,triangle);
    }
    public static int DP(int y,int x,List<List<Integer>> triangle){
        if(y>=N||y<0||x<0||x>=y+1)return 0;

        if(dp[y][x]!=-100000)return dp[y][x];
        dp[y][x]=Math.min(DP(y+1,x,triangle),DP(y+1,x+1,triangle))+triangle.get(y).get(x);

        return dp[y][x];

    }
}