/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s!=null&&t!=null)
        {
            if(s.length() != t.length())
            {
                return false;
            }
            else
            {
                char[] str1=s.toCharArray();
                char[] str2=t.toCharArray();
                Arrays.sort(str1);
                Arrays.sort(str2);
                int i=0;
                while(i<str1.length)
                {
                    if(str1[i]==str2[i])
                    {
                        i++;
                    }
                    else
                    {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}