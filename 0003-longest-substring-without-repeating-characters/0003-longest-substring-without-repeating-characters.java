class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last=new int[128];

        Arrays.fill(last,-1);
        int start=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);

            if(last[a]>=start){
                start=last[a]+1;
            }
            last[a]=i;

            ans=Math.max(ans,i-start+1);
        }
        return ans;
    }
}