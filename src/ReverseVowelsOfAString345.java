public class ReverseVowelsOfAString345 {
    public static String reverseVowels(String s) {
        var array = s.toCharArray();
        var arrayLength = array.length;
        char temp1;
        char temp2;
        int index1;
        int index2;
        for (int i = 0; i < arrayLength / 2; i++) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
                temp1 = array[i];
                index1 = i;
            }
            if (array[arrayLength - i - 1] == 'a' || array[arrayLength - i - 1] == 'e'
                    || array[arrayLength - i - 1] == 'i' || array[arrayLength - i - 1] == 'o'
                    || array[arrayLength - i - 1] == 'u') {
                temp2 = array[arrayLength - i - 1];
                index2 = arrayLength - i - 1;
                temp1 =
            }
            if (temp1)
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
