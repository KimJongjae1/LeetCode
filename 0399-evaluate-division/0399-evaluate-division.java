class Solution {
    static Map<String,Integer> map;
    static double[] ans;
    static boolean[] visit;
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        map=new HashMap<>();
        ans=new double[queries.size()];
        int idx=0;

        for(int i=0;i<equations.size();i++){
            List<String> L=equations.get(i);
            String a=L.get(0);
            String b=L.get(1);
            map.putIfAbsent(a,idx++);
            map.putIfAbsent(b,idx++);
        
        }

        double[][] arr=new double[idx][idx];
        visit=new boolean[idx];
        for(int i=0;i<equations.size();i++){
            List<String> L=equations.get(i);
            String a=L.get(0);
            String b=L.get(1);

            int an=map.get(a);
            int bn=map.get(b);

            arr[an][bn]=values[i];
            arr[bn][an]=-values[i];
            
        }
        for(int i=0;i<queries.size();i++){
            List<String> L=queries.get(i);
            String a=L.get(0);
            String b=L.get(1);

            Integer an=map.get(a);
            Integer bn=map.get(b);
            if(an==null||bn==null)ans[i]=-1;
            else{
                ans[i]=DFS(an,bn,1,arr);
            }
        }
        return ans;
    }
    public static double DFS(int cur,int end,double n,double[][] arr){
        if(cur==end){
            return n;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[cur][i]==0)continue;
            if(visit[i])continue;
            visit[i]=true;
            double N=-1;
            if(arr[cur][i]<0)  N= DFS(i,end,n/(-arr[cur][i]),arr);
            else  N= DFS(i,end,n*arr[cur][i],arr);
            visit[i]=false;
            if(N!=-1)return N;
            
        }

        return -1;
    }
}