class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        
        int left=0;
        int right=1;
        int ans=1;
        Map<Character,Integer> map=new HashMap<>();
        map.put(s.charAt(left),1);
        while(right<s.length()){
            char a=s.charAt(right);
            int n=map.getOrDefault(a,0)+1;
            right++;

            if(n>1){
                while(n>1){
                    char A=s.charAt(left);
                    int N=map.get(A);
                    map.put(A,N-1);
                    if(A==a)n--;
                    left++;
                }
            }
            map.put(a,1);
            ans=Math.max(ans,right-left);

        }
        return ans;
    }
}