class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(find(haystack,needle,i+1))return i;
            }
        }
        return -1;
    }
    public boolean find(String S,String s,int idx){
        int sIdx=1;
        while(sIdx<s.length()&&idx<S.length()){
            if(s.charAt(sIdx++)!=S.charAt(idx++)){
                return false;
            }
        }
        if(sIdx==s.length())
        return true;

        return false;
    }
}