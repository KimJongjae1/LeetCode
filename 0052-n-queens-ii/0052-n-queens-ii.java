class Solution {
    static int[][] board;
    static int N;
    static int ans;
    static int[] diy={-1,1,-1,1};
    static int[] dix={1,1,-1,-1};
    public int totalNQueens(int n) {
        board=new int[n][n];
        N=n;
        ans=0;
        BACK(0);
        return ans;
    }
    public static void BACK(int y){
        if(y==N){
            ans++;
            return;
        }
        for(int i=0;i<N;i++){
            if(board[y][i]==0){
                block(y,i,1);
                BACK(y+1);
                block(y,i,-1);
            }
        }

    }
    public static void block(int y,int x,int n){
        for(int i=0;i<N;i++){
            board[y][i]+=n;
            board[i][x]+=n;
        }

        for(int i=0;i<4;i++){
            int Y=y;
            int X=x;
            while(true){
                Y+=diy[i];
                X+=dix[i];
                if(Y<0||Y>=N||X>=N||X<0)break;
                board[Y][X]+=n;
            }
        }
    }
}