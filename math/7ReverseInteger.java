class Solution {
    public int reverse(int x) {
        int reverseX=0;
     
        while(x!=0)
        {
            int tail = x%10;
            int newReverseX = reverseX*10 + tail;
            
            if((newReverseX - tail)/10 !=reverseX)
                return 0;
            
            x=x/10;
            reverseX = newReverseX;
            
        }
        
  

        return reverseX;
    }
}
