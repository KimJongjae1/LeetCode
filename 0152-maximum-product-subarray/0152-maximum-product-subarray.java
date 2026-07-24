class Solution {
    public int maxProduct(int[] nums) {

        int max=nums[0];
        int dpm=nums[0];
        int dpM=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp1=dpm;
            int temp2=dpM;
            dpM=Math.max(nums[i],Math.max(temp1*nums[i],temp2*nums[i]));
            dpm=Math.min(nums[i],Math.min(temp2*nums[i],temp1*nums[i]));
            max=Math.max(max,Math.max(dpM,dpm));
        }
        return max;
        
    }
}