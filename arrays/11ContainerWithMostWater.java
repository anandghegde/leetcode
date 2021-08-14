class Solution {
    public int maxArea(int[] height) {
        int currentArea=0;
        int maxArea=0;
        int j=0;
        int k=height.length-1;
        while(j<k)
        {
            currentArea = (k-j)*Math.min(height[k],height[j]);
            if(currentArea>maxArea)
            {
                maxArea = currentArea;
            }
            if(height[k]>height[j])
            {
                j++;
            }
            else
            {
                k--;
            }
        }
        
        return maxArea;
    }
}
