import java.util.*;
import java.io.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        StringTokenizer st=new StringTokenizer(s);

        Map<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        int idx=0;
        while(st.hasMoreTokens()){
            if(idx>=pattern.length())return false;
            String a=st.nextToken();
            
            char cur=pattern.charAt(idx);

            if(!map.containsKey(cur)&&!set.contains(a)) map.put(cur,a);
            else{
                String temp=map.get(cur);

                if(!a.equals(temp))return false;

            }
            set.add(a);
            idx++;
        }
        if(idx!=pattern.length())return false;
        return true;
    }
}