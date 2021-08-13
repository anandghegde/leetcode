class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            indexMap.put(nums[i],i );
        }
        int[] results = new int[2];
        System.out.println(Arrays.asList(indexMap));
        for(int i=0;i<nums.length;i++)
        {
            System.out.println("printing "+nums[i]);
            
            if(indexMap.containsKey(target-nums[i]))
            {
                if(i==indexMap.get(target-nums[i]))
                    continue;
                System.out.println("putting"+i);
                System.out.println("putting"+indexMap.get(target-nums[i]));
                results[0]=i;
                results[1] = indexMap.get(target-nums[i]);
                break;
            }
        }
        return results;
    }
}
