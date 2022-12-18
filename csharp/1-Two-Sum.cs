public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        /* First try
        int[] result = new int[2];
        Hashtable hashtable = new Hashtable();
        
        for (int i = 0; i < nums.Length; i++)
        {
            if (hashtable.Contains(nums[i]))
            {
                // found it
                result[0] = (int)hashtable[nums[i]];
                result[1] = i;
                
                return result;
            }
            else
            {
                hashtable[target - nums[i]] = i;
            }
        }
        
        return result;
        */

        // 2nd try 
        int[] result = new int[2];
        Hashtable table  = new Hashtable();

        //foreach (int num in nums)
        for (int i = 0; i < nums.Length; i++)
        {
            if (table.Contains(nums[i]))
            {
                // found
                result[0] = (int)table[nums[i]];
                result[1] = i;

                return result;
            }
            else
            {
                if (!table.Contains(target - nums[i]))
                    table.Add(target - nums[i], i);
            }
        }

        return null;
    }
}
