public class IsSubsequence392 {
    private static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int tLength = t.length();
        int mLength = s.length();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (mLength < 1) {
            return true;
        }

        while (i < tLength) {
            if (tArr[i] == sArr[j]) {
                j ++;
            }
            i ++;

            if (j == mLength) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "afsdfbdfsdfsc"));
    }
}
