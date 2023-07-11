import java.util.Arrays;

public class MaximumNumberOfVowelsInASubstringOfGivenLength1456 {

    private static int maxVowels(String s, int k) {

        int n = s.length();
        int maxVowels = 0;
        int count = 0;

        int[] vowels = new int[128];
        vowels['a'] = 1;
        vowels['e'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['u'] = 1;

        for (int i = 0; i < k; i++) {
            count += vowels[s.charAt(i)];
        }

        maxVowels = count;
        for (int i = k; i < n; i++) {
            count += vowels[s.charAt(i)] - vowels[s.charAt(i - k)];
            maxVowels = Math.max(maxVowels, count);
            if (maxVowels == k) {
                return maxVowels;
            }
        }
        return maxVowels;

        /*char[] chars = s.toCharArray();
        int cnt = 0;
        int max = 0;
        for (int i = 0; i <= chars.length - 1; i ++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt ++;
                if (cnt > max) {
                    max = cnt;
                }
            } else {
                cnt = 0;
            }
        }
        return max;*/
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
}
