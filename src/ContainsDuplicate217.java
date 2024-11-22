import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums) {
                if (!set.add(num)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}
