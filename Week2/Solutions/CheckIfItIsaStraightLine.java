class Solution {
    public boolean checkStraightLine(int[][] coordinates)
    {
        int[] firstPoint = coordinates[0];
        int[] secondPoint = coordinates[1];
        float slope = slope(firstPoint, secondPoint);

        for(int i=1; i<coordinates.length; i++)
        {
            int[] p1 = coordinates[0];
            int[] p2 = coordinates[i];
            float currentSlope = slope(p1,p2);
            if(currentSlope != slope)
            {
                return false;
            }
        }
        return true;
    }
    public float slope(int[] point1, int[] point2)
    {
        //check to avoid the denominator being zero
        if(point2[0]-point1[0]==0)
        {
            return 0;
        }
        return (float)(point2[1]-point1[1])/(point2[0]-point1[0]);
    }
}