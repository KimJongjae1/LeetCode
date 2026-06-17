class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)return new int[]{-1,-1};
        int Left=lowerbound(target,nums);
        int Right=upperbound(target,nums);

        if(nums[Left]!=target||Left>Right)return new int[]{-1,-1};
        else return new int[]{Left,Right-1};
    }
    public static int lowerbound(int t,int[] nums){
        int min=0;
        int max=nums.length-1;

        while(min<max){
            int mid=(max+min)/2;

            if(nums[mid]<t){
                min=mid+1;
            }else{
                max=mid;
            }
        }
        return min;
    }
    public static int upperbound(int t,int[] nums){
        int min=0;
        int max=nums.length;

        while(min<max){
            int mid=(max+min)/2;

            if(nums[mid]<=t){
                min=mid+1;
            }else{
                max=mid;
            }
        }
        return min;
    }
}