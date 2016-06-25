/*
Given an integer, write a function to determine if it is a power of two.
*/

public class Solution {
    public boolean isPowerOfTwo(int n) {
        
        /*
        //With Loop
        if(n<1)
        {
            return false;
        }
        
        while(n!=1)
        {
            if(n%2!=0)
            {
                return false;
            }
            n=n/2;
        }
        return true;*/
        
        //Without loop
        if(n>0 && ((n & (n-1))==0))
        {
            return true;
        }
        return false;
    }
}