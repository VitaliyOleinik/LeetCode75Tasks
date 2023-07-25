import java.util.Stack;

public class RemovingStarsFromAString2390 {

    private static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar != '*') {
                stack.push(aChar);
            } else if (!stack.empty()) {
                stack.pop();
            }
        }
        s = "";
        for (Character character : stack) {
            s += character;
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}
