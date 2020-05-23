class Solution {
    public static int[][] intervalIntersection(int[][] A, int[][] B)
    {
        List<int[]> result = new ArrayList();

        int i = 0, j = 0;
        while (i < A.length && j < B.length)
        {
            //get the max of start index
            int startIndex = Math.max(A[i][0],B[j][0]);
            //get the min of start index to find max intersection
            int endIndex= Math.min(A[i][1], B[j][1]);
            
            //It also encloses the case where start and endIndex are equal.
            if(startIndex<=endIndex)
            {
                result.add(new int[]{startIndex, endIndex});
            }
            //For the case that the pair in A is compared with more than one pair in B,
            //or vice versa
            if (A[i][1] < B[j][1])
            {
                i++;
            }

            else
            {
                j++;
            }
        }
            return result.toArray(new int[result.size()][]);
        }
}