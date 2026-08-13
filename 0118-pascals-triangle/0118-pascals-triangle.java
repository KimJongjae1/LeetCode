class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);

        for(int i=1;i<numRows;i++){
            List<Integer> temp=ans.get(i-1);
            List<Integer> NEW=new ArrayList<>();
            for(int k=0;k<=i;k++){
                if(k==0||k==i)NEW.add(1);
                else {
                    NEW.add(temp.get(k-1)+temp.get(k));
                }
            }
            ans.add(NEW);
        }
        return ans;

    }
}