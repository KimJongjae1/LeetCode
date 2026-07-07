class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] ans=strs[0].toCharArray();
        int len=ans.length;
        for(int i=1;i<strs.length;i++){
            int idx1=0;
            int idx2=0;
            while(idx1<len&&idx2<strs[i].length()){
                if(ans[idx1]!=strs[i].charAt(idx2)){
                    break;
                }
                idx1++;
                idx2++;
            }
            len=idx1;
        }
        String A="";
        for(int i=0;i<len;i++){
            A+=ans[i];
        }
        return A;
    }
}