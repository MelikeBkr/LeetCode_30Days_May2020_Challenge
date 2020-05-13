class Solution {
    public String removeKdigits(String num, int k)
    {
        if(num.length()==k)
        {
            return "0";
        }
        if(k==0)
        {
            return num;
        }
        StringBuilder numBuilder = new StringBuilder(num);

        //iterate k times
        for(int i=0;i<k; i++)
        {
            int index=0;
            //if the current num is smaller or equal to next number then 
            // iteration cursor should be moved forward
            while (index < numBuilder.length() - 1 && numBuilder.charAt(index) <= numBuilder.charAt(index + 1))
            {
                index++;
            }
            
            //if the current num is greater than the next number then
            //the number at this index should be deleted
            numBuilder.delete(index,index+1);
        }

        //check the output must not contain leading zeroes
        while (numBuilder.length() > 1 && numBuilder.charAt(0) == '0')
        {
            numBuilder.delete(0, 1);
        }

        if (numBuilder.length() == 0) {
            return "0";
        }

        return numBuilder.toString();
    }
}