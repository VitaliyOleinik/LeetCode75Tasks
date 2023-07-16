public class MaxConsecutiveOnesIII1004 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1,0,0,1,1,1,0};
        int k = 2;

        int start = 0;
        int end = 0;
        int zeros = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeros++;
            }
            end++;
            if (zeros > k) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
        }
        System.out.println(end - start);
    }
}
