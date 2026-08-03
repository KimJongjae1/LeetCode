class Solution {
    static List<Integer> list;
    public List<Integer> findAnagrams(String s, String p) {
        list=new ArrayList<>();
        if(s.length()<p.length())return list;

        int[] arr=new int[26];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i)-'a',map.getOrDefault(p.charAt(i)-'a',0)+1);
            arr[s.charAt(i)-'a']++;
        }
        if(check(map,arr))list.add(0);
        int len=p.length();
        for(int i=len;i<s.length();i++){
            int bf=s.charAt(i-len)-'a';
            int add=s.charAt(i)-'a';

            arr[bf]--;
            arr[add]++;
            if(check(map,arr))list.add(i-len+1);
        }
        return list;
    }
    public boolean check(Map<Integer,Integer> map,int[] arr){
        for(int key:map.keySet()){
            int V=map.get(key);

            if(arr[key]!=V)return false;
        }
        return true;
    }
    
}