import java.math.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueCharacters = new HashSet<Character>();
        
        int i=0;
        int maxLength=0;
        int j=0;
        while(j<s.length())
        {
            if(!uniqueCharacters.contains(s.charAt(j)))
            {
                uniqueCharacters.add(s.charAt(j));
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            }
            else
            {
                uniqueCharacters.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
