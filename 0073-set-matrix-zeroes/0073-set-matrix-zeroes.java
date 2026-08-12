class Solution {
    public void setZeroes(int[][] matrix) {
       Set<Integer> row=new HashSet<>();
       Set<Integer> col=new HashSet<>();

       for(int i=0;i<matrix.length;i++){
        for(int k=0;k<matrix[0].length;k++){
            if(matrix[i][k]==0){
                row.add(i);
                col.add(k);
            }
        }
       }

       for(int i:row){
          Arrays.fill(matrix[i],0);
       }

       for(int k:col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][k]=0;
        }
       }

       
    }
}