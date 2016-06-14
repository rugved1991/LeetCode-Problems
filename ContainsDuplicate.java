/*
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums==null)
        {
            return false;
        }
        else
        {
            HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++)
            {
                if(hm.containsKey(nums[i]))
                {
                    return true;
                }
                else
                {
                    hm.put(nums[i],i);
                }
            }
            return false;
        }
    }
}