class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle==null || haystack.length()<needle.length()) return -1;
        int i=0;
        int j=0;
        int[] lps = computeKMPTable(needle);
        while(i<haystack.length() && j<needle.length())
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;
            }
            else if(j>0)
            {
                j=lps[j-1];
            }
            else
            {
                // when j=0
                i++;
            }
        }
        
        return j == needle.length() ? i - j : -1;
        
        
    }
    
    private int[] computeKMPTable(String pattern)
    {
        int[] a = new int[pattern.length()];
        int i=0, j=1;
        
        while(j<pattern.length())
        {
            if(pattern.charAt(i)==pattern.charAt(j))
            {
                a[j]=i+1;
                j++;
                i++;
            }
            else if(i>0)
            {
                i=a[i-1];
            }
            else
            {
                a[j]=0;
                j++;
            }
        }
        return a;
    }
}
