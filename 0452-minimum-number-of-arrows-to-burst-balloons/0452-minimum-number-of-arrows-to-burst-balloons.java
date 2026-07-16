class Solution {
    public int findMinArrowShots(int[][] points) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return Integer.compare(a[1],b[1]);
            }
        });

        for(int [] a:points){
            pq.offer(a);
        }

        int x=pq.poll()[1];
        int cnt=1;

        while(!pq.isEmpty()){
            int[] next=pq.poll();

            if(x<next[0]){
                x=next[1];
                cnt++;
            }
        }
        return cnt;
    }
}