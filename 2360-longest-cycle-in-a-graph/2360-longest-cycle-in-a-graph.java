class Solution {
    static int N;
    static boolean[] visit;
    public int longestCycle(int[] edges) {
        N=edges.length;
        int[] indegree=new int[N];
        for(int i=0;i<N;i++){
            if(edges[i]!=-1){
                indegree[edges[i]]++;
            }
        }
        Queue<Integer> qu=new LinkedList<>();
        for(int i=0;i<N;i++){
            if(indegree[i]==0){
                qu.offer(i);
            }
        }

        while(!qu.isEmpty()){
            int cur= qu.poll();

            int next=edges[cur];
            if(next==-1)continue;
            indegree[next]--;
            if(indegree[next]==0){
                qu.offer(next);
            }
        }
        visit=new boolean[N];
        int ans=-1;
        for(int i=0;i<N;i++){
            if(indegree[i]>0&&!visit[i]){
                ans=Math.max(BFS(i,edges),ans);
            }
        }
        return ans;
    }
    public static int BFS(int n,int[] e){
        Queue<int[]> qu=new LinkedList<>();
        qu.offer(new int[]{n,0});
        visit[n]=true;
        while(!qu.isEmpty()){
            int[] cur=qu.poll();

            int next=e[cur[0]];
            if(next==-1)continue;
            if(visit[next]){
                return cur[1]+1;
            }else{
                visit[next]=true;
                qu.offer(new int[]{next,cur[1]+1});
            }

        }
        return -1;
    }
}