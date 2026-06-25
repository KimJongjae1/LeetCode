class Solution {
    public int majorityElement(int[] nums) {
        int N=nums.length/2;

         Map<Integer,Integer> map=new HashMap<>();

         for(int a:nums){
            map.putIfAbsent(a,0);
            map.put(a,map.get(a)+1);
         }

         for(int key:map.keySet()){
            if(map.get(key)>N){
                return key;
            }
         }
         return -1;
    }
}