/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1==null&&nums2==null)
        {
            return nums1;
        }
        if(nums1.length==0)
        {
            return nums1;
        }
        if(nums2.length==0)
        {
            return nums2;
        }
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> l=new ArrayList<Integer>();
        
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                l.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        
        int[] result=new int[l.size()];
        for(int a=0;a<l.size();a++)
        {
            result[a]=l.get(a);
        }
        
        return result;
    }
}