import java.util.*;
import java.io.*;

class Solution {
    static int[] diy={-1,1,0,0};
    static int[] dix={0,0,1,-1};
    static int N;
    static int M;
    static boolean[][] visit;
    public int nearestExit(char[][] maze, int[] entrance) {
        M=maze[0].length;
        N=maze.length;
        visit=new boolean[N][M];
        visit[entrance[0]][entrance[1]]=true;
        return BFS(entrance[0],entrance[1],maze);
    }
    public static int BFS(int Y,int X,char[][] maze){
        Queue<int[]> qu=new LinkedList<>();
        qu.offer(new int[]{Y,X,0});
        
        while(!qu.isEmpty()){
            int[] cur=qu.poll();

            for(int i=0;i<4;i++){
                int y=cur[0]+diy[i];
                int x=cur[1]+dix[i];

                if(y<0||x<0||x>=M||y>=N){
                    if(cur[0]!=Y||cur[1]!=X){
                        return cur[2];
                    }
                    continue;
                }
                if(maze[y][x]=='+')continue;
                if(visit[y][x])continue;
                visit[y][x]=true;
                qu.offer(new int[]{y,x,cur[2]+1});
            }
        }  
        return -1;
    }
}