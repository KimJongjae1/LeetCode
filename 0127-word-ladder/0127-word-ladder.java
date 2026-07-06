class Solution {
    static List<Integer>[] list;
    static boolean[] visit;
    static int end;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        wordList.add(0,beginWord);
        list=new ArrayList[wordList.size()];
        end=-1;
        for(int i=0;i<wordList.size();i++){
            if(wordList.get(i).equals(endWord))end=i;
            list[i]=new ArrayList<>();
        }
        if(end==-1)return 0;
        visit=new boolean[wordList.size()];
        for(int i=0;i<wordList.size();i++){
            String str=wordList.get(i);
           Loop: for(int k=i+1;k<wordList.size();k++){
                String a=wordList.get(k);
                if(str.length()!=a.length())continue;
                int cnt=0;
                for(int q=0;q<str.length();q++){
                    if(str.charAt(q)!=a.charAt(q)){
                        if(cnt==1)continue Loop;
                        cnt++;
                    }
                }
                list[i].add(k);
                list[k].add(i);
            }
        }
        
        return BFS();
    }
    public static int BFS(){
        Queue<int[]> qu=new LinkedList<>();
        visit[0]=true;
        qu.offer(new int[]{0,1});
        while(!qu.isEmpty()){
            int[] cur=qu.poll();

            if(cur[0]==end){
                return cur[1];
            }

            for(int next:list[cur[0]]){
                if(visit[next])continue;
                visit[next]=true;
                qu.offer(new int[]{next,cur[1]+1});
            }

        }
        return 0;
    }
}