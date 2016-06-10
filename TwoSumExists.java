/*
Given an array of integers, return true if two numbers in the array add up to a specific target.


Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return true
*/
public class Solution {
    public boolean twoSum(int[] nums, int target) {
        
        
        int i=0;
        int j=nums.length-1;
        int sum=0;
        
        Arrays.sort(nums);
        
        while(i<j)
        {
            sum=nums[i]+nums[j];
            if(sum==target)
            {
                return true;
            }
            else if(sum>target)
            {
                j--;
            }
            else if(sum<target)
            {
                i++;
            }
            i++;
            j--;
        }
        return false;
    }
}