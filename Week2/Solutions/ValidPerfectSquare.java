class Solution {
    public boolean isPerfectSquare(int num)
    {
        if(num==0)
        {
            return false;
        }
        
        if(num==1)
        {
            return true;
        }
        
        
        long i = 1;
        while (i * i < num) 
        {
            i++;
            if (i * i == num)
            {
                return true;
            }
        }
        return false;
    }
}