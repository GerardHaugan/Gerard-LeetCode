public class Solution {
    public bool ContainsDuplicate(int[] nums) {
      // Use Set
      HashSet<int> set = new HashSet<int>();

      // loop input
      foreach (int num in nums)
      {
          if (set.Contains(num))
          {
            return true;
          }
          else
          {
            set.Add(num);
          }
      }

      return false;
    }
}
