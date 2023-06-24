import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseWordsInAString151 {
    public static String reverseWords(String s) {
        boolean needSpace = true;
        char[] array = s.trim().toCharArray();
        Stack<String> filo = new Stack<>();
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i <= array.length - 1; i++) {
            if ((array[i] >= 65 && array[i] <= 90) || (array[i] >= 97 && array[i] <= 122)
                    || (array[i] >= 48 && array[i] <= 57)) {
                arr.append(array[i]);
                needSpace = true;
            }
            if ((array[i] == 32 || i == array.length - 1) && needSpace) {
                filo.push(arr.toString());
                arr = new StringBuilder();
                needSpace = false;
            }
        }
        StringBuilder result = new StringBuilder();
        while (!filo.empty()) {
            result.append(filo.peek()).append(" ");
            filo.pop();
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the      sky     is   blue"));
    }
}
