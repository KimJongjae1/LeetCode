class Solution {
    static int N;
    public int canCompleteCircuit(int[] gas, int[] cost) {
        N=gas.length;
        int fuel=0;
        int sum=0;
        int ans=0;
        for(int i=0;i<N;i++){
            int n=gas[i]-cost[i];
            sum+=n;
            fuel+=n;

            if(fuel<0){
                ans=i+1;
                fuel=0;
            }
        }
        if(sum<0)return -1;
        return ans;
    }
}