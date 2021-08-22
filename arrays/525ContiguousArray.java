class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> sumToIndex = new HashMap<Integer, Integer>();
        
        int max=0;
        int sum=0;
        sumToIndex.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum += ((nums[i]==0) ? -1:1);
            System.out.println("current sum is "+sum);
            if(sumToIndex.containsKey(sum))
            {
                max = Math.max(max, i - sumToIndex.get(sum));
            }
            else
            {
                sumToIndex.put(sum, i);
            }
        }
        return max;
    }
}
