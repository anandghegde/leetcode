class TwoSum {
    private HashMap<Integer, Integer> occurences;
    public TwoSum() {
        occurences = new HashMap<Integer, Integer>();
    }
    
    public void add(int number) {
        occurences.put(number, occurences.getOrDefault(number, 0) + 1);
    }
    
    public boolean find(int value) {
       
        for(Integer x: occurences.keySet())
        {
            if(occurences.containsKey(value-x))
            {
                if(2*x==value)
                {
                    if(occurences.get(x)>=2)
                        return true;
                    else
                        continue;
                }
                return true;
            }
        }
        return false;
    }

}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
