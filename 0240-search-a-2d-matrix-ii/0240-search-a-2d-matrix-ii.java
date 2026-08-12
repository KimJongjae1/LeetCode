class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(binary(matrix[i],target))return true;
        }
        return false;
    }
    public boolean binary(int[] arr,int target){
        int max=arr.length-1;
        int min=0;

        while(min<=max){
            int mid=(max+min)/2;

            if(arr[mid]<target){
                min=mid+1;
            }else if(arr[mid]>target){
                max=mid-1;
            }else{
                return true;
            }

        }
        return false;
    }
}