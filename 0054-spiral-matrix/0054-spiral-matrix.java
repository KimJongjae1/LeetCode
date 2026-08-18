class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans =new ArrayList<>();
        int[] diy={0,1,0,-1};
        int[] dix={1,0,-1,0};
        int idx=0;  
        int N=matrix.length;
        int M=matrix[0].length;
        int Y=0;
        int X=-1;
        for(int i=0;i<N*M;i++){
            int y=Y+diy[idx];
            int x=X+dix[idx];
            if(y<0||y>=N||x<0||x>=M||matrix[y][x]==-1000){
                idx=(idx+1)%4;
                y=Y+diy[idx];
                x=X+dix[idx];
            }
            ans.add(matrix[y][x]);
            matrix[y][x]=-1000;
            Y=y;
            X=x;
        }
        return ans;
    }
}