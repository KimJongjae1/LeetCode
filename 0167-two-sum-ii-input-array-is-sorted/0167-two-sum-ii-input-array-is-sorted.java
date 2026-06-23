class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int sum=numbers[0]+numbers[right];

        while(sum!=target){
            if(sum<target){
                sum-=numbers[left];
                sum+=numbers[++left];
            }else if(sum>target){
                sum-=numbers[right];
                sum+=numbers[--right];
            }
        }
        return new int[]{left+1,right+1};
    }
}