class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int n:nums){
            if(n==0)zero++;
            else if(n==1)one++;
            else two++;
        }
        for(int i=0;i<nums.length;i++){
            if(zero>0){
                nums[i]=0;
                zero--;
            }else if(one>0){
                one--;
                nums[i]=1;
            }else{
                two--;
                nums[i]=2;
            }
        }
    }
}