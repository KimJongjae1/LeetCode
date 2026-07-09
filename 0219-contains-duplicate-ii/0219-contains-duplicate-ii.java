class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0)return false;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<=k&&i<nums.length;i++){
            map.putIfAbsent(nums[i],0);
            int n=map.get(nums[i]);
            if(n>=1)return true;
            map.put(nums[i],n+1);
        }

        System.out.println(map);
        for(int i=k+1;i<nums.length;i++){
            int N=map.get(nums[i-k-1]);
            map.put(nums[i-k-1],N-1);

            map.putIfAbsent(nums[i],0);
            int n=map.get(nums[i]);
            if(n>=1)return true;
            map.put(nums[i],n+1);
        }

        return false;
    }
}