/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom  note can be constructed from the magazines ; otherwise, it will return false. 

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

*/


public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length())
        {
            return false;
        }
        
        if(ransomNote==null || magazine==null)
        {
            return false;
        }
        
        HashMap<Character,Integer> magazineLetters=new HashMap();
        
        for(int i=0;i<magazine.length();i++)
        {
            if(magazineLetters.containsKey(magazine.charAt(i)))
            {
                int count=magazineLetters.get(magazine.charAt(i));
                magazineLetters.put(magazine.charAt(i),++count);
            }
            else
            {
                magazineLetters.put(magazine.charAt(i),1);
            }
        }
        
        for(int i=0;i<ransomNote.length();i++)
        {
            if(magazineLetters.containsKey(ransomNote.charAt(i)))
            {
                int count=magazineLetters.get(ransomNote.charAt(i));
                if(--count >= 0)
                {
                    magazineLetters.put(ransomNote.charAt(i),count);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}