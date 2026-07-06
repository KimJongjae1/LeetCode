class Solution {
    public int removeDuplicates(int[] nums) {
        int max=-200;
        int change=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                nums[cnt++]=nums[i];
                max=nums[i];
            }
        }
        return cnt;
    }
}