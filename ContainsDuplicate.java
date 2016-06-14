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