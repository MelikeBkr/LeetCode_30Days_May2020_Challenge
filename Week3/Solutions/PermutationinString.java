class Solution {
 public static boolean checkInclusion(String s1, String s2) 
 {
        if (s1.length()> s2.length() || s1.length() == 0 || s2.length()==0)
        {
            return false;
        }
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];

        //get first s1.length() elements from s1 into s1Arr and from s2 into s2Arr
        for (int i = 0; i < s1.length(); i++) {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }

        //compare if first s1.length() elements in both arrays are equal
        if (Arrays.equals(s1Arr,s2Arr)) {
            return true;
        }

        //slide window 
        for (int i = s1.length(); i < s2.length(); i++)
        {
            s2Arr[s2.charAt(i-s1.length()) - 'a']--;
            s2Arr[s2.charAt(i) - 'a']++;

            if (Arrays.equals(s1Arr,s2Arr))
            {
                return true;
            }

        }

        return false;
    }

}