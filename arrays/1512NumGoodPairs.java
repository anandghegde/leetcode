class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int a : nums)
        {
            if(count.containsKey(a))
            {
                count.put(a, count.get(a)+1);
            }
            else
            {
                count.put(a, 1);
            }
        }
        int numGoodPairs=0;
        
        for(int a: count.keySet())
        {
            int numOfOccurences = count.get(a);
            numGoodPairs += (numOfOccurences*(numOfOccurences-1))/2;
        }
        return numGoodPairs;
    }
}
