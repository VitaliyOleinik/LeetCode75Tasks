import java.util.Arrays;

public class ReverseVowelsOfAString345 {
    private static String reverseVowels(String s) {
        StringBuilder arr = new StringBuilder();
        for (char x : s.toCharArray())
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
                arr.append(x);

        arr.reverse();

        StringBuilder str = new StringBuilder();
        int i = 0;
        for (char x : s.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
                str.append(arr.charAt(i++));
            else str.append(x);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String test1 = "Euston saw I was not Sue.";
        System.out.println(reverseVowels(test1));
    }
}
