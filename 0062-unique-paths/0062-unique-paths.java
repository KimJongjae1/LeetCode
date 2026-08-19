class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[n][m];
        dp[0][0]=1;
        for(int i=0;i<n;i++){
            for(int k=0;k<m;k++){
                if(i==0||k==0)dp[i][k]=1;
                else  dp[i][k]=dp[i][k-1]+dp[i-1][k];
            }
        }
        return dp[n-1][m-1];
    }
}