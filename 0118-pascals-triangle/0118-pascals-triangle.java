class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            List<Integer> before=list.get(i-1);
            temp.add(1);
            for(int k=1;k<before.size();k++){
                temp.add(before.get(k-1)+before.get(k));
            }
            temp.add(1);
            list.add(temp);
        }
        return list;
    }
}