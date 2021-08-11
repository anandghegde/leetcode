class Solution {
    public int minPathSum(int[][] grid) {
        int[][] p = new int[grid.length][grid[0].length];
      
        
        for(int i=0;i<=grid.length-1;i++)
        {
            for(int j=0;j<=grid[0].length-1;j++)
            {
                if(i==0 && j==0)
                    p[0][0]=grid[0][0];
                
                else if(i==0)
                {
                    p[0][j]=p[0][j-1]+grid[0][j];
                }
                
                else if(j==0)
                {
                    p[i][0]=p[i-1][0]+grid[i][0];
                }
                
                else
                {
                    p[i][j]=Math.min(p[i-1][j]+grid[i][j], p[i][j-1]+grid[i][j]);    
                }
                
                
            }
            
        }
        
        return p[grid.length-1][grid[0].length-1];
        
        
    }
}
