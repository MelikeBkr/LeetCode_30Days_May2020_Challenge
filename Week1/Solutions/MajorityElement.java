public class Solution {

    public int majorityElement(int[] nums)
    {
        int n = nums.length;
        int avg = n/2;
        HashMap<Integer, Integer> countMap = new HashMap<Integer,Integer>();

        for(int key : nums)
        {
            if(!countMap.containsKey(key))
            {
                countMap.put(key,1);
            }
            else
            {
                countMap.put(key, countMap.get(key)+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet())
        {
            if(entry.getValue()>avg)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}

//Altenative Solution
//class Solution {
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }
//}
