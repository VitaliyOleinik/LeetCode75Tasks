import java.util.Arrays;
import java.util.Objects;

public class MergeStringsAlternately1768 {
    private static String mergeAlternately(String word1, String word2) {
        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();
        int cnt = Math.max(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= cnt - 1; i++) {
            if (i >= first.length) {
                result.append(second[i]);
            } else if (i >= second.length) {
                result.append(first[i]);
            } else {
                result.append(first[i]).append(second[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }
}

/*Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s*/