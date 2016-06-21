/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*/

public class Solution {
    public int romanToInt(String s) {
        
        if(s==null|| s.length()==0)
        {
            return 0;
        }
        
        HashMap<Character,Integer> hm=new HashMap();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int result=hm.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
        {
            if(hm.get(s.charAt(i+1)) <= hm.get(s.charAt(i)))
            {
                result += hm.get(s.charAt(i));
            }
            else
            {
                result -= hm.get(s.charAt(i));
            }
        }
        return result;
    }
}