import java.util.Arrays;

public class IncreasingTripletSubsequence334 {

    private static boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= i) i = n;
            else if (n <= j) j = n;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{20, 100, 10, 12, 5, 13};
        System.out.println(increasingTriplet(nums));
    }
}
