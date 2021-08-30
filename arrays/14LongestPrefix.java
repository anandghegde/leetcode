class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length-1];
        
        int c=0;
        while(c<first.length() && first.charAt(c)==last.charAt(c))
            c++;
        
        if(c==0)
            return "";
        
        return first.substring(0,c);
        
        
    }
}
// revisign, sort the strings and compare first and last
