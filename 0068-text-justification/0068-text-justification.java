class Solution {
    static List<List<Integer>> list;
    static List<Integer> blank;
    static List<String> ans;
    public List<String> fullJustify(String[] words, int maxWidth) {
        list=new ArrayList<>();
        blank=new ArrayList<>();
        BACK(0,0,words,maxWidth);

        ans=new ArrayList<>();
        for(int i=0;i<list.size()-1;i++){
            List<Integer> temp=list.get(i);
            int b=blank.get(i);
            int word=temp.size()-1;
            
                if(word==0)word=1;
                int BLANK=b/word;
                int ADD=b%word;
                String B="";
                for(int k=0;k<BLANK;k++) 
                    B+=" ";

                StringBuilder sb=new StringBuilder();
      
                for(int idx:temp){
                    String str=words[idx];
                    sb.append(str);
                    if(word==0)continue;
                    word--;
                    if(ADD>0){
                        sb.append(B+" ");
                        ADD--;
                    }
                    else sb.append(B);
                }
                ans.add(sb.toString());
            
        }
        StringBuilder sb=new StringBuilder();
        int len=0;
        for(int i:list.get(list.size()-1)){
            sb.append(words[i]);
            len+=words[i].length();
            if(len<maxWidth){
                len++;
                sb.append(" ");
            }
        }
        while(len<maxWidth){
            sb.append(" ");
            len++;
        }

        ans.add(sb.toString());

        return ans;
    }
    public static void BACK(int level,int idx,String[] words,int maxWidth){
        if(idx==words.length){
            return;
        }
        if(list.size()<=level){
            list.add(new ArrayList<>());
            blank.add(0);
        }
        List<Integer> temp=list.get(level);
        int len=0;
        for(int L:temp){
            len+=words[L].length();
        }
        len+=temp.size();

        
        if(len+words[idx].length()<=maxWidth){
            temp.add(idx);
            BACK(level,idx+1,words,maxWidth);
        }else{
            int left=maxWidth-len+temp.size();
            blank.set(level,left);
            BACK(level+1,idx,words,maxWidth);
        }



    }
}