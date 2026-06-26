class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            int f=nums[i];
            if(map.containsKey(target-f)){
                int idx=map.get(target-f);
                if(i!=idx) return new int[]{i,map.get(target-f)};
            }
        }

        return new int[]{};
    }
}