class RandomizedSet {
    Map<Integer,Integer> map=new HashMap<>();
    List<Integer> list=new ArrayList<>();
     Random random=new Random();
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))return false;
        else {
            list.add(val);
            map.put(val,list.size()-1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))return false;
        else{
            int idx=map.get(val);
            int swap=list.get(list.size()-1);
            list.set(idx,swap);
            map.put(swap,idx);

            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
    }
    
    public int getRandom() {
        int N=random.nextInt(list.size());
        return list.get(N);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */