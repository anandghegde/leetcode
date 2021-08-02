class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        Map<Character, Character> openCloseMatches = new HashMap<Character, Character>();
        
        openCloseMatches.put('}','{');
        openCloseMatches.put(')','(');
        openCloseMatches.put(']','[');
        
        for(Character s1 : s.toCharArray())
        {
            if(s1 == '(' || s1 == '{' || s1 == '[' )
                st.push(s1);
            
            if(s1 == ')' || s1 == '}' || s1 == ']' )
            {
                if(st.isEmpty())
                    return false;
                
                Character s2 = st.pop();
                if(s2==null || s2 != openCloseMatches.get(s1))
                {
                    return false;
                }
            }
            
        }
        return st.isEmpty();
        
    }
}
