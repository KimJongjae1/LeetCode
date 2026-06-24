class Solution {
    public int maxPoints(int[][] points) {
        int N=points.length;

        int cnt=1;
        for(int i=0;i<N;i++){
            int y1=points[i][1];
            int x1=points[i][0];
            for(int k=i+1;k<N;k++){
                int C=0;
                int y2=points[k][1];
                int x2=points[k][0];
                int slope1=y1-y2;
                int slope2=x1-x2;
     
                int g=gcd(Math.abs(slope1),Math.abs(slope2));
                slope1/=g;
                slope2/=g;
                for(int[] p:points){
                    int temp=p[0]-x1;
                    if(slope2==0){
                        if(p[0]==x1)C++;
                    }else{
                        if(Math.abs(temp)%slope2!=0)continue;
                        temp/=slope2;
                        if(p[1]-y1==temp*slope1)
                            C++;
                        
                    }
                }
                cnt=Math.max(cnt,C);
            }
            
        }
        return cnt;
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}