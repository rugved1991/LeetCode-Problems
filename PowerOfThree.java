/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
*/

public class Solution {
    public boolean isPowerOfThree(int n) {
        
        /*
        //With Loop
        if(n<=0)
        {
            return false;
        }
        
        while(n!=1)
        {
            if(n%3!=0)
            {
                return false;
            }
            n=n/3;
        }
        return true;*/
        
        //Without loop
        if(n<1)
        {
            return false;
        }
        int log = (int)(Math.log10(n)/Math.log10(3));
        if((int)Math.pow(3,log)==n)
        {
            return true;
        }
        return false;
        
    }
}