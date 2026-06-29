class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Character> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char S=s.charAt(i);
            char T=t.charAt(i);
            if(map.containsKey(S)){
                int match=map.get(S);
                if(T!=match)return false;
            }else{
                if(set.contains(T))return false;
                set.add(T);
                map.put(S,T);
            }
        }
        return true;
    }
}