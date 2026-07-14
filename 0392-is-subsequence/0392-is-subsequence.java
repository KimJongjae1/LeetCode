class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)return true;
        if(t.length()==0)return false;

        for(int i=0;i<t.length();i++){
            if(s.charAt(0)!=t.charAt(i))continue;
            int sidx=1;
            int tidx=i+1;
            while(tidx<t.length()&&sidx<s.length()){
                if(s.charAt(sidx)!=t.charAt(tidx)){
                    tidx++;
                }else{
                    sidx++;
                    tidx++;
                }
            }
            if(sidx==s.length())return true;
        }
        return false;
    }
}