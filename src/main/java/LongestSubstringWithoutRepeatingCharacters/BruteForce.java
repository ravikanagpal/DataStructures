package LongestSubstringWithoutRepeatingCharacters;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class BruteForce {

    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    /**
     *  we repeatedly check a substring to see if it has duplicate character. But it is unnecessary.
     *  If a substring s_{ij} from index i to j−1 is already checked to have no duplicate characters.
     *  We only need to check if s[j] is already in the substring s_{ij}
     * To check if a character is already in the substring, we scan the substring, which leads to an O(n^2) algorithm.
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        int result = 0;
        String curr = "";
        String max_string = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                curr += s.charAt(i);
                result++;
            } else if (curr.contains(s.charAt(i) + "")) {
                if (curr.length() > max_string.length()) {
                    max_string = curr;
                }
                curr = curr.substring(curr.indexOf(""+s.charAt(i))+1) + s.charAt(i);
                result = max_string.length();
            } else {
                curr += s.charAt(i);
            }
        }
        if(curr.length()> result){
            result = curr.length();
        }
        return result;
    }
}
