class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabetCount = new int[26];
        
        for(Character a: s.toCharArray())
        {
            alphabetCount[a-'a']++;
        }
        for(Character a: t.toCharArray())
        {
            alphabetCount[a-'a']--;
            if(alphabetCount[a-'a']<0)
            {
                return false;
            }
        }
        for(int i: alphabetCount)
        {
            if(i!=0)
                return false;
        }
        return true;
    }
}
