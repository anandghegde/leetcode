class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> romanToDecimal = new HashMap<Character, Integer>();
        
        romanToDecimal.put('I', 1);
        romanToDecimal.put('V', 5);
        romanToDecimal.put('X', 10);
        romanToDecimal.put('L', 50);
        romanToDecimal.put('C', 100);
        romanToDecimal.put('D', 500);
        romanToDecimal.put('M', 1000);
        
        int roman=0;
        for(int i=0;i<=s.length()-1;i++) 
        {
            Character current = s.charAt(i);
            int nextI = i+1;
            if(i>=s.length()-1)
                nextI=i;
            Character next = s.charAt(nextI);
            int v1 = romanToDecimal.get(current);
            int v2 = romanToDecimal.get(next);
            System.out.println("comparing v1 :"+v1+"and v2: "+v2);
            if(v1 < v2)
            {
                roman = roman - v1;
            }
            else
            {
                roman = roman + v1;
            }
            
        }
        return roman;
        
    }
}
