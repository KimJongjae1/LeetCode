class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int max=nums.length;
        int min=0;
        while(min<max){
            int mid=(max+min)/2;

            if(nums[mid]<target){
                min=mid+1;
            }else{
                max=mid;
            }
        }
        return min;
        

    }
}