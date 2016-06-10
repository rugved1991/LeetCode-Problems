/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/
public class Solution {
    public String reverseString(String s) {
        
        if(s==null)
        {
            return null;
        }
        else
        {
            char[] str=s.toCharArray();
            int start=0;
            int end=str.length-1;
            char temp;
            while(start<end)
            {
                temp=str[start];
                str[start]=str[end];
                str[end]=temp;
                
                start++;
                end--;
            }
            return new String(str);
        }
        
    }
}