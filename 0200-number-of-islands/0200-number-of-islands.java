class Solution {
    static int[] diy={-1,1,0,0};
    static int[] dix={0,0,-1,1};
    public int numIslands(char[][] grid) {
        int ret=0;
        for(int i=0;i<grid.length;i++){
            for(int k=0;k<grid[0].length;k++){
                if(grid[i][k]=='1'){
                    ret++;
                    BFS(i,k,grid);
                }
            }
        }
        return ret;
    }
    public static void BFS(int y,int x,char[][] grid){
        Queue<int[]> qu=new LinkedList<>();
        qu.offer(new int[]{y,x});
        int N=grid.length;
        int M=grid[0].length;
        while(!qu.isEmpty()){
            int[] cur=qu.poll();

            for(int i=0;i<4;i++){
                int Y=cur[0]+diy[i];
                int X=cur[1]+dix[i];

                if(Y<0||Y>=N||X<0||X>=M)continue;
                if(grid[Y][X]=='0')continue;
                grid[Y][X]='0';
                qu.offer(new int[]{Y,X});
            }
        }
    }
}