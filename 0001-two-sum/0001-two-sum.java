class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] N=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            N[i]=nums[i];
        }
        Arrays.sort(nums);

        int left=0;
        int right=nums.length-1;
        while(left<right){

            if(nums[left]+nums[right]<target){
                left++;
            }else if(nums[left]+nums[right]>target){
                right--;
            }else{
                int L=0;
                while(N[L]!=nums[left]){
                    L++;
                }
                int R=nums.length-1;
                while(N[R]!=nums[right]){
                    R--;
                }
                
                return new int[]{L,R};
            }
        }
        return new int[]{left,right};
    }
}