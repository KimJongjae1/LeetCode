class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs[0].length();
        
        for(int i=0;i<len;i++){
            for(int k=1;k<strs.length;k++){
                if(i==strs[k].length()||strs[0].charAt(i)!=strs[k].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}