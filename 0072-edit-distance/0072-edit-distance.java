class Solution {
    public int minDistance(String word1, String word2) {
        int N=word1.length();
        int M=word2.length();
        int[][] dp=new int[N+1][M+1];
        if(Math.min(N,M)==0)
            return Math.max(N,M);

        for(int i=0;i<=M;i++)dp[0][i]=i;
        for(int i=0;i<=N;i++)dp[i][0]=i;

        for(int k=1;k<=word2.length();k++){
            char two=word2.charAt(k-1);
            for(int i=1;i<=word1.length();i++){
                char one=word1.charAt(i-1);

                if(one==two){
                    dp[i][k]=dp[i-1][k-1];
                }else{
                    dp[i][k]=Math.min(dp[i-1][k-1],Math.min(dp[i-1][k],dp[i][k-1]))+1;
                }
            }
        }
        return dp[N][M];
    }
}