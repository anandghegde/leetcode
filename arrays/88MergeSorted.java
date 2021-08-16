class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(n==0)
            return;
        
        if(m==0)
        {
            nums1=nums2;
            return;
        }
            
        int k=n-1;
        int j=m-1;
        int i=m+n-1;
        //System.out.println("before starting i,j,k"+i+ " "+j+" "+ k);
        while(k>=0 && j>=0)
        {
            System.out.println("in loop i,j,k "+i+ " "+j+" "+ k);
            if(nums2[k]<nums1[j])
            {
                nums1[i]=nums1[j];
                j--;
            }
            else
            {
                nums1[i]=nums2[k];
                k--;
            }
            i--;
            
        }
        
        if(k>0)
        {
            while(k>=0)
            {
                nums1[i]=nums2[k];
                k--;
                i--;
            }
        }
        if(j>m)
        {
            while(j>=m)
            {
                nums1[i]=nums1[j];
            }
        }
        
    }
}
