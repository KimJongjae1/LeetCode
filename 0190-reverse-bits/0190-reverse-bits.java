class Solution {
    public int reverseBits(int n) {
        int N=1;
        int ans=0;
        for(int i=31;i>=0;i--){
            if((n&(1<<i))>0){
                ans+=N;
            }
            N*=2;
        }
        return ans;
    }
}