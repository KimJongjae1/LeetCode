class Solution {
    public int minPathSum(int[][] grid) {
        int N=grid.length;
        int M=grid[0].length;
        int[][] dp=new int[N][M];
        dp[0][0]=grid[0][0];
        for(int i=0;i<N;i++){
            for(int k=0;k<M;k++){
                if(i>0&&k>0){
                    dp[i][k]=Math.min(dp[i-1][k],dp[i][k-1])+grid[i][k];
                }else if(i>0&&k==0){
                    dp[i][k]=dp[i-1][k]+grid[i][k];
                }else if(i==0&&k>0){
                    dp[i][k]=dp[i][k-1]+grid[i][k];
                }
            }
        }
        return dp[N-1][M-1];
    }
}