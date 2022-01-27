class Solution {
    public int titleToNumber(String columnTitle) {
        char[] charsInString = columnTitle.toCharArray();
        
        int currentSum=0;
        int placeValue=1;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            currentSum += (charsInString[i] - 'A' + 1)*placeValue;
            placeValue = placeValue*26;
        }
        return currentSum;
    }
}
