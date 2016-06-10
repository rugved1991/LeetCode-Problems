/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums==null || nums.length<2)
        {
            return null;
        }
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
        
        int[] a=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                int ind1=i;
                int ind2=hm.get(target-nums[i]);
                if(ind1==ind2)
                {
                    continue;
                }
                a[0]=ind1;
                a[1]=ind2;
                return a;
            }
        }
        return a;
    }
}