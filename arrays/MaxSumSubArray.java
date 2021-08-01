import java.io.*;
// Kadane's algorithm
// Sliding window
/*
 * So we have two choices: either start at the current index or add the current element to the previous sum.
And since we want the maximum subarray sum, we add the current element to the maximum of 0 and previous sum 
(zero here denotes that we’re starting anew from the current element).
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax=nums[0];
        int maxSoFar=nums[0];
        
        for(int k=1;k<nums.length;k++)
        {
            currentMax=Math.max(nums[k], currentMax+nums[k]);
            maxSoFar=Math.max(currentMax, maxSoFar);
        }
        
        return maxSoFar;
    }
}
