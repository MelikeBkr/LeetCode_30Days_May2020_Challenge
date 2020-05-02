class Solution {
    public int numJewelsInStones(String J, String S)
    {
        int counter =0;
        char[] ch = S.toCharArray();
        for(char c:ch)
        {
            if (J.indexOf(c) != -1) {
                counter++;
            }

        }
        return counter;
    }
}