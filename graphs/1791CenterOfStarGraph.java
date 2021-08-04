class Solution {
    public int findCenter(int[][] edges) {
        int c1=edges[0][0];
        int c2=edges[0][1];
        int center=c1;
        for(int k=1;k<edges.length;k++)
        {
            if(edges[k][0]==center || edges[k][1]==center)
            {
                
                continue;
            }
            else
            {
                center=c2;
                break;
            }
        }
        if(center!=c1)
        {
            for(int k=1;k<edges.length;k++)
            {
                if(edges[k][0]==center || edges[k][1]==center)
                {
                
                    continue;
                }
               else
                {
                    center=-1;
                    break;
                 }
            }   
        }
        return center;
        
        
    }
}
