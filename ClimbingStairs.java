/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

public class Solution {
    public int climbStairs(int n) {
        
        if(n==0||n==1||n==2)
        {
            return n;
        }
        int result=0;
        int lastStep=1;
        int secondLastStep=2;
        
        for(int i=2;i<n;i++)
        {
            result=lastStep+secondLastStep;
            lastStep=secondLastStep;
            secondLastStep=result;
        }
        
        return result;
    }
}