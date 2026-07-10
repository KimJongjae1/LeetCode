class Solution {
    static int N;
    static int[] ans;
    public int[] productExceptSelf(int[] nums) {
        N=nums.length;
        ans=new int[N];
        int zero=0;
        int zidx=-1;
        int S=1;
        for(int i=0;i<N;i++){
            if(nums[i]==0){
                zero++;
                zidx=i;
            }else{
                S*=nums[i];
            }
        }

        if(zero>=2)return ans;

        if(zero==1){
            ans[zidx]=S;
        }else{
            for(int i=0;i<N;i++){
                ans[i]=S/nums[i];
            }
        }
        return ans;
    }
}