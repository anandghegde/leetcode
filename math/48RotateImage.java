class Solution {
    
    private void transpose(int[][] matrix)
    {
        for(int i=0;i<=matrix.length-1;i++)
        {
            for(int j=i;j<=matrix[0].length-1;j++)
            {
                int t1 = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t1;
            }
        }
    }
    
    private void reverse(int[][] matrix)
    {
        for(int i=0;i<=matrix.length-1;i++)
        {
            int t=matrix[i].length-1;
            int j=0;
            
            while(j<=t/2)
            {
                int k=matrix[i][j];
                matrix[i][j]=matrix[i][t-j];
                matrix[i][t-j]=k;
                j++;
            }
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
}
