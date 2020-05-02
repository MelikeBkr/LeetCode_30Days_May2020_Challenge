/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) 
    {
        return firstBadVerHelper(1,n);
    }
    public int firstBadVerHelper(int start, int end)
    {
        if(start==end)
        {
            return start;
        }
        
        int mid = start+(end-start)/2;
        if(isBadVersion(mid))
        {
            return firstBadVerHelper(start,mid);
        }
        return firstBadVerHelper(mid+1,end);
    }
}