class Solution {
    public int majorityElement(int[] nums) {
        int N=nums.length/2;
        int ret=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(ret==nums[i]){
                cnt++;
            }else{
                cnt--;
            }

            if(cnt==-1){
                cnt=1;
                ret=nums[i];
            }
        }
        return ret;
    }
}