public class ReverseWordsInAString151 {
    public static String reverseWords(String s) {
        s = s.trim();
        boolean needSpace = true;
        char[] array = s.toCharArray();
        StringBuilder arr = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i --) {
            if ((array[i] >= 65 && array[i] <= 90) || (array[i] >= 97 && array[i] <= 122)) {
                arr.append(array[i]);
                needSpace = true;
            } else if (array[i] == 32 && needSpace) {
                arr.append(" ");
                needSpace = false;
            }
        }
        return arr.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
