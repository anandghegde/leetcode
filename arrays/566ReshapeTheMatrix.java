class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int mrows = mat.length;
        int ncols = mat[0].length;
        
        int total = mrows*ncols;
        if(total!=r*c)
            return mat;
        
        int[][] newMat = new int[r][c];
        int elNumber = 0;
        int m=0;
        int n=0;
        int p=0;
        int q=0;
        while(elNumber<total)
        {
            newMat[m][n]=mat[p][q];
            if(n<c-1)
            {
                n++;
            }
            else
            {
                n=0;
                m++;
            }
            if(q<ncols-1)
            {
                q++;
            }
            else
            {
                q=0;
                p++;
            }
            elNumber++;
        }
        return newMat;
    }
}
