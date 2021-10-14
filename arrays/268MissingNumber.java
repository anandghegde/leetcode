class Solution {
    public int missingNumber(int[] nums) {
        int totalExpected = (nums.length *(nums.length+1))/2;
        System.out.println("totalExpected:"+totalExpected);
        
        int currentTotal=0;
        for(int i : nums)
        {
            currentTotal +=i;
            System.out.println("current:"+currentTotal);
        }
        
        return totalExpected - currentTotal;
    }
}
