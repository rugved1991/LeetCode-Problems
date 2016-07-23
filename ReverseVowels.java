/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
*/

public class Solution {
    public String reverseVowels(String s) {
        
        if(s==null)
        {
            return s;
        }
        
        ArrayList<Character> vowels=new ArrayList();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        int i=0;
        int j=s.length()-1;
        
        char[] arr=s.toCharArray();
        
        while(i<j)
        {
            if(!vowels.contains(arr[i]))
            {
                i++;
                continue;
            }
            if(!vowels.contains(arr[j]))
            {
                j--;
                continue;
            }
            
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }
        return new String(arr);
    }
}