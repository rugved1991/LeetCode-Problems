/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/
public class Solution {
      public int[] intersection(int[] nums1, int[] nums2) {
	        
	        if (nums1.length == 0 && nums2.length==0)
	        return nums1;
	        
	        if(nums1.length == 0)
	        return nums1;
	        
	        if(nums2.length == 0)
	        return nums2;
	        
	        Set<Integer> s = new HashSet<Integer>();
	        
	        for(int n : nums1){
	            s.add(n);
	        }
	        List<Integer> l = new ArrayList<Integer>();
	        for(int n : nums2){
	        	if(s.remove(n)){
	        		l.add(n);
	        	}
	        }
	        int [] result = new int[l.size()];
	        for(int i=0;i<l.size();i++){
	        	result[i] = l.get(i);
	        }
	        return result;
    }
}