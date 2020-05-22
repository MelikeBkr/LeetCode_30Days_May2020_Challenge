class Solution {
    public String frequencySort(String s)
    {
        HashMap<Character, Integer> charFrequency = new HashMap<Character,Integer>();
        for (Character ch: s.toCharArray())
        {
            charFrequency.put(ch,charFrequency.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> prioQueue = new PriorityQueue<>((a,b)->charFrequency.get(b)-charFrequency.get(a));
        prioQueue.addAll(charFrequency.keySet());

        StringBuilder result = new StringBuilder();

        while(!prioQueue.isEmpty())
        {
            char ch = prioQueue.remove();
            for(int i=0; i<charFrequency.get(ch); i++)
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
}