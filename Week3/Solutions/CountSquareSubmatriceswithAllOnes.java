class Solution {
    public int countSquares(int[][] matrix)
    {
        int count = 0;

        //intial case for first row
        for(int column=0; column<matrix[0].length; column++)
        {
            if(matrix[0][column]==1)
            {
                count++;
            }
        }
        //intial case for first column
        //to prevent double count (0,0), start from 1
        for(int row=1; row<matrix.length; row++)
        {
            if(matrix[row][0]==1)
            {
                count++;
            }
        }

        //check rest of the matrix
        for(int row=1; row<matrix.length; row++)
        {
            for(int column=1; column<matrix[row].length; column++)
            {
                if(matrix[row][column]!=0)
                {
                    matrix[row][column] = Math.min(matrix[row - 1][column - 1], 
                                                   Math.min(matrix[row - 1][column],
                                                             matrix[row][column - 1])) + 1;
                }
                count += matrix[row][column];
            }
        }

        return count;
    }
}