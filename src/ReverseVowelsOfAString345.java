import java.util.Arrays;

public class ReverseVowelsOfAString345 {
    private static String reverseVowels(String s) {
        var array = s.toCharArray();
        var arrayLength = array.length;
        char temp1 = 'b';
        char temp2 = 'b';
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arrayLength / 2; i++) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u'
            || array[i] == 'A' || array[i] == 'E' || array[i] == 'I' || array[i] == 'O' || array[i] == 'U') {
                temp1 = array[i];
                index1 = i;
            }
            if (array[arrayLength - i - 1] == 'a' || array[arrayLength - i - 1] == 'e'
                    || array[arrayLength - i - 1] == 'i' || array[arrayLength - i - 1] == 'o'
                    || array[arrayLength - i - 1] == 'u' || array[arrayLength - i - 1] == 'A'
                    || array[arrayLength - i - 1] == 'E' || array[arrayLength - i - 1] == 'I'
                    || array[arrayLength - i - 1] == 'O' || array[arrayLength - i - 1] == 'U') {
                temp2 = array[arrayLength - i - 1];
                index2 = arrayLength - i - 1;
            }
            if (temp1 != 'b' && temp2 != 'b') {
                char temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
                temp1 = 'b';
                temp2 = 'b';
            }
        }
        return new String(array);
    }

    public static void main(String[] args) {
        String test1 = "Euston saw I was not Sue.";
        //             "Eestun sow a wIs nat Sou."
        System.out.println(reverseVowels(test1));
    }
}
