import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false;

            Map<Character, Character> charMapping = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char original = s.charAt(i);
                char replacement = t.charAt(i);

                if (!charMapping.containsKey(original)) {
                    if (!charMapping.containsValue(replacement)) {
                        charMapping.put(original,replacement);
                    } else {
                        return false;
                    }
                } else {
                    char mappedChar = charMapping.get(original);
                    if (mappedChar != replacement) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("aab", "aab"));
        System.out.println(solution.isIsomorphic("foo", "bar"));
        System.out.println(solution.isIsomorphic("paper", "title"));
    }
}
