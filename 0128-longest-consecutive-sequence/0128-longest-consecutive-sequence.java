class Solution {
    static Set<Integer> set;
    public int longestConsecutive(int[] nums) {
        set=new HashSet<>();

        for(int i:nums) 
            set.add(i);

        int ret=0;
        for(int i:set){
            if(set.contains(i-1))continue;
            
            int len=1;
            while(set.contains(i+len)){
                len++;
            }
            ret=Math.max(len,ret);
        }
        return ret;

    }
  
}