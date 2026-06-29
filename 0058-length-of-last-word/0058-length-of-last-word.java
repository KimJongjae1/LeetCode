import java.io.*;
import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st=new StringTokenizer(s);

        String str="";
        while(st.hasMoreTokens()){
            str=st.nextToken();
        }

        return str.length();
    }
}