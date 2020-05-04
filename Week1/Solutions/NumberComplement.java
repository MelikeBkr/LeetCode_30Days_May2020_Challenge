    public int findComplement(int num)
    {
        //Find relation with output and input
        //xor num with already "xor"ed value
        //and it will return bitwise complement of the num
        int result;
        int xorVal = 1;
        while (num > xorVal)
        {
            xorVal = xorVal * 2 + 1;
        }
        result = num ^ xorVal;

        return result;
    }