class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        int N=matrix.length;
        int M=matrix[0].length;
        int ans=0;
        for(int i=0;i<N;i++){
            dp[i][0]=matrix[i][0]-'0';
            ans=Math.max(ans,dp[i][0]);
        }
        for(int i=0;i<M;i++){
            dp[0][i]=matrix[0][i]-'0';
            ans=Math.max(ans,dp[0][i]);
        }
        
        for(int i=1;i<N;i++){
            for(int k=1;k<M;k++){
                if(matrix[i][k]=='0')continue;

                dp[i][k]=Math.min(dp[i-1][k],Math.min(dp[i][k-1],dp[i-1][k-1]))+1;
                ans=Math.max(dp[i][k],ans);
            }
        }

        return ans*ans;
    }
}