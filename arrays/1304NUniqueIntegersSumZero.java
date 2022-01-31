class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        
        int left=0;
        int right=n-1;
        int start=1;
        while(left<right)
        {
            res[left++]=start;
            res[right--]=-start;
            start++;
        }
        if(left==right)
        {
            res[left]=0;
        }
        return res;
    }
}
