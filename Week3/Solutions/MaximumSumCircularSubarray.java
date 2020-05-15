class Solution {
    public int maxSubarraySumCircular(int[] A)
    {
        int maxCurrent = 0;
        int maxGlobal = Integer.MIN_VALUE;
        int minCurrent = 0;
        int minGlobal= Integer.MAX_VALUE;
        int totalSum = 0;

        for(int i=0; i<A.length; i++)
        {
            totalSum += A[i];
            maxCurrent = Math.max(A[i], A[i]+maxCurrent);
            minCurrent = Math.min(A[i], A[i]+minCurrent);

            if(maxCurrent>=maxGlobal)
            {
                maxGlobal = maxCurrent;
            }
            if(minCurrent<=minGlobal)
            {
                minGlobal = minCurrent;
            }
        }
        if(maxGlobal<0)
        {
            return maxGlobal;
        }
        return Math.max(maxGlobal, (totalSum-minGlobal));
    }
}