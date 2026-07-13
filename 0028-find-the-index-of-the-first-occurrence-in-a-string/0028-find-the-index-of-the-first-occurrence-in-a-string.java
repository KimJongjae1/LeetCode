class Solution {
    public int strStr(String haystack, String needle) {
        
        Loop: for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                for(int k=1;k<needle.length();k++){
                    if(i+k==haystack.length())return -1;
                    if(haystack.charAt(i+k)!=needle.charAt(k))
                        continue Loop;
                }
                return i;
            }
        }
        return -1;
    }
}