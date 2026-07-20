class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> origin =new HashMap<>();
        Map<Character,Integer> window =new HashMap<>();
 
        for(int i=0;i<t.length();i++){
            origin.put(t.charAt(i),origin.getOrDefault(t.charAt(i),0)+1);
        }
        int cnt=0;
        int max=Integer.MAX_VALUE;
        String ans="";

        int idx=0;    
        while(!origin.containsKey(t.charAt(idx))){
            idx++;
        }

        for(int i=idx;i<s.length();i++){
            char a=s.charAt(i);

            if(origin.containsKey(a)){
                
                
               if(!window.containsKey(a)||origin.get(a)>window.get(a)){
                   cnt++;
               }
               window.put(a,window.getOrDefault(a,0)+1);
            }

      

            while(cnt==t.length()&&idx<=i){
                if(max>i-idx+1){
                    ans=s.substring(idx,i+1);
                    max=i-idx+1; 
                }

                char temp=s.charAt(idx);
                if(window.containsKey(temp)){
                    if(origin.get(temp)>=window.get(temp)){
                        cnt--;
                    }
                    window.put(temp,window.get(temp)-1);
                }
                idx++;
                

                while(idx<i&&!window.containsKey(s.charAt(idx))){
                    idx++;
                }

            }

            
        }


        return ans;
    }
}