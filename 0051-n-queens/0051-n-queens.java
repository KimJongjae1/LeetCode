class Solution {
    static List<List<String>> ans;
    static int[][] arr;
    static int N;
    static int[] diy={1,-1,1,-1,1,-1};
    static int[] dix={1,1,-1,-1,0,0};
    public List<List<String>> solveNQueens(int n) {
        ans=new ArrayList<>();
        N=n;
        arr=new int[n][n];
        BACK(0);
        return ans;
    }
    public static void BACK(int idx){
        if(idx==N){
            ans();
            return;
        }

        for(int i=0;i<N;i++){
            if(arr[idx][i]!=0)continue;
            arr[idx][i]=-1;
            block(idx,i);
            BACK(idx+1);
            origin(idx,i);
            arr[idx][i]=0;
        }
    }
    public static void block(int y,int x){

        for(int i=0;i<6;i++){
            int Y=y+diy[i];
            int X=x+dix[i];
            while(Y>=0&&Y<N&&X>=0&&X<N){
                arr[Y][X]++;
                Y+=diy[i];
                X+=dix[i];

            }

        }
    }
    public static void origin(int y,int x){

        for(int i=0;i<6;i++){
            int Y=y+diy[i];
            int X=x+dix[i];
            while(Y>=0&&Y<N&&X>=0&&X<N){
                arr[Y][X]--;
                Y+=diy[i];
                X+=dix[i];

            }
        }
    }
    public static void ans(){
        StringBuilder sb=new StringBuilder();
        List<String> temp=new ArrayList<>();
        for(int i=0;i<N;i++){
            
            for(int k=0;k<N;k++){
                if(arr[i][k]>=0)sb.append('.');
                else sb.append('Q');
            }
            temp.add(sb.toString());
            sb.delete(0,N);
        }
        ans.add(temp);
    }
}