/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

public class Solution {
    public int majorityElement(int[] nums) {
        if(nums==null)
        {
            return 0;
        }
        else
        {
            if(nums.length==1)
            {
                return nums[0];
            }
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
    }
}