import java.util.Arrays;

public class DetermineIfTwoStringsAreClose1657 {
    private static boolean closeStrings(String word1, String word2) {
        // count the English letters
        int alphabet = 26;
        int[] arr1 = new int[alphabet], arr2 = new int[alphabet];
        for (char ch : word1.toCharArray())
            arr1[ch - 'a']++;
        for (char ch : word2.toCharArray())
            arr2[ch - 'a']++;
        // if one has a letter which another one doesn't have, dont exist
        for (int i = 0; i < alphabet; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            }
            if (arr1[i] == 0 || arr2[i] == 0) {
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < alphabet; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
    }
}
