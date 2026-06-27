class Solution {

    public int removeElement(int[] nums, int val) {
      Arrays.sort(nums);
      int start=-1;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==val){
            start=i;
            break;
        }
      }
      if(start==-1)return nums.length;
      int Diff=-1;
      int cnt=0;
      for(int i=start;i<nums.length;i++){
        if(nums[i]!=val){
            Diff=i;
            break;
        }
        cnt++;
      }
  
      if(cnt==nums.length)return 0;
      int f=nums.length-1;
      int temp=cnt;
      while(temp>0){
        if(nums[start]==nums[f])break;
          nums[start]=nums[f];
          nums[f]=val;
          start++;
          f--;
          temp--;
      }
      return nums.length-cnt;
      
      
    }
}