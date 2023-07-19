import java.util.Arrays;

public class UniqueNumberOfOccurrences1207 {
    private static boolean uniqueOccurrences(int[] arr) {
        final int K = 1000;
        int freq[] = new int[2 * K + 1];
        for (int num : arr) {
            freq[num + K] ++;
        }
        Arrays.sort(freq);
        for (int i = 0; i < 2 * K; i++) {
            if (freq[i] != 0 && freq[i] == freq[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }
}
