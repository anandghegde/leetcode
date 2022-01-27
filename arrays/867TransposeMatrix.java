class Solution {
 
    public int[][] transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int i=0;i<=matrix.length-1;i++)
        {
            for(int j=0;j<=matrix[0].length-1;j++)
            {
                //System.out.println("matrix i-j"+matrix[i][j] + "and "+matrix[j][i]);
                newMatrix[j][i]=matrix[i][j];
                //System.out.println("matrix i-j"+matrix[i][j] + "and "+matrix[j][i]);
            }
        }
        return newMatrix;
    }
}
