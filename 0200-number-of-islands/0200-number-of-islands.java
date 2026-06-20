class Solution {
    static char[][] arr;
    static int[] diy={-1,1,0,0};
    static int[] dix={0,0,-1,1};
    static int N;
    static int M;
    public int numIslands(char[][] grid) {
        arr=grid;
        N=grid.length;
        M=grid[0].length;
        int cnt=0;
        for(int i=0;i<N;i++){
            for(int k=0;k<M;k++){
                if(arr[i][k]=='1'){
                    BFS(i,k);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void BFS(int y,int x){
        Queue<int[]> qu=new LinkedList<>();
        qu.offer(new int[]{y,x});
        arr[y][x]='2';
        while(!qu.isEmpty()){
            int[] cur=qu.poll();

            for(int i=0;i<4;i++){
                int Y=cur[0]+diy[i];
                int X=cur[1]+dix[i];
                if(Y<0||Y>=N||X<0||X>=M)continue;
                if(arr[Y][X]=='1'){
                    qu.offer(new int[]{Y,X});
                    arr[Y][X]='2';
                }
            }
        }
    }
}