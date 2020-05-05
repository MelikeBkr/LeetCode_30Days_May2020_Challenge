class Solution {
    public int firstUniqChar(String s)
    {
        LinkedHashMap<Character,Integer> charCountMap = new LinkedHashMap<Character,Integer>();

        int index = 0;
        for(char c: s.toCharArray())
        {
            if(!(charCountMap.containsKey(c)))
            {
                charCountMap.put(c,index);
                index++;
            }
            else
            {
                charCountMap.put(c,-1);
                index++;
                
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            if(entry.getValue()!= -1)
            {
                return entry.getValue();
            }
        }
        return -1;
    }
}