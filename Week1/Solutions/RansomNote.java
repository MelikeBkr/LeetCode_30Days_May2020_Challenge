class Solution {
    public boolean canConstruct(String ransomNote, String magazine)
    {
        //int array to store the count of all lowercase letters
        int[] arr = new int[26];

        for(char element:magazine.toCharArray())
        {
            //ASCII code of 'a' is 097
            // substract ASCII code of 'a'
            // from ASCII code of current letter
            // to not exceed the (arr) array size
            ++arr[element-'a'];
        }
        for(char element:ransomNote.toCharArray())
        {
            if(--arr[element-'a']<0)
            {
                return false;
            }
        }
        return true;
    }
}