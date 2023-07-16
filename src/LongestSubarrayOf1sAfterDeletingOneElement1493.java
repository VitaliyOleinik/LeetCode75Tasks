public class LongestSubarrayOf1sAfterDeletingOneElement1493 {
    private static int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int longestWindow = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            zeroCount += (nums[i] == 0 ? 1 : 0);

            while (zeroCount > 1) {
                zeroCount -= (nums[start] == 0 ? 1 : 0);
                start++;
            }

            longestWindow = Math.max(longestWindow, i - start);
        }

        return longestWindow;
    }

    public static void main(String[] args) {
        int[] nums = new int []{1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
}
