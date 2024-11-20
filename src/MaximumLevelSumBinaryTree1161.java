public class MaximumLevelSumBinaryTree1161 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        private int totalLevel;
        private int sumAtLevels[] = new int[10000];
        public int maxLevelSum(TreeNode root) {
            int ans = 1;
            int maxSum = Integer.MIN_VALUE;
            maxLevelSumHelper(root, 0);
            for (int i = 0; i <= totalLevel; i ++) {
                int sum = sumAtLevels[i];
                if (sum>maxSum) {
                    maxSum = sum;
                    ans = i+1;
                }
            }
            System.gc();
            return ans;
        }

        private void maxLevelSumHelper(TreeNode node, int l) {
            if (node == null) return;
            sumAtLevels[l]+=node.val;
            totalLevel = Math.max(totalLevel, l);
            maxLevelSumHelper(node.left, l+1);
            maxLevelSumHelper(node.right, l+1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        System.out.println(solution.maxLevelSum(root1));
    }
}
