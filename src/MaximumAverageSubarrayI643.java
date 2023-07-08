public class MaximumAverageSubarrayI643 {

    private static double findMaxAverage(int[] nums, int k) {

        double globalMax = Double.NEGATIVE_INFINITY; // Decision holder, which will be compared against localMax
        double localMax = 0; // Sum of one group of k elements


        // Iterate through the whole array elements
        for (int i = 0; i < nums.length; ++i) {

            // Add up all k elements of a particular group
            localMax += nums[i];
            // If k number of elements are summed up
            // check whether their average is greater than the max average so far
            if (i >= k - 1) {
                // if so, new max average will be assigned
                globalMax = Math.max(globalMax, localMax / k);
                // In order to calculate new k number of elements
                // remove first value of 1....k elements from the localMax
                localMax -= nums[i - k + 1];
            }
        }
        // Going to be maximum average
        return globalMax;

        // Time Limit Exceeded
        /*double sum = 0;
        double avg = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - 1; i ++) {
            if (i + k <= nums.length) {
                int temp = k;
                int j = 0;
                while (k != 0) {
                    sum += nums[i + j];
                    j = j + 1;
                    k --;
                }
                k = temp;
                double maybeMax = sum / k;
                if (maybeMax > avg) {
                    avg = maybeMax;
                }
                sum = 0;
            }
        }
        return avg;*/
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.printf("%.5f", findMaxAverage(nums, k));
    }
}
