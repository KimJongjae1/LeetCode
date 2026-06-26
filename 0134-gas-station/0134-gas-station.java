class Solution {
    static int[] route1;
    static int N;
    public int canCompleteCircuit(int[] gas, int[] cost) {
        N=gas.length;
        route1=new int[N];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<N;i++){
            sum1+=gas[i];
            sum2+=cost[i];

        }
        if(sum1<sum2)return -1;
        int fuel=0;
        int ans=0;
        for(int i=0;i<N;i++){
            int n=gas[i]-cost[i];
            if(fuel+n<0){
                fuel=0;
                ans=i+1;
            }else{
               fuel+=n;     
            }
        }

        return ans;
    }
}