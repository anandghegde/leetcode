class Solution {
    public void setZeroes(int[][] matrix) {
        
        Set<Integer> rowsWithZeroes = new HashSet<Integer>();
        Set<Integer> columnsWithZeroes = new HashSet<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    rowsWithZeroes.add(i);
                    columnsWithZeroes.add(j);
                }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(rowsWithZeroes.contains(i) || columnsWithZeroes.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        return;
    }
}
