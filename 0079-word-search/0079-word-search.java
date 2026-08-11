class Solution {
    static int[] diy={-1,1,0,0};
    static int[] dix={0,0,-1,1};
    static boolean[][] visit;
    public boolean exist(char[][] board, String word) {
        visit=new boolean[board.length][board[0].length];

        for(int i=0;i<board.length;i++){
            for(int k=0;k<board[0].length;k++){
                if(board[i][k]==word.charAt(0)){
                    visit[i][k]=true;
                    if(check(board,word,i,k,1))return true;
                    visit[i][k]=false;
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board,String word,int y,int x,int idx){
        if(idx==word.length())return true;

        for(int i=0;i<4;i++){
            int Y=y+diy[i];
            int X=x+dix[i];
            if(Y>=board.length||Y<0||X<0||X>=board[0].length)continue;
            if(visit[Y][X])continue;
            if(word.charAt(idx)!=board[Y][X])continue;

            visit[Y][X]=true;
            boolean ret=check(board,word,Y,X,idx+1);
            visit[Y][X]=false;
            if(ret)return true;
                   
            

        }
        return false;


    }
}