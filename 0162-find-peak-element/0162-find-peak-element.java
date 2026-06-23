class Solution {
    public int findPeakElement(int[] nums) {
          int max=nums.length-1;
          int min=0;
          while(min<=max){
             int mid=(max+min)/2;

            if(mid+1==nums.length||nums[mid]>nums[mid+1]){
                    max=mid-1;
             }else  if(nums[mid]<nums[mid+1]){
                    min=mid+1;
             }
          } 
          return min;    
    }
}