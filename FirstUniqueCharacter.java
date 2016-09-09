/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/


public class Solution {
    public int firstUniqChar(String s) {
        
        if(s==null)
        {
            return -1;
        }
        /*
        int[] freq=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        */
        
        HashMap<Character,Integer> hashMap=new HashMap();
       
        for(int i=0;i<s.length();i++)
        {
           if(hashMap.containsKey(s.charAt(i)))
           {
               int count=hashMap.get(s.charAt(i));
               hashMap.put(s.charAt(i),++count);
           }
           else
           {
               hashMap.put(s.charAt(i),1);
           }
        }
       
        for(int i=0;i<s.length();i++)
        {
           if(hashMap.get(s.charAt(i))==1)
           {    
               return i;
           }
        }
        return -1;
    }
    
    
    
}