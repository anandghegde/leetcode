class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //System.out.println("input is "+Arrays.toString(nums));
        int target = 0;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]>target)
            {
                //System.out.println("returning because nums[i]"+i+"is greater than target");
                return res;
            }
                
            
            if(i>0 && i<nums.length-2 && nums[i]==nums[i-1])
            {
                //System.out.println("incrementing i because nums[i]:"+nums[i]+" and nums[i-1]"+nums[i-1]);
                continue;
            }
                
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k && j<=nums.length-2 && k>i+1)
            {
                
                if(j!=i+1 && nums[j]==nums[j-1])
                {
                    //System.out.println("incrementing j"+j);
                    j++;
                    continue;
                }
               
                /*
                while(k>=i+2 && nums[k]==nums[k-1])
                {
                    System.out.println("decrementing k"+k);
                    k--;
                }
                */
                //System.out.println("nums are "+nums[i]+" ,"+nums[j]+ ", "+nums[k]);     
                int t = nums[i]+nums[j]+nums[k];
                if(t==target)
                {
           
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    //k--;
                }
                else if(t < target)
                {
                    j++;
                    //System.out.println("incrementing j because def"+j);
                }
                else if(t> target)
                {
                    k--;
                    //System.out.println("decrementing k because efficient"+k);
                }
            }
                
        }
        return res;
    }
}
