class Solution {
    public int trap(int[] height) {

        int ret=0;
        int N=height.length;
        int left=0;
        int right=N-1;
        int Lmax=height[left];
        int Rmax=height[right];
        while(left<right){
            Lmax=Math.max(Lmax,height[left]);
            Rmax=Math.max(Rmax,height[right]);

            if(Lmax<=Rmax){
                ret+=Lmax-height[left];
                left++;
            }else{
                ret+=Rmax-height[right];
                right--;
            }

        }

        return ret;

        
    }
}