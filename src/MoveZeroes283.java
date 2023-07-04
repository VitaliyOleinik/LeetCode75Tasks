import java.util.Arrays;

public class MoveZeroes283 {

    private static void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i > 1 ; i--) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
