public class StringCompression443 {

    private static String compress(char[] chars) {
        // test
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i+1 < chars.length && chars[i] == chars[i + 1]) {
                cnt++;
            } else if (i+1 < chars.length && cnt != 0 && chars[i] == chars[i + 1]) {
                sb.append(chars[i]);
                cnt = 0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}
