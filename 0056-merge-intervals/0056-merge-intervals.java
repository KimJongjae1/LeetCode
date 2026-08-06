class Solution {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                if(a[0]!=b[0])return a[0]-b[0];
                return b[1]-a[1];
            }
        });

        for(int[] a:intervals){
            pq.offer(a);
        }
        
        int[] n=pq.poll();
        List<int[]> list=new ArrayList<>();
        int start=n[0];
        int end=n[1];
        while(!pq.isEmpty()){
            n=pq.poll();

            if(end<n[0]){
                list.add(new int[]{start,end});
                start=n[0];
                end=n[1];
            }else{
                start=Math.min(start,n[0]);
                end=Math.max(end,n[1]);
            }

        }

        list.add(new int[]{start,end});
        int[][] ans=new int[list.size()][2];
        int idx=0;
        for(int[] N:list){
            ans[idx]=N;
            idx++;
        }
        return ans;
    }
}