class Solution {
    public String frequencySort(String s)
    {
        HashMap<Character, Integer> charFrequency = new HashMap<Character,Integer>();
        for (Character ch: s.toCharArray())
        {
            //if hashmap does not contain ch add 1 (0+1) to the map
            //if hashmap contains the value, increment value by 1
            charFrequency.put(ch,charFrequency.getOrDefault(ch,0)+1);
        }
        //The lambda function will take two Integers as input parameters, subtract them from each other, 
        //and return the arithmetic result. The lambda function implements the Functional Interface,                     //Comparator<T>
        PriorityQueue<Character> prioQueue = new PriorityQueue<>((a,b)->charFrequency.get(b)-charFrequency.get(a));
        prioQueue.addAll(charFrequency.keySet());

        StringBuilder result = new StringBuilder();

        while(!prioQueue.isEmpty())
        {
            char ch = prioQueue.remove();
            //append ch number of frequency times
            for(int i=0; i<charFrequency.get(ch); i++)
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
}