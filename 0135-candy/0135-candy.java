class Solution {
    public int candy(int[] ratings) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return Integer.compare(a[0],b[0]);
            }
        });
        int[] dp=new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            pq.offer(new int[]{ratings[i],i});
        }

        while(!pq.isEmpty()){
            int[] c=pq.poll();
            int rate=c[0];
            int idx=c[1];

            int cur=1;
            if(idx>0){
                if(rate>ratings[idx-1]){
                    cur=Math.max(cur,dp[idx-1]+1);
                }
            }

            int right=0;
            if(idx<ratings.length-1){
                if(rate>ratings[idx+1]){
                    cur=Math.max(cur,dp[idx+1]+1);
                }
            }
            dp[idx]=cur;
        }
        int ans=0;
        for(int a:dp){
            ans+=a;
        }
        return ans;
    }
}