class Solution {
    public int numIslands(char[][] grid) {
        
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    dunkRestOfTheIslandIntoWater(grid, i,j);
                }
            }
        }
        return count;
    }
    
    private void dunkRestOfTheIslandIntoWater(char[][] grid, int m,int n)
    {
        if(m<0 || n<0
          || m>=grid.length || n>=grid[0].length
          ||  grid[m][n]=='0')
            return;
        
        grid[m][n]='0';
        dunkRestOfTheIslandIntoWater(grid, m+1, n);
        dunkRestOfTheIslandIntoWater(grid, m-1, n);
        dunkRestOfTheIslandIntoWater(grid, m, n-1);
        dunkRestOfTheIslandIntoWater(grid, m, n+1);
    }
}
