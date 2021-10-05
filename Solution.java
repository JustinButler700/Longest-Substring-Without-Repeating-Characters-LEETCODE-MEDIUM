// Justin Butler 10/5/2021
class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        if(s.length()==1){return 1;} // edge case wher s = "a" or " " etc...
        int length = 0;
        for(int i = 0; i < s.length(); i++) // brute force technique
        {
            HashSet<Character> curr = new HashSet();
            for(int k =i; k < s.length()-1; k++)
            {
                curr.add(s.charAt(k));
                // this if statement handles case where all elements are unique
                if(k+1 == s.length()-1 && !curr.contains(s.charAt(k+1)))
                {
                    curr.add(s.charAt(k+1));
                }
                if(curr.contains(s.charAt(k+1)))
                {
                    break;
                }
            }
            if(length <= curr.size())
            {
                length = curr.size();
            }
        }
        return length;
    }
}
