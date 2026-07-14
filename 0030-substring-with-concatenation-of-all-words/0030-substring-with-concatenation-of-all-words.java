class Solution {
    static List<Integer> list;
    static Map<String,Integer> map;
    static int len;
    public List<Integer> findSubstring(String s, String[] words) {
        list=new ArrayList<>();
        map=new HashMap<>();
        len=words[0].length();
        int wordcnt=words.length;

        for(int i=0;i<words.length;i++){
            map.putIfAbsent(words[i],0);
            map.put(words[i],map.get(words[i])+1);
            
        }
 
        for(int i=0;i<len;i++){
            Map<String,Integer> word=new HashMap<>();

            int cnt=0;
            int left=i;
            int right=i;

            while(right+len<=s.length()){
                String str=s.substring(right,right+len);

                right+=len;

                if(!map.containsKey(str)){
                    word.clear();
                    cnt=0;
                    left=right;
                    continue;
                }

                cnt++;
                word.put(str,word.getOrDefault(str,0)+1);

                while(word.get(str)>map.get(str)){
                    String LEFT=s.substring(left,left+len);
                    int n=word.get(LEFT);
                    if(n==1)word.remove(LEFT);
                    else word.put(LEFT,n-1);
                    left=left+len;
                    cnt--;
                }

                if(cnt==wordcnt){
                    list.add(left);

                    String LEFT=s.substring(left,left+len);
                    
                    int n=word.get(LEFT);
                    if(n==1)word.remove(LEFT);
                    else word.put(LEFT,n-1);

                    left=left+len;
                    cnt--;

                }
            }

        }

        return list;
    }
   
}