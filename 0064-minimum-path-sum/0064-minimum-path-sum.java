class Solution {
    static int N;
    static int M;
    static int[][] dp;
    public int minPathSum(int[][] grid) {
        N=grid.length;
        M=grid[0].length;
        dp=new int[N][M];

        for(int i=0;i<N;i++)
            Arrays.fill(dp[i],-1);
        
        dp[0][0]=grid[0][0];
        return DY(N-1,M-1,grid);
    }
   public static int DY(int y,int x,int[][] grid){
        if(x<0)return Integer.MAX_VALUE;
        if(y<0)return Integer.MAX_VALUE;

        if(dp[y][x]!=-1)return dp[y][x];
        dp[y][x]=Math.min(DY(y-1,x,grid),DY(y,x-1,grid))+grid[y][x];

        return dp[y][x];
   } 
}