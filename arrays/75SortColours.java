class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        
        int index=0;
        
        while(index<=j)
        {
            System.out.println("start: i,j,index- "+i+ " "+j+ " "+ index);
            if(nums[index]==0)
            {
                nums[index]=nums[i];
                nums[i]=0;
                i++;
            }
            if(nums[index]==2)
            {
                nums[index]=nums[j];
                nums[j]=2;
                j--;
                index--;
                
            }
            index++;
            System.out.println("end: i,j,index- "+i+ " "+j+ " "+ index);
            System.out.println("end: array is"+Arrays.toString(nums));
        }
    }
}
