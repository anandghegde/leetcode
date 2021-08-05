class Solution {
    public int[] plusOne(int[] digits) {
        //start with one because we're diong plusOne
        int carry=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i] + carry >=10)
            {
                digits[i]=0;
                carry=1;
            }
            else
            {
                digits[i] = digits[i]+carry;
                carry=0;
            }
        }
        if(carry==1)
        {
            int[] b = new int[digits.length+1];
            for(int i=digits.length;i>0;i--)
            {
                b[i]=digits[i-1];
            }
            b[0]=1;
            return b;
        }
        else{
            return digits;
        }
        
    }
}
