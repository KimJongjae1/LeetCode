class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         int[] indeed=new int[numCourses];
         List<Integer>[] list=new ArrayList[numCourses];
          for(int i=0;i<numCourses;i++){
            list[i]=new ArrayList<>();
          }

         for(int[] n:prerequisites){
            indeed[n[0]]++;
            list[n[1]].add(n[0]);
         }
         
         Queue<Integer> qu=new LinkedList<>();
         for(int i=0;i<numCourses;i++){
            if(indeed[i]==0)
            qu.offer(i);
         }

         while(!qu.isEmpty()){
            int cur=qu.poll();

            for(int next:list[cur]){
                indeed[next]--;

                if(indeed[next]==0)
                  qu.offer(next);
            }
         }
         for(int i=0;i<numCourses;i++){
            if(indeed[i]!=0)return false;
         }
         return true;
    }
}