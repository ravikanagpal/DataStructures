package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class SlidingWindowHashMap {

    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    /**
     * Time complexity : O(n). Index j will iterate n times.
     *
     * Space complexity (HashMap) : O(min(m, n)).
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

}
