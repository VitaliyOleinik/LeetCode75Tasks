public class StringCompression443 {

    private static int compress(char[] chars) {
        int j = 0, count = 1;

        for(int i = 1; i < chars.length + 1; ++i) {
            if(i == chars.length || chars[i] != chars[i - 1]) {
                chars[j++] = chars[i - 1];

                if(count > 1) {
                    String s = count + "";

                    for(int k = 0; k < s.length(); ++k)
                        chars[j++] = s.charAt(k);
                }

                count = 1;
            } else {
                count++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c', 'd'};
        System.out.println(compress(chars));
    }
}
