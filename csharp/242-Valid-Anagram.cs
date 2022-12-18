public class Solution {
    public bool IsAnagram(string s, string t) {
        int[] arr_letters = new int[26];

        if (s.Length != t.Length) return false;

        for (int i = 0; i < s.Length; i++)
        {
            arr_letters[s[i] - 'a']++;
            arr_letters[t[i] - 'a']--;
        }

        foreach (int letter in arr_letters)
        {
            if (letter != 0) return false;
        }

        return true;
    }
}
