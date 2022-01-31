class Solution {
    public int majorityElement(int[] nums) {
        Integer maj=null;
        int majCount=0;
            for(int i: nums)
            {
                if(majCount==0)
                {
                    maj=i;
                }
                if(maj==i)
                {
                    majCount++;
                }
                else
                {
                    majCount--;
                }
            }
        return maj;
    }
}
